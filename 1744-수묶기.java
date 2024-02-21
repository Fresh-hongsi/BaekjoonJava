package Algorithm;

import java.io.*;
import java.util.*;




public class Main {
	

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N= Integer.parseInt(br.readLine());
		PriorityQueue<Integer> plusPriorityQueue=new PriorityQueue<>(Collections.reverseOrder()); // 양수를 저장할 우선순위 큐 - 내림차순 정렬
		PriorityQueue<Integer> minusPriorityQueue=new PriorityQueue<>(); // 음수를 저장할 우선순위 큐 - 오름차순 정렬
		int one=0; // 1의 개수 - 그냥 더해주면 됨
		int zero=0; // 0의 개수 - 음수 남은 거 한개랑 상쇄 효과 가짐
		int result=0; // 최종 결과
		// 자료들을 입력 및 세팅
		for(int i=0;i<N;i++)
		{
			int temp = Integer.parseInt(br.readLine());
			if(temp>1)
			{
				plusPriorityQueue.add(temp);
			}
			else if(temp==1)
			{
				one++;
			}
			else if(temp==0)
			{
				zero++;
			}
			else {
				minusPriorityQueue.add(temp);
			}
		}
		
		// 양수들 처리
		while(plusPriorityQueue.size()>1)
		{
			int first = plusPriorityQueue.peek();
			plusPriorityQueue.poll();
			int second=plusPriorityQueue.peek();
			plusPriorityQueue.poll();
			
			result+=(first*second);
		}
		
		// 남은 양수 처리
		if(plusPriorityQueue.size()==1)
		{
			result+=plusPriorityQueue.peek();
			plusPriorityQueue.poll();
		}
		
		// 음수를 처리
		while(minusPriorityQueue.size()>1)
		{
			int first = minusPriorityQueue.peek();
			minusPriorityQueue.poll();
			int second=minusPriorityQueue.peek();
			minusPriorityQueue.poll();
			
			result+=(first*second);
		}
		
		// 남은 음수가 있는데, 0이 없다면, result에 음수 더해주기
		if(minusPriorityQueue.size()==1)
		{
			if(zero==0)
			{
				result+=minusPriorityQueue.peek();
				minusPriorityQueue.poll();
			}
		}
		
		// 남은 1이 있다면 다 더해주기
		result+=one;
		
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		
		
	}
}
    
   
