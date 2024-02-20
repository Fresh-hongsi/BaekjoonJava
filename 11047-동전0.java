package Algorithm;

import java.io.*;
import java.util.*;




public class Main {
	

	public static void main(String[] args) throws NumberFormatException,IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		int count=0;
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		for(int i=0;i<N;i++)
		{
			int temp=Integer.parseInt(br.readLine());
			arrayList.add(temp);
			
		}
		
		Collections.sort(arrayList,Collections.reverseOrder());

		for(int i=0;i<N;i++)
		{
			int cur = arrayList.get(i);
			if(cur>K)
			{
				continue;
			}
			
			int share = K/cur;
			count+=share;
			K%=cur;
			
			if(K==0)
			{
				break;
			}
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
	
	}
}
    
   
