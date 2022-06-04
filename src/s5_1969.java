import java.util.*;

public class s5_1969 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		List<String> arr = new ArrayList<String>();
		
		int count = 0;
		
		char tem_arr[] = new char[n];
		
		char output[] = new char[m];
		
		for(int i = 0; i < n; i++) {
			arr.add(sc.next());
		}
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				tem_arr[j] = arr.get(j).charAt(i);
			}
			
			Arrays.sort(tem_arr);
			
			int c = 1;
			int d = 1;
			
			char tem_c = tem_arr[0];
			
			for(int j = 0; j < n-1; j++) {
				if(tem_arr[j] != tem_arr[j+1]) {
					if(d < c) {
						
						d = c;
						c = 1;
						
						tem_c = tem_arr[j];
						
					}
					else {
						c = 1;
					}
				}
				else {
					c++;
					
					
					if(j == n-2 && d < c) {
						tem_c = tem_arr[j];
					}
				}
			}
			
			
			output[i] = tem_c;
			
			
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(output[j] != arr.get(i).charAt(j)) {
					count++;
				}
			}
		}
		
		for(int i = 0; i < m; i++) {
			System.out.print(output[i]);
		}
		System.out.println();
		System.out.println(count);
		
	}

}