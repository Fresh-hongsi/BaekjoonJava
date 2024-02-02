package Algorithm;

import java.io.*;
import java.util.*;



public class Main {
	

    public static void main(String[] args) throws NumberFormatException, IOException{
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int N=Integer.parseInt(st.nextToken());
    	
    	for(int i=0;i<N;i++)
    	{
    		String s = br.readLine();
    		Stack<Character> vpsChecker = new Stack<>(); //vps인지 여부를 확인하기 위한 스택
    		boolean flag=false;
    		
    		
    		for(int j=0;j<s.length();j++)
    		{
    			// 만약 여는 괄호가 들어오면 무조건 스택에 push
    			if(s.charAt(j)=='(')
    			{
    				vpsChecker.push('(');
    			}
    			
    			// 만약 다는 괄호가 들어오면 경우를 따져보기
    			else
    			{
    				if(s.charAt(j)==')')
    				{
    					if(!vpsChecker.empty())
    					{
    						vpsChecker.pop();
    						
    					}
    					
    					else {
    						
    						flag=true;
    						break;
    						
						}
    				}
    			}
    		}
    		
    		if(vpsChecker.empty() && flag==false)
    		{
    			bw.write("YES\n");
    		}
    		
    		else if(!vpsChecker.empty() || flag==true)
    		{
    			bw.write("NO\n");
    		}
    	}
    	
    	bw.flush();
    	bw.close();
    	
    }
}
