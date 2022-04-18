import java.util.*;

public class s5_1064 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		double AB = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
		double BC = Math.sqrt(Math.pow((x3-x2), 2)+Math.pow((y3-y2), 2));
		double CA = Math.sqrt(Math.pow((x1-x3), 2)+Math.pow((y1-y3), 2));
		
		if((x2-x1)*(y3-y1) == (y2-y1)*(x3-x1)) {
			System.out.println(-1.0);
		}
		else {
			double arr[] = {AB, BC, CA};
			Arrays.sort(arr);
			System.out.println((arr[2]+arr[1])*2 - (arr[1]+arr[0])*2);
		}
	}
}