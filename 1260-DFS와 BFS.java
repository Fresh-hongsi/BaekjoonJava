package Algorithm;
import java.io.*;
import java.util.*;



public class Main {
	
	static BufferedReader br;
	static BufferedWriter bw;
	static StringTokenizer st;
	
	static Boolean[] visited; // 방문표시 배열
	static ArrayList<LinkedList<Integer>> adjMatrix; // 인접리스트
	
	
	private static void dfs(int v) throws IOException {
		
		if(visited[v]==true) {
			return;
		}
		
		visited[v]=true;
		bw.write(Integer.toString(v)+' ');
		
		for(int next: adjMatrix.get(v)) {
			dfs(next);
		}
	}
	
	private static void bfs(int v) throws IOException {
		
		Queue<Integer> q = new LinkedList<>();
		visited[v]=true;
		q.add(v);
		
		while(!q.isEmpty()) {
			
			int cur = q.peek();
			bw.write(Integer.toString(cur)+' ');
			q.poll();
			
			for(int next:adjMatrix.get(cur)) {
				
				if(visited[next]==false) {
					visited[next]=true;
					q.add(next);
				}
				
			}
		}
	}

    public static void main(String[] args) throws NumberFormatException, IOException {
    
    	br = new BufferedReader(new InputStreamReader(System.in));
    	bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	st = new StringTokenizer(br.readLine());
    	int N=Integer.parseInt(st.nextToken());
    	int M=Integer.parseInt(st.nextToken());
    	int V=Integer.parseInt(st.nextToken());
    	
    	visited = new Boolean[N+1];
    	adjMatrix = new ArrayList<>(N+1); 
    	
    	for(int i=0;i<N+1;i++) {
    		visited[i]=false;
    	}
    	
    	for(int i=0;i<=N;i++) {
    		adjMatrix.add(new LinkedList<>());
    	}
    	
    	// 인접리스트 세팅
    	for(int i=0;i<M;i++) {
    		st = new StringTokenizer(br.readLine());
    		int s = Integer.parseInt(st.nextToken());
    		int e = Integer.parseInt(st.nextToken());
    		
    		adjMatrix.get(s).add(e);
    		adjMatrix.get(e).add(s);
    		
    	}
    	
    	// 각 연결리스트 오름차순 정렬
    	for(int i=1;i<=N;i++) {
    		Collections.sort(adjMatrix.get(i));
    	}
    	
    	dfs(V);
    	
    	Arrays.fill(visited,false); // 방문표시 배열 초기화
    	bw.write("\n");
    	
    	bfs(V);
    	
    	bw.flush();
    	bw.close();
    			
    }
    
    
}
    
   
