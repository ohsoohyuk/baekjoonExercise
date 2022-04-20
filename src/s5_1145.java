import java.util.*;

public class s5_1145 {
	static int gcd(int a, int b) {
		while(b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}
	static int lcm(int a, int b) {
		return a * b / gcd(a,b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input[] = new int[5];
		int hello[] = new int[10];
		for(int i = 0; i < 5; i++) {
			input[i] = sc.nextInt();
		}
		int answer = 0;
		answer = lcm(input[0], input[1]);
		hello[0] = lcm(answer, input[2]);
		hello[1] = lcm(answer, input[3]);
		hello[2] = lcm(answer, input[4]);
		
		answer = lcm(input[0], input[2]);
		hello[3] = lcm(answer, input[3]);
		hello[4] = lcm(answer, input[4]);
		
		answer = lcm(input[0], input[3]);
		hello[5] = lcm(answer, input[4]);
		
		answer = lcm(input[1], input[2]);
		hello[6] = lcm(answer, input[3]);
		hello[7] = lcm(answer, input[4]);
		
		answer = lcm(input[1], input[3]);
		hello[8] = lcm(answer, input[4]);
		
		answer = lcm(input[2], input[3]);
		hello[9] = lcm(answer, input[4]);
		
		Arrays.sort(hello);
		System.out.println(hello[0]);
	}
}