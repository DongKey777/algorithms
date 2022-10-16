import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        HashMap<Integer,Integer> numbers = new HashMap<>();
        
        for(int i=0; i<N; i++){
            numbers.put(sc.nextInt(), 0);
        }
        
        int M = sc.nextInt();
        for(int i=0; i<M; i++){
            int num = sc.nextInt();
            if (numbers.containsKey(num)){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }
    }
}