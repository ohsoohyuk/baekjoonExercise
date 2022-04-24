import java.util.*;

public class s5_1246 {
	static class pri {
		int pride;
		int sum_pride;
		public pri(int pride, int sum_pride) {
			this.pride = pride;
			this.sum_pride = sum_pride;
		}
		public String toString() {
			return pride + " " + sum_pride;
		}
	}
	static class priComparator implements Comparator<pri>{
		public int compare(pri a, pri b) {
			if(a.sum_pride > b.sum_pride) {
				return 1;
			}
			else if(a.sum_pride < b.sum_pride) {
				return -1;
			}
			else {
				return 0;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<pri> list = new ArrayList<pri>();
		int N = sc.nextInt();
		int M = sc.nextInt();
		int p[] = new int[M];
		for(int i = 0; i < M; i++) {
			p[i] = sc.nextInt();
		}
		Arrays.sort(p);
		
		if(N >= M) {
			for(int i = 0; i < M; i++) {
				list.add(new pri(p[i], p[i]*(M-i)));
			}
			list.sort(new priComparator());
			System.out.println(list.get(M-1));
		}
		else if(N < M) {
			for(int i = M-N; i < M; i++) {
				list.add(new pri(p[i], p[i]*(M-i)));
			}
			list.sort(new priComparator());
			System.out.println(list.get(N-1));
		}
	}
}