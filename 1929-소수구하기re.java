package Algorithm;

import java.io.*;
import java.util.*;




public class Main {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		boolean[] arr = new boolean[1000001];
		
		// 초기화
		for(int i=0;i<1000001;i++)
		{
			arr[i] = true;
		}
		
		arr[0]=false;
		arr[1]=false;
		
		for(int i=2;i<=Math.sqrt(N);i++) {
			
			if(arr[i]==true) // 현재 소수라면
			{
				for(int j=i+i;j<=N;j+=i)
				{
					arr[j]=false;
				}
			}
			
			else {
				continue;
			}
		}
		
		for(int i=M; i<=N;i++)
		{
			if(arr[i]==true)
			{
				bw.write(Integer.toString(i)+'\n');
			}
		}
		bw.flush();
		bw.close();
		
				
	}
	

}
    
   
