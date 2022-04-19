import java.util.*;

public class s5_1094 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = 64;
		int i = 0;
		
		while(x > 0) {
			if(y > x) {
				y /= 2;
			}
			else {
				i++;
				x -= y;
			}
		}
		System.out.println(i);
	}
}