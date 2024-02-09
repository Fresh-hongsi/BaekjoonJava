package Algorithm;
import java.io.*;
import java.util.*;



public class Main {
	
	// Pair 클래스 직접 만들어 사용
	private static class Pair{
		int x;
		int y;
		
		Pair(int x, int y){
			this.x=x;
			this.y=y;
		}
	}
	
    public static void main(String[] args) throws NumberFormatException, IOException{
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int t = Integer.parseInt(st.nextToken());
    	
    	ArrayList<Pair> a = new ArrayList<>();
    	
    	for(int i=0;i<t;i++) {
    		st = new StringTokenizer(br.readLine());
    		int x = Integer.parseInt(st.nextToken());
    		int y = Integer.parseInt(st.nextToken());
    		
    		a.add(new Pair(x,y));
    		
    		
    	}
    	
    	// 배열이 아닌 자료구조를 정렬하고자 할 때에는 Collections.sort를 사용
    	// Comparator 인터페이스를 익명 클래스로 구현하여 compare() 메서드를 재정의. 
    	// compare() 메서드는 두 개의 요소를 비교하여 정렬 순서를 결정
    	Collections.sort(a,new Comparator<Pair>() {
    		@Override
    		public int compare(Pair f, Pair s) {
    			
    			// x 좌표가 다르다면, x 좌표가 증가하는 순
    			if(f.x!=s.x) {
    				return Integer.compare(f.x,s.x);
    			}
    			
    			// x 좌표가 같다면, y 좌표가 증가하는 순
    			else {
    				return Integer.compare(f.y,s.y);
    			}
    		}
    	});
    	
    	for(Pair p:a) {
    		bw.write(Integer.toString(p.x)+' '+Integer.toString(p.y)+'\n');
    	}
    	
    	bw.flush();
    	bw.close();
    	
    }


}
    
   
