package Algorithm;
import java.io.*;
import java.util.*;



public class Main {
	


    public static void main(String[] args) throws NumberFormatException, IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int N= Integer.parseInt(st.nextToken());
    	Map<Integer,Integer> a = new HashMap<>();
    	
    	st = new StringTokenizer(br.readLine());
    	
    	
    	for(int i=0;i<N;i++) {
    		int temp = Integer.parseInt(st.nextToken());
    		
    		 // temp 키에 해당하는 값이 있으면 그 값+1값으로 세팅
    		 // temp 키에 해당하는 값이 없으면 0+1값으로 세팅
    		a.put(temp,a.getOrDefault(temp,0)+1);
    	}
    	
    	st = new StringTokenizer(br.readLine());
    	int M = Integer.parseInt(st.nextToken());
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i=0;i<M;i++) {
    		
    		int k=Integer.parseInt(st.nextToken());
    		if(!a.containsKey(k)) { // 해당하는 키가 map에 없다면
    			bw.write("0\n");
    		}
    		else { //해당하는 키가 map에 있다면
    			bw.write("1\n");
    		}
    	}
    	
    	bw.flush();
    	bw.close();
    	
    }
}
    
   
