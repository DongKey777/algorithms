import java.util.*;

public class Main {
    static boolean check;
    static String answer;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<>();
        
        while(true) {
            String number = Integer.toString(sc.nextInt());
            if(number.equals("0")) break;
            else numbers.add(number);
        }
      
        for(String number : numbers) {
            check = true;
            for(int i=0; i<number.length(); i++) {
                if (number.charAt(number.length()-i-1) != number.charAt(i)) {
                    check = false;
                    break;
                }
            }
            answer = (check) ? "yes" : "no";
            System.out.println(answer);
        }
        
        
    }
}