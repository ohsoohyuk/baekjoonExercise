import java.util.*;

public class b1_9625 {
	static int arr[] = new int[46];
	static int AB(int K) {
		if(K == 0) {
			return arr[K] = 0;
		}
		if(K == 1) {
			return arr[K] = 1;
		}
		if(arr[K] != 0) {
			return arr[K];
		}
		return arr[K] = AB(K-1)+AB(K-2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		AB(K);
		System.out.println(arr[K-1] + " " + arr[K]);
	}
}