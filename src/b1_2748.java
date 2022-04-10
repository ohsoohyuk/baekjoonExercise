import java.util.Scanner;

public class b1_2748 {
	static long arr[] = new long[91];
	static long fibonachi(int n) {
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