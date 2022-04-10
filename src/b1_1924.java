import java.util.*;

public class b1_1924 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= b; i++) {
			sum += a[i-1];
		}
		sum += c;
		
		int tem = 1;
		
		while(sum > tem) {
			tem += 7;
		}
		
		
		switch(tem-sum) {
		case 0:
			System.out.println("MON");
			break;
		case 1:
			System.out.println("SUN");
			break;
		case 2:
			System.out.println("SAT");
			break;
		case 3:
			System.out.println("FRI");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("WED");
			break;
		case 6:
			System.out.println("TUE");
			break;
		}
	}

}
