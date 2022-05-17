import java.util.*;

public class s5_1476 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		int E = sc.nextInt();
		int S = sc.nextInt();
		int M = sc.nextInt();
		int tem_E = 1;
		int tem_S = 1;
		int tem_M = 1;
		while(true) {
			if(tem_E == E && tem_S == S && tem_M == M) {
				System.out.println(count);
				break;
			}
			else {
				if(tem_E+1 > 15) {
					tem_E = 1;
				}
				else {
					tem_E += 1;
				}
				if(tem_S+1 > 28) {
					tem_S = 1;
				}
				else {
					tem_S += 1;
				}
				if(tem_M+1 > 19) {
					tem_M = 1;
				}
				else {
					tem_M += 1;
				}
				count++;
			}
		}
	}
}