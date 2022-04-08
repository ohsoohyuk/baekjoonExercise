import java.util.*;

public class b3_10952 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		while(a != 0 && b != 0) {
			list.add(a+b);
			
			a = sc.nextInt();
			b = sc.nextInt();
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}