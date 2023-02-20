import java.util.Scanner;

public class Main {
	static int N, S;
	static int[] arr;
	static int ans = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		S = sc.nextInt();
		arr = new int[N];
		for (int i = 0; i < N; i++)
			arr[i] = sc.nextInt();

		dfs(0, 0);

		System.out.println(S == 0 ? ans - 1 : ans);

	}

	private static void dfs(int dep, int sum) {
		if (dep == N) {
			if (sum == S)
				ans++;
			return;
		}

		dfs(dep + 1, sum + arr[dep]);
		dfs(dep + 1, sum);
	}
}