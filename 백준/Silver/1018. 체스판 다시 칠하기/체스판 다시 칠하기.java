import java.util.*;
public class Main {
    static int min = 64;
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String nm = scanner.nextLine();
        int n = Integer.parseInt(nm.split(" ")[0]);
        int m = Integer.parseInt(nm.split(" ")[1]);


        boolean[][] map = new boolean[n][m] ;
        for(int i=0; i<n ; i++) {
            String[] stringLine = scanner.nextLine().split("");

            for(int j=0; j<m; j++) {
                if (stringLine[j].equals("W")) map[i][j] = true;
            }
        }

        int maxN = n-7;
        int maxM = m-7;
        for(int i=0; i<maxN; i++){
            for (int j=0; j<maxM; j++){
                find(i,j, map);
            }
        }
        System.out.println(min);
    }

    public static void find(int x, int y, boolean[][] map) {
        int endX = x + 8;
        int endY = y + 8;
        int count = 0;
        boolean TF = map[x][y];


        for (int i = x ; i<endX; i++) {
            for (int j = y; j < endY; j++) {
                if (map[i][j] != TF) {
                    count++;
                }

                TF = !TF;
            }
            TF = !TF;
        }

        count = Math.min(count, 64-count);
        min = Math.min(min, count);
    }
}