package Algorithm;

import java.io.*;
import java.util.*;




public class Main {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		long prefix = 100000000000001l;
		Deque<Long> primeDeque = new ArrayDeque<>();
		Deque<Long> almostDeque = new ArrayDeque<>();
		boolean[] arr = new boolean[(int) (Math.sqrt(b)+2)];
		
		// 에라토스테네스 체 써서 소수 구하기
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=true;
		}
		
		arr[0]=false;
		arr[1]=false;
		
		for(int i=2;i<=Math.sqrt(b)+1;i++)
		{
			if(arr[i]==true)
			{
				for(int j=i+i;j<=Math.sqrt(b)+1;j+=i)
				{
					arr[j]=false;
				}
			}
			
			else {
				continue;
			}
		}
		
		for(int i=2;i<=Math.sqrt(b)+1;i++)
		{
			if(arr[i]==true)
			{
				primeDeque.add((long) i);
			}
		}
		
		// 거의 소수 찾기
		while(primeDeque.size()>0)
		{
			long cur = primeDeque.getFirst();
			primeDeque.pollFirst();
			
			long temp = cur;
			
			while(true)
			{
				temp*=cur;
				
				if(temp>b)
				{
					break;
				}
				
				else {
					if(temp>=a)
					{
						almostDeque.add(temp);
					}
					
					// 오버플로우 막기 위함
					if(temp>prefix/cur)
					{
						break;
					}
					
				}
			}
			
			
			
			
			

		}
		
		bw.write(Integer.toString(almostDeque.size()));
		bw.flush();
		bw.close();
		
				
	}
	

}
    
   
