package Algorithm;
import java.io.*;
import java.util.*;


public class Main {
	

    public static void main(String[] args) throws NumberFormatException, IOException {
    	
    	
    	Stack<Integer> stk = new Stack<>();
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	
    	
    	int N=Integer.parseInt(st.nextToken());
    	
    	for(int i=0;i<N;i++)
    	{
    		StringTokenizer stx = new StringTokenizer(br.readLine());
    		String command = stx.nextToken();
    		
    		if(command.equals("push"))
    		{
    			int num = Integer.parseInt(stx.nextToken());
    			stk.push(num);
    		}
    		
    		else if(command.equals("pop"))
    		{
    			if(stk.empty())
    			{
    				bw.write("-1\n");
    			}
    			else {
    				bw.write(Integer.toString(stk.peek())+"\n");
    				stk.pop();
				}
    		}
    			
    		    		
    		else if(command.equals("size"))
    		{
    			bw.write(Integer.toString(stk.size())+"\n");
    		}
    		
    		else if(command.equals("empty"))
    		{
    			if(stk.empty())
    			{
    				bw.write("1\n");
    			}
    			else {
    				bw.write("0\n");
				}
    		}
    		else if(command.equals("top"))
    		{
    			if(stk.empty())
    			{
    				bw.write("-1\n");
    			}
    			else {
    				bw.write(Integer.toString(stk.peek())+"\n");
				}
    		}
    			
    	}
    	
    	bw.flush();
    	bw.close();
    	
    	
    	
    			
    
    }
}
