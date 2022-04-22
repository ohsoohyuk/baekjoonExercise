import java.util.*;

public class s5_1181 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String number = sc.next();
		int sum = 0;
		
		for(int i = 0; i < number.length(); i++) {
			if(number.charAt(i) == '0') {
				if(sum == 0 && i < number.length()-1) {
					sum += Character.getNumericValue(number.charAt(i)) + Character.getNumericValue(number.charAt(i+1));
					i++;
				}
				else {
					sum += Character.getNumericValue(number.charAt(i));
				}
			}
			else if(number.charAt(i) != '0') {
				if(sum == 0) {
					sum += 1;
					sum *= Character.getNumericValue(number.charAt(i));
				}
				else {
					sum *= Character.getNumericValue(number.charAt(i));
				}
			}
		}
		System.out.println(sum);
	}
}