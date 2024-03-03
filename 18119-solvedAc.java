package Algorithm;

import java.io.*;
import java.util.*;


public class Main {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Double> arr = new ArrayList<>();
		for(int i=0;i<N;i++) {
			
			double temp = Integer.parseInt(br.readLine());
			arr.add(temp);
			
		}
		
		Collections.sort(arr);
		
		int r = (int) Math.round(0.15*N);
		
		double result= 0;
		for(int i=r;i<=N-r-1;i++)
		{
			result+=arr.get(i);
		}
		
		int IntResult = (int)Math.round(result/(N-(2*r)));
		
		bw.write(Integer.toString(IntResult));
		bw.flush();
		bw.close();
		
		
	}		


}
    
   
