import java.util.*;

public class b2_11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String input = sc.next();
		
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum += Integer.parseInt(input.substring(i, i+1));
		}
		
		System.out.println(sum);
	}
}
