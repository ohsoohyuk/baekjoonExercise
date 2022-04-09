import java.util.*;

public class b2_14659 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		int sum[] = new int[N-1];
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < N-1; i++) {
			for(int j = i+1; j < N; j++) {
				if(arr[i] > arr[j]) {
					sum[i] += 1;
				}
				else {
					sum[i] += 0;
					break;
				}
			}
		}
		Arrays.sort(sum);
		System.out.println(sum[N-2]);
	}
}