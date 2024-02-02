package Algorithm;
import java.io.*;
import java.util.*;



public class Main {
	
	

    public static void main(String[] args) throws NumberFormatException, IOException {
    	
    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int N=Integer.parseInt(st.nextToken());
    	
    	Integer[] arr = new Integer[N];
    	
    	StringTokenizer stx = new StringTokenizer(br.readLine());
    	
    	for(int i=0;i<N;i++)
    	{
    		arr[i]=Integer.parseInt(stx.nextToken());
    	}
    	
    	Arrays.sort(arr);
    	
    	for(int i=1;i<N;i++)
    	{
    		arr[i]=arr[i-1]+arr[i];
    	}
    	
    	int result=0;
    	
    	for(int i=0;i<N;i++)
    	{
    		result+=arr[i];
    	}
    	
    	bw.write(Integer.toString(result));
    	bw.flush();
    	bw.close();
    	
    }
}
    
   
