import java.util.*;

public class s5_2089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		if(n == 0) {
			System.out.println(0);
			return;
		}
		
		StringBuilder output = new StringBuilder("");
		
		while(n != 0) {
			if(n % -2 == 0) {
				output.append("0");
				
				n /= -2;
			}
			else {
				output.append("1");
				
				n = (n-1)/-2;
			}
		}
		
		System.out.println(output.reverse());
	}

}
