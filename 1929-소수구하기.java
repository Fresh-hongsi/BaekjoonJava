package Algorithm;
import java.io.*;
import java.util.*;



public class Main {
	
	

    public static void main(String[] args) throws NumberFormatException, IOException{
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	boolean[] arr = new boolean[1000001]; //false: 안걸러짐, true: 걸러짐
    	Arrays.fill(arr,false); // 자바에서 배열을 특정값으로 초기화하는법
    	
    	int M=Integer.parseInt(st.nextToken());
    	int N=Integer.parseInt(st.nextToken());
    	
    	// 에라토스테네스의 체 이용해 소수가 아닌 것들 거르기
    	for(int i=2;i<=N;i++) {
    		
    		if(arr[i]==false) // 안걸러졌다면
    		{
    			// 그 배수항부터 끝까지 다 거르기
    			for(int j=i+i; j<=N; j+=i) {
    				arr[j]=true; 
    			}
    		}
    	}
    	
    	// 출력
    	for(int i=M;i<=N;i++) {
    		// 1이 아니고, 안걸러진 것들만 출력
    		if(i!=1 && arr[i]==false) {
    			bw.write(Integer.toString(i)+'\n');
    		}
    		
    	}
    	
    	
    	bw.flush();
    	bw.close();
    	
    	  	
    }
}
    
   
