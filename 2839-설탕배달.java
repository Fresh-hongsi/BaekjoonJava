  package Algorithm;

import java.io.*;
import java.util.*;



public class Main {
	
	
    public static void main(String[] args) throws NumberFormatException,IOException {
    	
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int N=Integer.parseInt(st.nextToken());
    	
    	int[] dp = new int[5001];
    	dp[1]=-1;
    	dp[2]=-1;
    	dp[3]=1;
    	dp[4]=-1;
    	dp[5]=1;
    	
    	for(int i=6;i<=N;i++)
    	{
    		if(dp[i-3]==-1 && dp[i-5]==-1)
    		{
    			dp[i]=-1;
    		}
    		
    		else if(dp[i-3]==-1)
    		{
    			dp[i]=dp[i-5]+1;
    		}
    		
    		else if(dp[i-5]==-1)
    		{
    			dp[i]=dp[i-3]+1;
    		}
    		
    		else {
    			dp[i]=Math.min(dp[i-5]+1,dp[i-3]+1);
			}
    	}
    	
    	bw.write(Integer.toString(dp[N]));
    	
    	bw.flush();
    	bw.close();
    	
    	

    	
    }
}
