import java.util.*;

public class s5_1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String number = sc.next();
		String result[] = number.split("");
		int arr[] = new int[result.length];
		for(int i = 0; i < result.length; i++) {
			arr[i] = Integer.parseInt(result[i]);
		}
		Arrays.sort(arr);
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}
}