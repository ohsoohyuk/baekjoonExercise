import java.util.*;

public class b2_2810 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String input = sc.next();
		int sum = 1;
		if(N == 1) {
			System.out.println(sum);
			return;
		}
		int i = 0;
		while(i < input.length()-1) {
			if(input.charAt(i) == 'S' && input.charAt(i+1) == 'L') {
				sum++;
			}
			else if(input.charAt(i) == 'S' && input.charAt(i+1) == 'S') {
				sum++;
			}
			else if(input.charAt(i) == 'L' && input.charAt(i+1) == 'L') {
				i++;
				sum++;
			}
			i++;
		}
		if(input.charAt(input.length()-1) == 'S') {
			if(sum+1 > N) {
				System.out.println(sum);
			}
			else {
				System.out.println(sum+1);
			}
		}
		else {
			System.out.println(sum);
		}
	}
}