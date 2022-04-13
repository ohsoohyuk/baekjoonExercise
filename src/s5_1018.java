import java.util.*;

public class s5_1018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int sum = 0;
		int num_arr[] = new int[(r-7)*(c-7)];
		String chess[][] = new String[r][c];
		sc.nextLine();
		
		for(int i = 0; i < r; i++) {
			String str = sc.nextLine();
			chess[i] = str.split("");
		}
		int q = 0;
		for(int a = 0; a < r-7; a++) {
			for(int b = 0; b < c-7; b++) {
				
				for(int l = 0; l < 4; l++) {
					for(int j = 0; j < 4; j++) {
						if(!chess[a+l*2][b+j*2].equals("W")) {
							sum += 1;
						}
					}
				}
				for(int l = 0; l < 4; l++) {
					for(int j = 0; j < 4; j++) {
						if(!chess[a+l*2+1][b+j*2+1].equals("B")) {
							sum += 1;
						}
					}
				}
				
				num_arr[q++] = sum;
			}
		}
		Arrays.sort(num_arr);
		if((64-num_arr[0]) < 32) {
			System.out.println(64-num_arr[0]);
		}
		else {
			System.out.println(num_arr[0]);
		}
	}
}