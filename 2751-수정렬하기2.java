package Algorithm;
import java.io.*;
import java.util.*;



public class Main {
	
	

    public static void main(String[] args) throws NumberFormatException, IOException{
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int N=Integer.parseInt(st.nextToken());
    	
    	Integer [] arr=new Integer[N];
    	
    	for(int i=0;i<N;i++)
    	{
    		arr[i]=Integer.parseInt(br.readLine());
    	}
    	
    	Arrays.sort(arr);
    	
    	for(int i=0;i<N;i++)
    	{
    		bw.write(Integer.toString(arr[i])+'\n');
    	}
    	
    	
    	bw.flush();
    	bw.close();
		
    }
    
}
