package Algorithm;

import java.io.*;
import java.util.*;




public class Main {
	

	public static void main(String[] args) throws NumberFormatException,IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		PriorityQueue<Integer> pQueue = new PriorityQueue<>();
		int N= Integer.parseInt(br.readLine());
		int result=0; // 최종 결과값
		
		// 우선순위 큐에 오름차순으로 값 삽입
		for(int i=0;i<N;i++)
		{
			int temp=Integer.parseInt(br.readLine());
			pQueue.add(temp);
		}
		
		// 두개씩 꺼내서 값 세팅 후 다시 큐에 넣어쥬기
		while(pQueue.size()!=1)
		{
			
			int a = pQueue.peek();
			pQueue.poll();
			int b= pQueue.peek();
			pQueue.poll();
			
			int count=a+b;
			pQueue.add(count);		
			
			result+=count;
			
		}
		
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
	
		
	}
}
    
   
