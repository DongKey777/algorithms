import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;

class Solution
{	static int max = 0;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
	

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] flyMap = new int[N][N];
            
            for(int i=0; i<N; i++){
            	for(int j=0; j<N; j++){
                    flyMap[i][j] = sc.nextInt();
            	}
            }
            
            int x = N-M;
            int y = N-M;
            
            for(int i=0; i<=x; i++){
                for(int j=0; j<=y; j++) {
                    Check(flyMap, i, j, M);
                }
            }
            System.out.println("#" + test_case+ " " + max);
            max = 0;
		}
	}
 
 	public static void Check(int[][] flyMap, int x, int y, int m ) {
    	int flyDeath = 0;
        for(int i=x; i<x+m; i++){
            for(int j=y; j<y+m; j++){
                flyDeath += flyMap[i][j];
            }
        }
        max = Math.max(max,flyDeath);
    }
    
    
}