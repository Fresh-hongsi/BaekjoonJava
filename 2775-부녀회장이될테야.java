package Algorithm;
import java.io.*;
import java.util.*;



public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int tc = Integer.parseInt(st.nextToken());
    	
    	int[][] dp = new int[15][15];
    	
    	for(int i=0;i<15;i++) {
    		dp[i][0]=0;
    	}
    	
    	for(int i=0;i<15;i++) {
    		dp[0][i] = i;
    	}
    	
    	for(int i=1;i<15;i++) {
    		for(int j=1;j<15;j++) {
    			dp[i][j]=dp[i][j-1]+dp[i-1][j];
    		}
    	}

    	
    	while(tc>0) {
    		tc--;
    		
    		
    		int floor = Integer.parseInt(br.readLine());
    		int number = Integer.parseInt(br.readLine());
    		
    		bw.write(Integer.toString(dp[floor][number])+'\n');
    		
    	}
    	
    	bw.flush();
    	bw.close();
    	    	
    	
    	
    }

}
    
   
