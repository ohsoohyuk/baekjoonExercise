import java.util.*;

public class b1_2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int five = N/5;
		int three = N/3;
		
		for(int i = five; i > 0; i--) {
			if(((N-(5*i))%3) == 0) {
				System.out.println(i+((N-(5*i))/3));
				return;
			}
		}
		for(int j = three; j > 0; j--) {
			if(((N-(3*j))%5) == 0) {
				System.out.println(j+((N-(3*j))/5));
				return;
			}
		}
		if(N%5 == 0) {
			System.out.println(five);
		}
		else if(N%3 == 0) {
			System.out.println(three);
		}
		else {
			System.out.println(-1);
		}
	}
}