import java.util.*;

public class s5_1475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int count[] = new int[input.length()];
		int c = 0;
		
		for(int i = 0; i < input.length(); i++) {
			for(int j = 0; j < input.length(); j++) {
				if(input.charAt(i) != '6' && input.charAt(i) != '9' && input.charAt(i) == input.charAt(j)) {
					c++;
				}
			}
			count[i] = c;
			c = 0;
		}
		Arrays.sort(count);
		
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '6') {
				c++;
			}
			else if(input.charAt(i) == '9') {
				c++;
			}
		}
		
		if(c%2 == 0) {
			System.out.println(Math.max(count[input.length()-1], c/2));
		}
		else if(c%2 == 1) {
			System.out.println(Math.max(count[input.length()-1], c/2+1));
		}
	}
}