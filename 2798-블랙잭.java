import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int cardSize = Integer.parseInt(st.nextToken());
    	int prefix = Integer.parseInt(st.nextToken());
    	
    	StringTokenizer stx = new StringTokenizer(br.readLine());
    	ArrayList<Integer> card = new ArrayList<>();
    	
    	for(int i=0;i<cardSize;i++)
    	{
    		card.add(Integer.parseInt(stx.nextToken()));
    	}
    	int max = 0;
    	for(int i=0;i<=cardSize-3;i++) {
    		for(int j=i+1;j<=cardSize-2;j++)
    		{
    			for(int k=j+1;k<=cardSize-1;k++)
    			{
    				if((card.get(i)+card.get(j)+card.get(k)>max) && (card.get(i)+card.get(j)+card.get(k)<=prefix) )
    				{
    					max = card.get(i)+card.get(j)+card.get(k);
    				}
    			}
    		}
    	}
    	
    	bw.write(Integer.toString(max));
    	bw.flush();
    	bw.close();
    }
}
