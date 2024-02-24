package Algorithm;

import java.io.*;
import java.util.*;




public class Main {
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 식 입력받을 문자열
		String s = br.readLine();
		
		// flag - true: 
		//	앞에 minus가 나왔음 표시 -> 따라서 이후에 +가 나오더라도 -로 변환하여 연산자 덱에 넣어주기
		// flag - false: 
		//	앞에 minus가 나온 적 없음 표시 -> 따라서 이후에 +가 나오면 + 그대로 연산자 덱에 넣어주기 위함
		boolean flag = false;
		
		Deque<Integer> operandDeque = new ArrayDeque<>(); // 피연산자 담을 덱
		Deque<Character> operatorDeque= new ArrayDeque<>(); // 연산자 담을 덱
		
		String numString=""; // 연산자가 나오기 전까지 피연산자를 담을 문자열
		
		for(int i=0;i<s.length();i++)
		{
			// -가 나오면 연산자 큐에 넣어주기
			if(s.charAt(i)=='-')
			{
				flag=true;
				operatorDeque.addLast('-');
				operandDeque.addLast(Integer.parseInt(numString));
				numString="";
			}
			
			// +가 나오면, 앞에 -가 있는 상태라면, -를 연산자 큐에 넣어주기
			else if(s.charAt(i)=='+')
			{
				// 앞에 - 가 나왔었음 -> 따라서 이후의 +는 -로 변환하여 덱에 넣어줌
				if(flag==true)
				{
					operatorDeque.addLast('-');
					operandDeque.addLast(Integer.parseInt(numString));
					numString="";
				}
				
				// 앞에 - 가 나오지 않았음 -> 따라서 이후의 +는 + 그대로 덱에 넣어줌
				else {
					operatorDeque.addLast('+');
					operandDeque.addLast(Integer.parseInt(numString));
					numString="";
				}
				
			}
			
			else {
				numString+=s.charAt(i);
			}
		}

		// 마지막까지 추적했던 피연산자를 덱에 넣어주기
		operandDeque.addLast(Integer.parseInt(numString));
	
	
		while(operandDeque.size()>1)
		{
			char op = operatorDeque.getFirst();
			operatorDeque.pollFirst();
			
			int a = operandDeque.getFirst();
			operandDeque.pollFirst();
			
			int b= operandDeque.getFirst();
			operandDeque.pollFirst();
			
			if(op=='-') {
				int r = a-b;
				operandDeque.addFirst(r);
			}
			
			else {
				int r=a+b;
				operandDeque.addFirst(r);
			}
		}
		
		int result = operandDeque.pollFirst();
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
	}
}
    
   
