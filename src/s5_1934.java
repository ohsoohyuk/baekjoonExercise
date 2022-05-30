import java.util.*;

public class s5_1934 {
	static int gcd(int a, int b, int sum) {
		
		
		for(int i = Math.max(a, b); i >= 1; i--) {
			if(a%i == 0 && b%i == 0) {
				
				if(i == 1) {
					break;
				}
				else {
					a /= i;
					b /= i;
					sum *= i;
					
					gcd(a, b, sum);
					
					break;
				}
				
			}
		}
		
		return sum *= a*b;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int arr[] = new int[T];
		
		
		for(int i = 0; i < T; i++) {
			int sum = 1;
			
			sum = gcd(sc.nextInt(), sc.nextInt(), sum);
			
			arr[i] = sum;
		}
		
		for(int i = 0; i < T; i++) {
			System.out.println(arr[i]);
		}
	}

}
