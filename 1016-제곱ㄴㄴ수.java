package Algorithm;

import java.io.*;
import java.util.*;




public class Main {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long min = Long.parseLong(st.nextToken());
		long max = Long.parseLong(st.nextToken());
		
		// 최대 100만개의 저장공간만 활용하여 계산할 것
		boolean[] arr = new boolean[(int) (max-min+1)];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=false;
		}
		
		for(long i=2;i<=Math.sqrt(max);i++) {
			long pow = i*i; // 제곱수
			long start_idx = min/pow; // 시작 인덱스
			
			if(min%pow!=0) // 나머지가 0이 아닌 경우, 시작 인덱스는 한칸 증가시켜서 시작
			{
				start_idx++;
			}
			
			// 제곱수의 배수들을 true처리
			for(long j=start_idx;j*pow<=max;j++)
			{
				arr[(int) (j*pow-min)]=true;
			}
			
			
		}
		
		// false인 것들 개수 새기
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==false) {
				count++;
			}
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
	}

}
    
   
