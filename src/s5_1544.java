import java.util.*;

public class s5_1544 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		list.add(sc.next());
		for(int i = 0; i < N-1; i++) {
			String input = sc.next();
			StringBuilder tem = new StringBuilder(input);
			int size = list.size();
			
			int a = 0;
			for(int j = 0; j < size; j++) {
				for(int k = 0; k < tem.length(); k++) {
					tem.append(tem.charAt(0)).deleteCharAt(0);
					String temp = tem.substring(0);
					if(list.get(j).equals(temp)) {
						a = 1;
						break;
					}
					else if(j == list.size()-1 && k == tem.length()-1) {
						a = 1;
						list.add(input);
						break;
					}
				}
				if(a == 1) {
					break;
				}
			}
		}
		System.out.println(list.size());
	}
}