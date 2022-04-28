import java.util.*;

public class s5_1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int sum = 0;
		for(int i = 0; i < t; i++) {
			ArrayList<String> one = new ArrayList<String>();
			int a = 101;
			String word = sc.next();
			String word_arr[] = word.split("");
			one.add(word_arr[0]);
			for(int j = 0; j < word.length(); j++) {
				int b = one.size();
				for(int k = 0; k < b; k++) {
					if(one.size() != 1 && word_arr[j].equals(one.get(k)) && !word_arr[j].equals(one.get(one.size()-1))) {
						a = 102;
						break;
					}
					else if(!word_arr[j].equals(one.get(k)) && k == one.size()-1) {
						one.add(word_arr[j]);
					}
				}
				if(a == 102) {
					sum--;
					break;
				}
			}
			sum++;
		}
		System.out.println(sum);
	}
}