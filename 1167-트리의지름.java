package Algorithm;

import java.io.*;
import java.util.*;



public class Main {
	
	static class Pair {
		
		private int first;
		private int second;
		
		Pair(int first, int second){
			this.first=first;
			this.second=second;
		}
	}
	
	static int N=0;
	static ArrayList<LinkedList<Pair>> adjMatrix = new ArrayList<>();
	static boolean[] visited;
	static int[] dist;
	
	static void BFS(int start) {
		
		Queue<Integer> queue = new LinkedList<>();
		visited[start]=true;
		queue.add(start);
		
		while(!queue.isEmpty()) {
			
			int cur=queue.peek();
			int r=dist[cur];
			queue.poll();
			
			for(Pair n:adjMatrix.get(cur)) {
			
				if(visited[n.first]==false) {
					int next=n.first;
					int val = n.second;
					
					visited[next]=true;
					dist[next]=r+val;
					queue.add(next);
				}
			}
	
		}
		
		
		
	}

    public static void main(String[] args) throws IOException, NumberFormatException{
    	
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	N= Integer.parseInt(br.readLine());

    	visited = new boolean[100001];
    	dist = new int[100001];
    	for(int i=0;i<100001;i++) {
    		adjMatrix.add(new LinkedList<>());
    	}
    	for(int i=0;i<100001;i++) {
    		visited[i]=false;
    		dist[i]=0;
    	}
    	
    	// 인접리스트 세팅
    	for(int i=0;i<N;i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int s=0;
    		int e=0;
    		int l=0;
    		
    		s = Integer.parseInt(st.nextToken());
    		while(true) {
    			e=Integer.parseInt(st.nextToken());
    			if(e==-1) {
    				break;
    			}
    			else {
    				l=Integer.parseInt(st.nextToken());
    			}
    			adjMatrix.get(s).add(new Pair(e,l));
    		}
    	}
    	
    	BFS(1);
    	int maxIndex = 0;
    	int maxResult=0;
    	for(int i=1;i<=N;i++) {
    		if(dist[i]>maxResult) {
    			maxResult=dist[i];
    			maxIndex=i;
    		}
    	}
    	
    	visited = new boolean[100001];
    	dist = new int[100001];
    	for(int i=0;i<100001;i++) {
    		visited[i]=false;
    		dist[i]=0;
    	}
    	
    	BFS(maxIndex); 
    	int max2Index = 0; // maxIndex에 있는 정점으로부터 가장 먼 정점 인덱스
    	int max2Result = 0; // maxIndex에 있는 정점으로부터 가장 먼 정점까지의 길이
    	for (int i = 1; i <= N; i++) {
    		if (dist[i] > max2Result) {
    			max2Result = dist[i];
    			max2Index = i;
    		}
    	}

    	// 가장 길이가 먼 distance값이 트리의 지름
    	bw.write(Integer.toString(max2Result));
    	bw.flush();
    	bw.close();
    
    }


}
    
   
