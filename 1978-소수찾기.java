package Algorithm;

import java.io.*;
import java.util.*;



public class Main {
	
	public static boolean is_Prime(int num)
	{
		boolean flag=true;
		
		for(int i=2;i*i<=num;i++)
		{
			if(num%i==0) {
				flag=false;
				return flag;
			}
		}
		
		return flag;
	}
	
    public static void main(String[] args) throws NumberFormatException, IOException{
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int N=Integer.parseInt(st.nextToken());
    	int result=0;
    	
    	StringTokenizer stx = new StringTokenizer(br.readLine());
    	
    	for(int i=0;i<N;i++)
    	{
    		int temp = Integer.parseInt(stx.nextToken());
    		boolean check = is_Prime(temp);
    		
    		if(check==true)
    		{
    			if(temp!=1)
    			{
    				result++;
    			}
    		}
    	}
    	
    	bw.write(Integer.toString(result));
    	bw.flush();
    	bw.close();

    	
    }
}
