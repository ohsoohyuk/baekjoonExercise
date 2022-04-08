import java.util.*;

public class b3_11021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int arr[] = new int[T];
		for(int i = 0; i < T; i++) {
			arr[i] = sc.nextInt() + sc.nextInt();
		}
		
		for(int i = 0; i < T; i++) {
			System.out.println("Case #" + (i+1) + ": " + arr[i]);
		}
	}

}
