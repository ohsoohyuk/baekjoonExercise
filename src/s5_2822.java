import java.util.*;

public class s5_2822 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[8][2];
		
		for(int i = 0; i < 8; i++) {
			arr[i][1] = (i+1);
			arr[i][0] = sc.nextInt();
		}
		
		Arrays.sort(arr, Comparator.comparing(o1 -> o1[0]));
		Arrays.sort(arr, (o1, o2) -> {
			if(o1[0] == o2[0]) {
				return Integer.compare(o1[1], o2[1]);
			}
			else {
				return Integer.compare(o1[0], o2[0]);
			}
		});
		
		int tem[] = new int[5];
		
		for(int i = 0; i < 5; i++) {
			tem[i] = arr[i+3][1];
		}
		
		Arrays.sort(tem);
		
		System.out.println(arr[7][0]+arr[6][0]+arr[5][0]+arr[4][0]+arr[3][0]);
		System.out.println(tem[0]+ " " + tem[1]+ " " + tem[2]+ " " + tem[3]+ " " +tem[4]);
	}

}
