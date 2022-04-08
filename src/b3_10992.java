import java.util.*;

public class b3_10992 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		
		for(int i = 0; i < n-1; i++) {
			for(int j = i; j < n-1; j++) {
				System.out.print(' ');
			}
			System.out.print("*");
			
			for(int j = 1; j < (i*2); j++) {
				System.out.print(' ');
				if(j == i*2-1) {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
		
		for(int i = 1; i <= n; i++) {
			System.out.print('*');
		}
		for(int i = 1; i <= n-1; i++) {
			System.out.print('*');
		}
	}

}
