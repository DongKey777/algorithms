import java.util.*;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    static ArrayList<Integer> answer = new ArrayList<>();
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
        
		for(int test_case = 1; test_case <= T; test_case++)
		{
            int number = sc.nextInt();
            int count = 0;
            ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2,3,5,7,11));
            while(!nums.isEmpty()) {
                while(true){
                    if (number % nums.get(0) == 0 ) {
                        number = number/nums.get(0);
                        count ++;
                    }else {
                        answer.add(count);
                        nums.remove(0);
                        count = 0;
                        break;
                    }
           		}
           }
           String s = "#" + test_case + " ";
           for(int i=0; i<answer.size(); i++){
               s += answer.get(i);
               if (i != answer.size()-1) s += " ";
           }
           System.out.println(s);
            answer.clear();
      
		}
	}
}