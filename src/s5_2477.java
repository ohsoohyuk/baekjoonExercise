import java.util.*;

public class s5_2477 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		
		int arr[][] = new int[6][2];
		
		for(int i = 0; i < 6; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		if(arr[0][1]+arr[1][1]+arr[2][1]+arr[3][1] == arr[4][1]+arr[5][1]) {
			System.out.println(((arr[4][1]*arr[5][1])-(arr[1][1]*arr[2][1]))*k);
		}
		else if(arr[1][1]+arr[2][1]+arr[3][1]+arr[4][1] == arr[5][1]+arr[0][1]) {
			System.out.println(((arr[5][1]*arr[0][1])-(arr[2][1]*arr[3][1]))*k);
		}
		else if(arr[2][1]+arr[3][1]+arr[4][1]+arr[5][1] == arr[0][1]+arr[1][1]) {
			System.out.println(((arr[0][1]*arr[1][1])-(arr[3][1]*arr[4][1]))*k);
		}
		else if(arr[3][1]+arr[4][1]+arr[5][1]+arr[0][1] == arr[1][1]+arr[2][1]) {
			System.out.println(((arr[1][1]*arr[2][1])-(arr[4][1]*arr[5][1]))*k);
		}
		else if(arr[4][1]+arr[5][1]+arr[0][1]+arr[1][1] == arr[2][1]+arr[3][1]) {
			System.out.println(((arr[2][1]*arr[3][1])-(arr[5][1]*arr[0][1]))*k);
		}
		else if(arr[5][1]+arr[0][1]+arr[1][1]+arr[2][1] == arr[3][1]+arr[4][1]) {
			System.out.println(((arr[3][1]*arr[4][1])-(arr[0][1]*arr[1][1]))*k);
		}
		
	}

}
