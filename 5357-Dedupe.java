package Algorithm;

import java.io.*;
import java.util.*;




public class Main {
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N= Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++)
		{
			String string = br.readLine();
			
			bw.write(string.charAt(0));
			for(int j=1;j<string.length();j++)
			{
				if(string.charAt(j-1)!=string.charAt(j))
				{
					bw.write(string.charAt(j));
				}
				
				else {
					continue;
				}
			}
			
			bw.write('\n');
		}
		
		bw.flush();
		bw.close();
	}
	

}
    
   
