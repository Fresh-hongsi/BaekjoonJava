package Algorithm;

import java.io.*;
import java.util.*;




public class Main {
	

	public static void main(String[] args) throws NumberFormatException, IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		PriorityQueue<Integer> pq = new PriorityQueue<>(); // 작은 게 위로 오게
		
		// 입력
		for(int i=0;i<N;i++)
		{
			st = new StringTokenizer(br.readLine());
			
			for(int j=0;j<N;j++)
			{
				int temp = Integer.parseInt(st.nextToken());
				
				// 만약 큐가 n보다 적게 찼다면, 그냥 push
				if(pq.size()<N)
				{
					pq.add(temp);
				}
				
				// 큐가 n만큼 찼다면, 비교하기
				else if(pq.size()==N)
				{
					// top <= temp -> replace
					if(pq.peek()<=temp)
					{
						pq.poll();
						pq.add(temp);
					}
				}
			}
			
		
			
			
		}
		
		// top에 있는 게 n번째 값
		bw.write(Integer.toString(pq.peek()));
		bw.flush();
		bw.close();
	}
}
    
   
