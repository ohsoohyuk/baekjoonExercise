import java.util.*;

public class s5_1417 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M[] = new int[N];
		int sum = 0;
		for(int i = 0; i < N; i++) {
			M[i] = sc.nextInt();
		}
		if(N == 1) {
			System.out.println(0);
			return;
		}
		Arrays.sort(M, 1, M.length);
		
		while(true) {
			if(M[0] <= M[M.length-1]) {
				M[0] += 1;
				M[M.length-1] -= 1;
				sum += 1;
			}
			else {
				System.out.println(sum);
				return;
			}
			Arrays.sort(M, 1, M.length);
		}
	}
}