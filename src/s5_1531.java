import java.util.*;

public class s5_1531 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int pic[][] = new int[101][101];
		
		for(int i = 0; i < 101; i++) {
			for(int j = 0; j < 101; j++) {
				pic[i][j] = 0;
			}
		}
		
		for(int i = 0; i < N; i++) {
			int tem_le_x = sc.nextInt();
			int tem_le_y = sc.nextInt();
			int tem_ri_x = sc.nextInt();
			int tem_ri_y = sc.nextInt();
			for(int j = tem_le_y; j <= tem_ri_y; j++) {
				for(int k = tem_le_x; k <= tem_ri_x; k++) {
					pic[j][k] += 1;
				}
			}
		}
		
		int sum = 0;
		for(int i = 0; i < 101; i++) {
			for(int j = 0; j < 101; j++) {
				if(pic[i][j] > M) {
					sum++;
				}
			}
		}
		System.out.println(sum);
	}
}