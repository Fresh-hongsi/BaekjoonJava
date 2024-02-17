package Algorithm;

import java.io.*;
import java.util.*;




public class Main {
	
	static int N=0;
	static int M=0;
	static ArrayList<Integer> arrayList = new ArrayList<>();	
	
	public static boolean binarySearch(int n) {
		
		int s=0;
		int e=arrayList.size()-1;
		boolean flag=false;
		
		while(s<=e) {
			int m = (s+e)/2;
			
			if(arrayList.get(m)==n) {
				flag=true;
				return flag;
			}
			else if(arrayList.get(m)>n)
			{
				e=m-1;
			}
			else 
			{
				s=m+1;
			}
			
		}
		
		return flag;
	}
    
	public static void main(String[] args) throws NumberFormatException, IOException {
    	
    	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    
    	N= Integer.parseInt(bufferedReader.readLine());
    	
    	StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
    	for(int i=0;i<N;i++) {
    		int temp = Integer.parseInt(stringTokenizer.nextToken());
    		arrayList.add(temp);
    		
    	}
    	
    	Collections.sort(arrayList);
    	
    	M=Integer.parseInt(bufferedReader.readLine());
    	stringTokenizer = new StringTokenizer(bufferedReader.readLine());
    	for(int i=0;i<M;i++) {
    		int num = Integer.parseInt(stringTokenizer.nextToken());
    		
    		boolean flag = binarySearch(num);
    		if(flag==true) {
    			bufferedWriter.write(Integer.toString(1)+'\n');
    		}
    		else {
    			bufferedWriter.write(Integer.toString(0)+'\n');
			}
    	}
    	
    	bufferedWriter.flush();
    	bufferedWriter.close();
    	
    }

}
    
   
