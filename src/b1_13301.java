import java.util.*;

public class b1_13301 {
	static long arr[] = new long[81];
	static long rec(int n) {
		if(n == 1) {
			return arr[n] = 1;
		}
		if(n == 2) {
			return arr[n] = 1;
		}
		if(arr[n] != 0) {
			return arr[n];
		}
		return arr[n] = rec(n-2)+rec(n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr[1] = 1;
		rec(n);
		long sum = arr[n]*2+(arr[n-1]+arr[n])*2;
		System.out.println(sum);
	}
}