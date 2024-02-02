package Algorithm;
import java.io.*;
import java.util.*;



public class Main {
	
	

    public static void main(String[] args) throws NumberFormatException, IOException{
    	
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int N=Integer.parseInt(st.nextToken());
    	int M=Integer.parseInt(st.nextToken());
    	
    	
    	int[][] map = new int[N][M];
    	boolean[][] visited = new boolean[N][M];
    	
    	int[] dRow = {-1,0,1,0};
    	int[] dCol= {0,1,0,-1};
    	
    	
    	for(int i=0;i<N;i++)
    	{
    		String s=br.readLine();
    		
    		for(int j=0;j<M;j++)
    		{
    			map[i][j]=s.charAt(j)-48;
    		}
    	}
    	
    	Queue<int[] > q = new LinkedList<>();
    	q.add(new int[] {0,0});
    	visited[0][0]=true;
    	
    	while(!q.isEmpty())
    	{
    		int[] cur = q.poll();
    		int curRow=cur[0];
    		int curCol=cur[1];
    		
    		int curLength = map[curRow][curCol];
    		
    		if(curRow==N-1 && curCol==M-1)
    		{
    			bw.write(Integer.toString(curLength));
    			break;
    		}
    		
    		for(int i=0;i<4;i++)
    		{
    			// 범위 안에 있는 지 확인
    			if(curRow+dRow[i]>=0 && curRow+dRow[i]<N && curCol+dCol[i]>=0 && curCol+dCol[i]<M)
    			{
    				// 옮긴 인덱스의 지도 좌표가 갈 수 있는 길이고
    				if(map[curRow+dRow[i]][curCol+dCol[i]]==1 && visited[curRow+dRow[i]][curCol+dCol[i]]==false)
    				{
    				
    					visited[curRow+dRow[i]][curCol+dCol[i]]=true;
    					map[curRow+dRow[i]][curCol+dCol[i]]=curLength+1;
    					q.add(new int[] {curRow+dRow[i],curCol+dCol[i]});
    				}
    				
    		
    			
    			}
    		}
    		
    		
    	}
    	
    	bw.flush();
    	bw.close();
    	
    	
    	
    }
    
}
