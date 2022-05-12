import java.util.*;

public class s5_1440 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int a = Integer.parseInt(input.substring(0, 2));
		int b = Integer.parseInt(input.substring(3, 5));
		int c = Integer.parseInt(input.substring(6, 8));
		int count = 0;
		if(0 <= a && a <= 59 && 0 <= b && b <= 59 && 0 <= c && c <= 59) {
			if(1 <= a && a <= 12) {
				count += 2;
			}
			if(1 <= b && b <= 12) {
				count += 2;
			}
			if(1 <= c && c <= 12) {
				count += 2;
			}
			System.out.println(count);
		}
		else {
			System.out.println(0);
		}
	}
}