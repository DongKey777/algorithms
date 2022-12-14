import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for(int i=0; i<N; i++){
            int number = sc.nextInt();
            if(isPrime(number)) count++;
        }
        System.out.println(count);
    }
    
    static boolean isPrime(int n) {
        if (n==1) return false;
        for (int i=2; i<=Math.sqrt(n); i++){
            if (n%i==0) return false;
        }
        
        return true;
    }
}