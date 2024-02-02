package Algorithm;
import java.io.*;
import java.util.*;



public class Main {

	static int[] dr= {-1,0,1,0}; // 상우하좌 행의 변위
	static int[] dc= {0,1,0,-1};  // 상우하좌 열의 변위
	
	static int T = 0; // 테스트케이스 수
	static int M = 0; // 열 길이
	static int N = 0; // 행 길이
	static int K = 0; // 배추 개수

	static int row = 0; // 입력받은 배추 위치의 행 좌표
	static int col = 0; // 입력받은 배추 위치의 열 좌표

	static int result = 0; // 최종적으로 놓을 배추지렁이 개수
	
	static int[][] farm = new int[51][51];
	static boolean[][] visited = new boolean[51][51];
	
	public static void bfs(int r, int c)
	{
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {r,c});
		
		while(!q.isEmpty())
		{
			int[] current = q.poll();
			int curRow = current[0];
			int curCol = current[1];
			
			for (int i = 0; i < 4; i++)
			{
				if (curRow + dr[i] >= 0 && curRow + dr[i] < N && curCol + dc[i] >= 0 && curCol + dc[i] < M) //가능 범위 안에 있고
				{
					if (farm[curRow + dr[i]][curCol + dc[i]] == 1 && visited[curRow + dr[i]][curCol + dc[i]] == false) // 배추가 있는데, 방문안된 배추라면
					{
						visited[curRow + dr[i]][curCol + dc[i]] = true; // 방문표시하고
						q.add(new int[] {curRow + dr[i], curCol + dc[i]}); // 큐에 추가
					}
				}
			}
		}
		
	}
	

    public static void main(String[] args) throws NumberFormatException, IOException{
    			
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	T=Integer.parseInt(st.nextToken());
    	
    	for(int p=0;p<T;p++)
    	{
    		StringTokenizer st1 = new StringTokenizer(br.readLine());
    		M=Integer.parseInt(st1.nextToken());
    		N=Integer.parseInt(st1.nextToken());
    		K=Integer.parseInt(st1.nextToken());
    		
    		for(int i=0;i<51;i++)
    		{
    			for(int j=0;j<51;j++)
    			{
    				farm[i][j]=0;
    				visited[i][j]=false;
    			}
    		}
    		
    		// 배추 위치 저장
    		for(int i=0;i<K;i++)
    		{
    			StringTokenizer st2 = new StringTokenizer(br.readLine());
    			col = Integer.parseInt(st2.nextToken());
    			row = Integer.parseInt(st2.nextToken());
    			
    			farm[row][col]=1;
    			
    			
    		}
    		
    		// bfs로 지렁이 배치
    		for(int i=0;i<N;i++)
    		{
    			for(int j=0;j<M;j++)
    			{
    				if (farm[i][j] == 1 && visited[i][j] == false) // 배추가 있고, 방문하지 않은 배추라면 bfs
    				{
    					// 방문표시
    					visited[i][j] = true;
    					bfs(i, j);
    					result++;
    				}
    			}
    		}
    		
    		bw.write(Integer.toString(result)+'\n');
    		result=0;
    		
    		
    	}
    	
    	bw.flush();
    	bw.close();
    	
    	
    	
    
    }
}
