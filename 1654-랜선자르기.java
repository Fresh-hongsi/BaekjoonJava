package Algorithm;

import java.io.*;
import java.util.*;




public class Main {
	

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int K=Integer.parseInt(st.nextToken());
		int N=Integer.parseInt(st.nextToken());
		
		ArrayList<Long> lan = new ArrayList<>();
		
		for(int i=0;i<K;i++) {
			long temp=Long.parseLong(br.readLine());
			lan.add(temp);
			
		}
		
		Collections.sort(lan,Collections.reverseOrder());
		
		long s=1;
		long e=lan.get(0);
		long result=0;
		
		while(s<=e)
		{
			long m=(s+e)/2;
			long count=0;
			
			for(int i=0;i<lan.size();i++)
			{
				count+=lan.get(i)/m;
			}
			
			if(count<N) // 만드려고 하는 랜선 개수 아직 부족 -> 더 작은 값으로 나눠서 랜선 개수를 늘려봐야함
			{
				e=m-1;
			}
			
			else // 만드려고 하는 랜선 개수이거나 그 이상의 랜선을 만들었음 -> 따라서 임시로 현재 기준값을 저장해놓고 더 큰 값으로 다시 시도해보기 
			{
				result=m;
				s=m+1;
			}
			
		}
		
		bw.write(Long.toString(result));
		bw.flush();
		bw.close();
	}
}
    
   
