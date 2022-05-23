import java.util.*;

public class s5_1789 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long s = sc.nextLong();
		
		long i = 1;
		while(true) {
			long sum = (i*(i+1)) / 2;
			if(sum == s) {
				System.out.println(i);
				return;
			}
			else if(sum > s) {
				System.out.println(i-1);
				return;
			}
			i++;
		}
	}

}