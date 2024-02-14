package Algorithm;
import java.io.*;
import java.util.*;



public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int N = Integer.parseInt(st.nextToken());
    	
    	ArrayList<Double> list = new ArrayList<>();
    	
    	st = new StringTokenizer(br.readLine());
    	
    	for(int i=0;i<N;i++) {
    		double temp = Double.parseDouble(st.nextToken());
    		list.add(temp);
    		
    	}
    	
    	Collections.sort(list,Collections.reverseOrder());
    	
    	double max = list.get(0);
    	double result = 0;
    	for(int i=0;i<N;i++) {
    		
    		double k = list.get(i)/max*100;
    		result+=k;
    	}
    	
    	result/=N;
    	
    	bw.write(Double.toString(result));
    	
    	
    	bw.flush();
    	bw.close();
    	    	
    	
    	
    }

}
    
   
