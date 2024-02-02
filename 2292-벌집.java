package Algorithm;
import java.io.*;
import java.util.*;


public class Main {
	

    public static void main(String[] args) throws NumberFormatException, IOException{	
    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int N= Integer.parseInt(st.nextToken());
    	
    	int step=6; // 한 step이 끝날때마다 step은 6씩 증가
    	int num=1; // step이 끝났는지 확인하기 위한 도구
    	int result=1; // 결과값 출력 위한 변수
    	
    	for(int i=2;i<=N;i++)
    	{
    		if(num<=step)
    		{
    			result=(step/6)+1;
    			num++;
    		}
    		
    		if(num==step+1)
    		{
    			step+=6;
    			num=1;
    		}
    		
    	}
    	
    	bw.write(Integer.toString(result));
    	bw.flush();
    	bw.close();
    	
    			
    
    }
}
