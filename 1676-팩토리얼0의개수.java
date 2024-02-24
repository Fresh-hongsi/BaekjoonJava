package Algorithm;

import java.io.*;
import java.util.*;




public class Main {
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int result=0;
		
		// 5의 배수에서 5 찾기
		for(int i=5;i<=N;i+=5)
		{
			result++;
		}
		
		// 5의 제곱수에서 5찾기
		for(int i=25;i<=N;i+=25)
		{
			result++;
		}
		
		// 5의 3제곱 수에서 5 찾기
		for(int i=125;i<=N;i+=125)
		{
			result++;
		}
		
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		
		
	}
}
    
   
