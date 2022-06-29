import java.util.*;

public class s5_2628 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int len = sc.nextInt();
		int high = sc.nextInt();
		
		int cut = sc.nextInt();
		
		int arr[][] = new int[cut+2][2];
		
		if(cut == 1) {
			int arr2[][] = new int[cut][2];
			
			for(int i = 0; i < cut; i++) {
				arr2[i][0] = sc.nextInt();
				arr2[i][1] = sc.nextInt();
			}
			
			if(arr2[0][0] == 0) {
				System.out.println(Math.max(high-arr2[0][1], arr2[0][1])*len);
				return;
			}
			else if(arr2[0][0] == 1) {
				System.out.println(Math.max(len-arr2[0][1], arr2[0][1])*high);
				return;
			}
		}
		
		int i = 0;
		
		for(i = 0; i < cut; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		arr[i][0] = 0;
		arr[i][1] = high;
		
		arr[i+1][0] = 1;
		arr[i+1][1] = len;
		
		Arrays.sort(arr, Comparator.comparing(o1 -> o1[0]));
		Arrays.sort(arr, (o1, o2) -> {
			if(o1[0] == o2[0]) {
				return Integer.compare(o1[1], o2[1]);
			}
			else {
				return Integer.compare(o1[0], o2[0]);
			}
		});
		
		
		i = 0;
		int j = 0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(arr[i][0] == 0) {
			i++;
			
			if(i == cut) {
				break;
			}
		}
		
		for(j = 0; j < i; j++) {
			if(j == 0) {
				list.add(arr[j][1]);
				
				if(j == i) {
					list.add(arr[j][1] - arr[j-1][1]);
				}
			}
			else {
				list.add(arr[j][1] - arr[j-1][1]);
			}
		}
		
		Collections.sort(list);
		
		high = list.get(i-1);
		
		list.clear();
		
		
		for(j = i; j <= cut+1; j++) {
			if(j == i) {
				list.add(arr[j][1]);
				
				if(j == cut+1) {
					list.add(arr[j][1] - arr[j-1][1]);
				}
			}
			else {
				list.add(arr[j][1] - arr[j-1][1]);
			}
		}
		
		if(j == cut+2) {
			Collections.sort(list);
			
			len = list.get(list.size()-1);
		}
		
		System.out.println(len*high);
	}

}
