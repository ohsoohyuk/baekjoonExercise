import java.util.*;

public class s5_1380 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> final_name = new ArrayList<String>();
		
		int n = sc.nextInt();
		sc.nextLine();
		while(n != 0) {
			char alp[] = new char[n];
			ArrayList<String> tem_name = new ArrayList<String>();
			ArrayList<Integer> num = new ArrayList<Integer>();
			for(int i = 0; i < n; i++) {
				tem_name.add(sc.nextLine());
			}
			
			if(n == 1) {
				
			}
			else {
				for(int i = 0; i < n; i++) {
					int input = sc.nextInt();
					if(i == 0) {
						num.add(input);
					}
					else {
						
					}
					for(int j = 0; j < num.size(); j++) {
						if(input != num.get(j)) {
							
							break;
						}
					}
					num.add(sc.nextInt());
					char a = sc.next().charAt(0);
					
					
					if(a == 'B') {
						alp[i] = 'A';
					}
					else if(a == 'A') {
						alp[i] = 'B';
					}
				}
			}
			
			for(int i = 0; i < n-1; i++) {
				int ser = sc.nextInt();
				char a = sc.next().charAt(0);
				if(alp[ser-1] == a) {
					tem_name.remove(ser-1);
					tem_name.add(ser-1, "");
				}
			}
			
			for(int i = 0; i < tem_name.size(); i++) {
				if(!tem_name.get(i).equals("")) {
					final_name.add(tem_name.get(i));
					break;
				}
			}

			n = sc.nextInt();
			sc.nextLine();
		}
		
		for(int i = 1; i <= final_name.size(); i++) {
			System.out.println(i + " " + final_name.get(i-1));
		}
	}
}