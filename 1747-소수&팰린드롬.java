package Algorithm;

import java.io.*;
import java.util.*;




public class Main {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		int N = Integer.parseInt(br.readLine());
		
		boolean[] arr = new boolean[1100000];
		
		for(int i=0;i<1100000;i++) {
			arr[i]=true;
		}
		
		arr[0]=false;
		arr[1]=false;
		
		for(int i=2;i<Math.sqrt(1100000);i++)
		{

			if(arr[i]==true) {
				
				for(int j=i+i;j<1100000;j+=i) {
					arr[j]=false;
				}
			}
			
			else {
				continue;
			}
			
		}
		
		for(int i=N;i<1100000;i++) {
			if(arr[i]==true && is_palindrome(i)==true) {
				bw.write(Integer.toString(i));
				break;
				
			}
		}
		
		bw.flush();
		bw.close();
	}

	private static boolean is_palindrome(int i) {
		
		String s = Integer.toString(i);
		int l = s.length();
		boolean flag = true;
		
		for(int k=0;k<l/2;k++) {
			if(s.charAt(k)!=s.charAt(l-k-1)) {
				flag=false;
				break;
			}
		}
		return flag;
	}
	

}
    
   
