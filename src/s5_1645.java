import java.util.*;

public class s5_1645 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		int a = 0;
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		for(int i = 0 ; i < N-1; i++) {
			if(arr[i] != arr[i+1]) {
				a = 1;
				break;
			}
		}
		
		if(a == 0) {
			if(arr[0] == 0) {
				System.out.println(0);
				
			}
			else if(arr[0] == 1) {
				System.out.println(N);
				
			}
			else {
				System.out.println(arr[0]+1);
				
			}
		}
		else if(a == 1) {
			System.out.println(arr[N-1]);
		}
	}
}