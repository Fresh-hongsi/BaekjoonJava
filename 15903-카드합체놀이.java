package Algorithm;

import java.io.*;
import java.text.BreakIterator;
import java.util.*;




public class Main {
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N= Integer.parseInt(st.nextToken());
		int fusion = Integer.parseInt(st.nextToken());
		PriorityQueue<Long> pQueue = new PriorityQueue<>(); // 자바에선 기본이 오름차순 
		long result=0;
		
		// 입력
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++)
		{
			long temp = Long.parseLong(st.nextToken());
			pQueue.add(temp);
		}
		
		// 가공
		for(int i=0;i<fusion;i++)
		{
			long a = pQueue.peek();
			pQueue.poll();
			
			long b = pQueue.peek();
			pQueue.poll();
			
			long r = a+b;
			pQueue.add(r);
			pQueue.add(r);
		}
		
		// 더하기
		while(!pQueue.isEmpty())
		{
			result+=pQueue.poll();
		}
		
		bw.write(Long.toString(result));
		bw.flush();
		bw.close();
		
		
	}
}
    
   
