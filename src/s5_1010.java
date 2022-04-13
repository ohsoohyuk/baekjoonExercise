import java.util.*;

public class s5_1010 {
	static double fac(int n) {
		if(n == 0) {
			return 1;
		}
		return n*fac(n-1);
	}
	static double c(int r, int n) {
		return Math.round(fac(n)/(fac(r) * fac(n-r)));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 1; i <= t; i++) {
			System.out.println((int)c(sc.nextInt(), sc.nextInt()));
		}
	}
}