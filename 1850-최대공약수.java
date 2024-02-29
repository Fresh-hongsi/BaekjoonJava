package Algorithm;

import java.io.*;
import java.util.*;




public class Main {
	
	private static long gcd(long max, long min) {
		if(max%min==0) {
			return min;
		}
		
		else {
			return gcd(min, max%min);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		long result = gcd(Math.max(a, b),Math.min(a, b));
		
		for(long i=0;i<result;i++) {
			bw.write('1');
		}
		
		bw.flush();
		bw.close();
	}

}
    
   
