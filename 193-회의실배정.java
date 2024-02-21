package Algorithm;

import java.io.*;
import java.util.*;




public class Main {
	
	public static class Pair{
		int first;
		int second;
		
		public Pair(int first, int second) {
			// TODO Auto-generated constructor stub
			this.first=first;
			this.second=second;
		}
	}
	

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N= Integer.parseInt(br.readLine());
		ArrayList<Pair> timeSlot = new ArrayList<>();
		
		for(int i=0;i<N;i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			timeSlot.add(new Pair(start,end));
			
		}
		
		Collections.sort(timeSlot, new Comparator<Pair>() {
			
			@Override
			public int compare(Pair a, Pair b)
			{
				// 종료 시간이 빠른 순으로 정렬
				if(a.second != b.second)
				{
					return a.second-b.second;
				}
				
				// 종료 시간이 같으면 시작 시간이 빠른 순으로 정렬
				else 
				{
					return a.first-b.first;
				}
			}
		});
		
		int result=0;
		int curEnd=-1;
		
		for(int i=0;i<timeSlot.size();i++)
		{
			if(curEnd<=timeSlot.get(i).first)
			{
				result++;
				curEnd=timeSlot.get(i).second;
			}
		}
		
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		
		
		
	}
}
    
   
