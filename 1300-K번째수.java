package Algorithm;

import java.io.*;
import java.time.chrono.MinguoChronology;
import java.util.*;




public class Main {
	

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N=Integer.parseInt(br.readLine());
		int K=Integer.parseInt(br.readLine());
		
		int s=1;
		int e=K;
		int result=0;
		
		while(s<=e)
		{
			int m=(s+e)/2; // 중앙값 구하기
			int count=0;
			
			// 현재 중앙값보다 작거나 같은 수의 개수를 count하기
			for(int i=1;i<=N;i++)
			{
				count=count+Math.min(m/i, N);
			}
			
			// 이 경우 ARR[K]는 현재 중앙값 M보다 더 큰 수여야함 -> 즉 result는 현재 m보다 무조건 커야함
			if(count<K)
			{
				s=m+1;
			}
			
			// 이 경우 ARR[K]는 현재 중앙값 M보다 더 작은 수여야할 수도 있음 -> result는 현재 m일수도 있고, 더 작은 수일 수도 있음
			else 
			{
				result=m;
				e=m-1;
			}
			
			
		}
		
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		
	}
}
    
   
