package Algorithm;

import java.io.*;
import java.util.*;




public class Main {
	
	
	private static int gcd(int a, int b) {
		
		if(a%b==0) {
			return b;
		}
		
		else {
			return gcd(b, a%b);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int tc = Integer.parseInt(br.readLine());
		
		for(int i=0;i<tc;i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int maximum = Math.max(a, b);
			int minimum = Math.min(a, b);
			
			int result = a*b/gcd(maximum,minimum);
			
			bw.write(Integer.toString(result)+'\n');
		}
		
		bw.flush();
		bw.close();
	}

}
    
   
