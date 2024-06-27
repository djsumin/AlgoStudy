import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	static int[] parent;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); //정점의 개수 : 집의 개수
		int M = Integer.parseInt(st.nextToken()); //간선의 개수 : 길의 개수
		
		int[][] edges = new int[M][3];
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			edges[i][0] = Integer.parseInt(st.nextToken());
			edges[i][1] = Integer.parseInt(st.nextToken());
			edges[i][2] = Integer.parseInt(st.nextToken());
			
		}
		
		Arrays.sort(edges, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[2] - o2[2];
			}
		});
		
		parent = new int[N+1];
		for(int i=1;i<N+1;i++) {
			parent[i] = i;
		}
		
		long ans = 0;
		int pick = 0;
		int bigger = 0; 
		
		for(int i=0;i<M;i++) {
			int x = edges[i][0];
			int y = edges[i][1];
			
			if(findset(x) != findset(y)) {
				union(x, y);
				bigger = Math.max(edges[i][2], bigger);
				ans += edges[i][2];
				pick++;
			}
		}
		System.out.println(ans - bigger);
		
		
		
	}
	private static void union(int x, int y) {
		parent[findset(y)] = findset(x);
	}
	private static int findset(int x) {
		if(x != parent[x])
			parent[x] = findset(parent[x]);
		return parent[x];
	}
}
