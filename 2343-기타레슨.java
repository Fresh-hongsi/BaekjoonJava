package Algorithm;

import java.io.*;
import java.util.*;




public class Main {
	

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N=0; // 강의 개수
		int M=0; // 담을 블루레이 개수
		ArrayList<Integer> arrayList = new ArrayList<>(); // 블루레이에 담을 강의 순서 바꾸면 안되므로 정렬 안할 것
		
		StringTokenizer stringTokenizer = new StringTokenizer(bReader.readLine());
		N=Integer.parseInt(stringTokenizer.nextToken());
		M=Integer.parseInt(stringTokenizer.nextToken());
		
		stringTokenizer = new StringTokenizer(bReader.readLine());
		for(int i=0;i<N;i++)
		{
			int temp=Integer.parseInt(stringTokenizer.nextToken());
			arrayList.add(temp);
		}
		
		int s=0; // 이분탐색의 가장 작은 값은 가장 긴 강의의 값
		int e=0; // 이분탐색의 가장 큰 값은 모든 강의의 합
		
		for(int i=0;i<N;i++)
		{
			if(s<arrayList.get(i))
			{
				s=arrayList.get(i);
			}
			
			e+=arrayList.get(i);
		}
		
		// 이분탐색
		while(s<=e)
		{
			int m=(s+e)/2; // 블루레이 길이 정해주기
			int count =0; // 해당 m값으로 세팅했을 때 나오는 블루레이 개수
			int sum=0; // 해당 블루레이 안에 들어가는 영상들의 합
			
			for(int i=0;i<N;i++)
			{
				sum+=arrayList.get(i);
				if(sum>m)
				{
					count++;
					sum=arrayList.get(i);
				}
			}
			
			count++;
			
			if(count<=M) // 블루레이 용량을 더 줄일 여지가 있다는 것
			{
				e=m-1;
				
			}
			
			else // 블루레이 용량을 늘려야함
			{
				s=m+1;
			}
		}
		
		bWriter.write(Integer.toString(s));
		bWriter.flush();
		bWriter.close();
		
		
	}
}
    
   
