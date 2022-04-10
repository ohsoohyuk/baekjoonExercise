import java.util.*;

public class b1_15904 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char[] ucpc = {'U', 'C', 'P', 'C'};
        int index = 0;

        for(int i=0; i<input.length(); i++) {
            if(input.charAt(i) == ucpc[index]) {
                index++;
            }

            if(index == 4) {
                System.out.println("I love UCPC");
                return;
            }
        }
        System.out.println("I hate UCPC");
	}
}