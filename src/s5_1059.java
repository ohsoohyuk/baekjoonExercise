import java.util.*;

public class s5_1059 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int arr[] = new int[number];
		int i = 0;
		for(i = 0; i < number; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int n = sc.nextInt();
		
		if(number == 1) {
			System.out.println(0);
			return;
		}
		else if(n < arr[0]) {
			if(2 == arr[0]) {
				System.out.println(0);
				return;
			}
			else {
				int b = ((arr[0]-n)*n)-1;
				System.out.println(b);
				return;
			}
		}
		
		for(i = 0; i < number-1; i++) {
			if(arr[i] <= n && n <= arr[i+1]) {
				if(n == arr[i] || n == arr[i+1]) {
					System.out.println(0);
					break;
				}
				else if(arr[0] == 1 && n < arr[1]) {
					int b = (arr[1]-n)*(n-1)-1;
					System.out.println(b);
					break;
				}
				else {
					if(arr[i] + 1 == n) {
						System.out.println(arr[i+1] - arr[i] - 2);
						break;
					}
					else {
						int dup = arr[i+1]-n;
						int b = ((n-(arr[i]+1))*dup)+dup-1;
						System.out.println(b);
						break;
					}
				}
			}
		}
	}
}