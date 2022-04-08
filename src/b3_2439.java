import java.util.*;

public class b3_2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int j = n; j >= 1; j--) {
			for(int i = 0; i < j-1; i++) {
				System.out.print(' ');
			}
			for(int i = j-1; i < n; i++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
