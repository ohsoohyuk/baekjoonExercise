import java.util.*;

public class s5_2567 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		
		int input[][] = new int[n][2];
		
		int x = 0;
		int y = 0;
		
		for(int i = 0; i < n; i++) {
			input[i][0] = sc.nextInt();
			input[i][1] = sc.nextInt();
			
			if(input[i][0] > x) {
				x = input[i][0];
			}
			if(input[i][1] > y) {
				y = input[i][1];
			}
		}
		
		
		int arr[][] = new int[y+10][x+10];
		
		
		for(int i = 0; i < n; i++) {
			for(int j = input[i][1]-1; j < input[i][1]+9; j++) {
				for(int k = input[i][0]-1; k < input[i][0]+9; k++) {
					arr[j][k] = 1;
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = input[i][1]; j < input[i][1]+8; j++) {
				for(int k = input[i][0]; k < input[i][0]+8; k++) {
					arr[j][k] = 0;
				}
			}
		}
		
		/*for(int i = 0; i < y+10; i++) {
			for(int j = 0; j < x+7; j++) {
				if(arr[i][j] == 0 && arr[i][j+1] == 1 && arr[i][j+2] == 1 && arr[i][j+3] == 0) {
					arr[i][j+1] = 0;
					arr[i][j+2] = 0;
				}
			}
		}*/
		
		for(int i = 0; i < y+10; i++) {
			for(int j = 0; j < x+10; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		int count = 0;
		
		for(int i = 0; i < y+10; i++) {
			for(int j = 0; j < x+10; j++) {
				count += arr[i][j];
			}
		}
		
		System.out.println(count);
		
	}

}
