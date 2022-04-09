import java.util.*;

public class b2_5585 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 1000-sc.nextInt();
		int sum = 0;
		while(true) {
			if(input > 500) {
				input -= 500;
				sum++;
			}
			else if(100 <= input && input < 500) {
				input -= 100;
				sum++;
			}
			else if(50 <= input && input < 100) {
				input -= 50;
				sum++;
			}
			else if(10 <= input && input < 50) {
				input -= 10;
				sum++;
			}
			else if(5 <= input && input < 10) {
				input -= 5;
				sum++;
			}
			else {
				input -= 1;
				sum++;
			}
			if(input == 0) {
				System.out.println(sum);
				break;
			}
		}
	}
}