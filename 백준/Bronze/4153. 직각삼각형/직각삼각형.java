import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tri = new int[3];
        while(true) {
            for(int i=0; i<3; i++){
                tri[i] = sc.nextInt();
                if (tri[i] == 0) return;
            }

            Arrays.sort(tri);
            if(tri[2]*tri[2] == tri[1]*tri[1] + tri[0] * tri[0]) {
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }
    }
}