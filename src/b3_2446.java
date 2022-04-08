import java.util.*;

public class b3_2446 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < i-1; j++) {
				System.out.print(' ');
			}
			for(int j = i-1; j < n; j++) {
				System.out.print('*');
			}
			for(int j = i; j < n; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		for(int i = n-1; i >= 1; i--) {
			for(int j = 0; j < i-1; j++) {
				System.out.print(' ');
			}
			for(int j = i-1; j < n; j++) {
				System.out.print('*');
			}
			for(int j = i; j < n; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
