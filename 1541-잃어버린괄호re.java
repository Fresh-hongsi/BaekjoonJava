package Algorithm;

import java.io.*;
import java.util.*;




public class Main {
	
	public static int mySum(String a) {
		
		String[] plusPacket = a.split("\\+"); // + 기준으로 자르기 - 정규표현식에서 +는 특별한 의미이므로 이렇게 적기
		int sum = 0;
		for(int i=0;i<plusPacket.length;i++)
		{
			sum+=Integer.parseInt(plusPacket[i]);
		}
		
		return sum;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		int answer = 0;
		
		String[] minusPacket = input.split("-"); // - 기준으로 자르기
		for(int i=0;i<minusPacket.length;i++)
		{
			int temp = mySum(minusPacket[i]);
			
			if(i==0)
			{
				answer+=temp;
			}
			
			else {
				answer-=temp;
			}
		}
		
		bw.write(Integer.toString(answer));
		bw.flush();
		bw.close();
		
				
	}
	

}
    
   
