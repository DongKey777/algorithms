
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        sc.nextLine();
		for(int test_case = 1; test_case <= T; test_case++)
		{	
			String og = sc.nextLine().trim();
            StringBuilder ogBuffer = new StringBuilder(og);
            String reverse = ogBuffer.reverse().toString();
            if (reverse.equals(og)) System.out.println("#" + test_case + " " + "1");
            else  System.out.println("#" + test_case + " " + "0");
		}
	}
}