import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] strArr1 = br.readLine().split(" ");
		String[] strArr2 = br.readLine().split(" ");

		int N = Integer.parseInt(strArr1[0]);
		int M = Integer.parseInt(strArr1[1]);

		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(strArr2[i]);
		}

		System.out.println(search(arr, N, M));
	}

	static int search(int[] arr, int N, int M) {
		int result = 0;
		for (int i = 0; i < N - 2; i++) {
			if (arr[i] > M) 
				continue;
			for (int j = i + 1; j < N - 1; j++) {
				if (arr[i] + arr[j] > M)
					continue;
				for (int k = j + 1; k < N; k++) {
					int temp = arr[i] + arr[j] + arr[k];

					if (M == temp) 
						return temp;

					if (result < temp && temp < M)
						result = temp;
				}
			}
		}
		return result;
	}
}