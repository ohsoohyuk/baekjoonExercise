import java.util.*;

public class s5_1037 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int num[] = new int[number];
		for(int i = 0; i < number; i++) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		System.out.println(num[0] * num[number-1]);
	}
}