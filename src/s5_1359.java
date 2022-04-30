import java.util.*;

public class s5_1359 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double N = sc.nextInt();
		double M = sc.nextInt();
		double K = sc.nextInt();
		double result = 1;
		
		for(int i = 0; i < M; i++) {
			result *= (M-i)/(N-i);
		}
		
		if(M == K) {
			System.out.println(result);
		}
		else {
			System.out.println(1-result);
		}
	}
}