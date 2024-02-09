package Algorithm;
import java.io.*;
import java.util.*;



public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int K = Integer.parseInt(st.nextToken());
    	
    	Stack<Integer> stk = new Stack<Integer>();
    	
    	for(int i=0;i<K;i++) {
    		
    		st = new StringTokenizer(br.readLine());
    		int temp = Integer.parseInt(st.nextToken());
    		
    		if(temp!=0) {
    			stk.add(temp);
    		}
    		
    		else {
    			if(!stk.empty()) {
    				stk.pop();
    			}
    		}
    		
    	}
    	
    	int result=0;
    	while(!stk.empty()) {
    		result+=stk.peek();
    		stk.pop();
    	}
    	
    	bw.write(Integer.toString(result));
    	bw.flush();
    	bw.close();
    	
    	
    }


}
    
   
