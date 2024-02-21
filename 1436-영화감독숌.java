package Algorithm;

import java.io.*;
import java.util.*;




public class Main {
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		long result=665;
		int count=0;
		
		while(true)
		{
			
			String tempString = Long.toString(result);
			
			for(int i=2;i<tempString.length();i++)
			{
				if(tempString.charAt(i)-'0'==6 && tempString.charAt(i-1)-'0'==6 && tempString.charAt(i-2)-'0'==6)
				{
					count++;
					break;
				}
			}
			
			if(count==N)
			{
				break;
			}
			
			result++;
		}
		
		bw.write(Long.toString(result));
		bw.flush();
		bw.close();
		
	}
}
    
   
