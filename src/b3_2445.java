import java.util.*;

public class b3_2445 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = n; i >= 1; i--) {
			for(int j = 0; j <= n-i; j++) {
				System.out.print('*');
			}
			for(int j = n-i; j < n-1; j++) {
				System.out.print(' ');
			}
			for(int j = n-i; j < n-1; j++) {
				System.out.print(' ');
			}
			for(int j = 0; j <= n-i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		for(int i = n; i >= 1; i--) {
			for(int j = 0; j < i-1; j++) {
				System.out.print('*');
			}
			for(int j = i-1; j < n; j++) {
				System.out.print(' ');
			}
			for(int j = i-1; j < n; j++) {
				System.out.print(' ');
			}
			for(int j = 0; j < i-1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
