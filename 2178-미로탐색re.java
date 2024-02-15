package Algorithm;

import java.io.*;
import java.util.*;



public class Main {
	
	static int N=0;
	static int M=0;
	static int result=0;
	static int []dr = {-1,0,1,0};
	static int []dc = {0,1,0,-1};
	static ArrayList<ArrayList<Integer>> map = new ArrayList<>();
	static boolean[][] visited;
	
	static BufferedReader br; 
	static BufferedWriter bw;
	
	public static class Tuple {
		int first;
		int second;
		int third;
		
		Tuple(int first,int second,int third){
			this.first=first;
			this.second=second;
			this.third=third;
			
		}
	}

	
	
	public static void BFS(Tuple start) throws IOException {
		
		Queue<Tuple> q = new LinkedList<Tuple>();
		q.add(start);
		visited[start.first][start.second]=true;
		
		while(!q.isEmpty()) {
			
			Tuple cur = q.peek();
			if(cur.first==N-1 && cur.second==M-1) {
				bw.write(Integer.toString(cur.third));
				break;
			}
			
			q.remove();
			
			for(int i=0;i<4;i++) {
				int nextR = cur.first+dr[i];
				int nextC = cur.second+dc[i];
				int nextLength = cur.third+1;
				
				if(nextR >= 0 && nextR < N && nextC >= 0 && nextC < M) {
					if(visited[nextR][nextC]==false && map.get(nextR).get(nextC)==1) {
						visited[nextR][nextC]=true;
						q.add(new Tuple(nextR,nextC,nextLength));
					}
				}
			}
			
		
			
		
		}
		
	}

    public static void main(String[] args) throws IOException, NumberFormatException {
    
    	br = new BufferedReader(new InputStreamReader(System.in));
    	bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	N=Integer.parseInt(st.nextToken());
    	M=Integer.parseInt(st.nextToken());
    	
    	visited = new boolean[N][M];
    	
    	for(int i=0;i<N;i++) {
    		
    		String s = br.readLine();
    		ArrayList<Integer> row = new ArrayList<>();
    		for(int j=0;j<s.length();j++) {
    			int temp = s.charAt(j)-'0';
    			row.add(temp);
    		}
    		map.add(row);
    	}
    	
    	BFS(new Tuple(0,0,1));
    	
    	bw.flush();
    	bw.close();
    	
    	
    	
    			
    }
    
    
}
    
   
