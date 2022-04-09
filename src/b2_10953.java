import java.util.*;

public class b2_10953 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int arr[] = new int[T];
		
		for(int i = 0; i < T; i++) {
			String input = sc.next();
			int a = Integer.parseInt(input.substring(0,1));
			int b = Integer.parseInt(input.substring(2,3));
			
			arr[i] = a+b;
		}
		
		for(int i = 0; i < T; i++) {
			System.out.println(arr[i]);
		}
	}

}