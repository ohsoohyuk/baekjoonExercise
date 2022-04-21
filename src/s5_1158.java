import java.util.*;

public class s5_1158 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<Integer>();
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			q.add(i);
		}
		
		System.out.print("<");
		while(q.size() != 1) {
			for(int i = 0; i < K-1; i++) {
				q.offer(q.poll());
			}
			System.out.print(q.poll() + ", ");
		}
		System.out.print(q.poll() + ">");
	}
}