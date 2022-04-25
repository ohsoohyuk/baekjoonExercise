import java.util.*;

public class s5_1251 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<StringBuilder> word = new ArrayList<StringBuilder>();
		StringBuilder str1 = new StringBuilder("");
		StringBuilder str2 = new StringBuilder("");
		StringBuilder str3 = new StringBuilder("");
		StringBuilder input = new StringBuilder(sc.next());
		StringBuilder result = new StringBuilder("");
		for(int i = 1; i < input.length()-1; i++) {
			for(int j = 2+i-1; j < input.length(); j++) {
				str1 = new StringBuilder(input.substring(0, i));
				str1.reverse();
				str2 = new StringBuilder(input.substring(i, j));
				str2.reverse();
				str3 = new StringBuilder(input.substring(j, input.length()));
				str3.reverse();
				result.append(str1);
				result.append(str2);
				result.append(str3);
				
				word.add(result);
				result = new StringBuilder("");
			}
		}
		
		Collections.sort(word);
		System.out.println(word.get(0));
	}
}