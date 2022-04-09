import java.util.*;

public class b2_10870 {
	static int arr[] = new int[21];
	static int fibonachi(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		if(arr[n] != 0) {
			return arr[n];
		}
		return arr[n] = fibonachi(n-1)+fibonachi(n-2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(fibonachi(sc.nextInt()));
	}
}