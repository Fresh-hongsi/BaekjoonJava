package Algorithm;

import java.io.*;
import java.util.*;




public class Main {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long n=Long.parseLong(br.readLine());
		long result = n; 
		
		for(int i=2;i<=Math.sqrt(n);i++) {
			
			// 소인수인 경우
			if(n%i==0) {
				result = result-result/i; // 오일러 피 사용해 서로소 아닌 것 개수 감소시키기
				
				while(n%i==0) { // 소인수 제거
					n/=i;
				}
			}
			
			
		}
		
		// 소인수 남아있는 경우
		if(n>1)
		{
			result = result-result/n; // 오일러 피 사용해 서로소 아닌 것 개수 감소시키기
		}
		
		bw.write(Long.toString(result));
		bw.flush();
		bw.close();
	}

}
    
   
