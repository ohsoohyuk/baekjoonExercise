import java.util.*;

public class b2_11721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		int a = input.length()/10;
		int b = input.length()%10;
		int i = 0;
		
		for(i = 0; i < a; i++) {
			System.out.println(input.substring(i*10, (i+1)*10));
		}
		System.out.println(input.substring(i*10, i*10+b));
	}

}
