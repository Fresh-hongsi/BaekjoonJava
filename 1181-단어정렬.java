package Algorithm;
import java.io.*;
import java.util.*;



public class Main {
	

	public static int comp(String a, String b) {
		
		if(a.length()!=b.length()) {
			
			//compare함수의 값이 움수: a 길이가 b 길이보다 짧다
			//compare함수의 값이 양수: b 길이가 a 길이보다 짧다
			//compare함수의 값이 0: a와 b의 길이가 같다
			return Integer.compare(a.length(),b.length());
		}
		else {
			return a.compareTo(b); // 사전식 비교 함수
		}
		
	}

    public static void main(String[] args) throws NumberFormatException, IOException {
    	
    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int N=Integer.parseInt(st.nextToken());
    	
    	String[] arr = new String[N];
    	
    	// 입력
    	for(int i=0;i<N;i++) {
    		String s = br.readLine();
    		arr[i]=s;
    	}
    	
    	// 정렬
    	Arrays.sort(arr,(a,b)->comp(a,b));
    	
    	// 중복값 제거
    	bw.write(arr[0]+'\n');
    	
    	for(int i=1;i<N;i++) {
    		if(!arr[i].equals(arr[i-1])) {
    			bw.write(arr[i]+'\n');
    		}
    		
    	}
    	
    	bw.flush();
    	bw.close();
    }
}
    
   
