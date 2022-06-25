import java.util.*;

public class s5_2609 {
	public static void gcd(int a, int b, int sum) {
		
		for(int i = Math.max(a, b); i >= 1; i--) {
			if(a%i == 0 && b%i == 0) {
				sum *= i;
				a /= i;
				b /= i;
				
				if(i != 1) {
					gcd(a, b, sum);
					break;
				}
				else {
					System.out.println(sum);
					System.out.println(sum*a*b);
					return;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = 1;
		
		gcd(a, b, sum);
	}

}
