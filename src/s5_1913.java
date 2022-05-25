import java.util.*;

public class s5_1913 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int val = sc.nextInt();
		
		int arr[][] = new int[n][n];
		
		int x = 0;
		int y = 0;
		
		if(n%2 != 0) {
			arr[n/2][n/2] = 1;
			
			x = n/2;
			y = n/2;
		}
		else {
			arr[n/2][n/2-1] = 1;
			
			x = n/2;
			y = n/2-1;
			
		}
		
		
		int a = 0;
		int b = 0;
		
		int i = 1;
		
		int number = 2;
		
		if(n%2 == 0) {
			
			while(i < n-1) {
				arr[--x][y] = number++;
				
				for(int j = 1; j <= i; j++) {
					arr[x][++y] = number++;
				}
				for(int j = 1; j <= i+1; j++) {
					arr[++x][y] = number++;
				}
				for(int j = 1; j <= i+1; j++) {
					arr[x][--y] = number++;
				}
				for(int j = 1; j <= i+1; j++) {
					arr[--x][y] = number++;
				}
				
				i += 2;
			}
			
			while(i < n) {
				arr[--x][y] = number++;
				
				for(int j = 1; j <= i; j++) {
					arr[x][++y] = number++;
				}
				for(int j = 1; j <= i; j++) {
					arr[++x][y] = number++;
				}
				
				i += 2;
			}
		}
		else {
			
			while(i < n) {
				arr[--x][y] = number++;
				
				for(int j = 1; j <= i; j++) {
					arr[x][++y] = number++;
				}
				for(int j = 1; j <= i+1; j++) {
					arr[++x][y] = number++;
				}
				for(int j = 1; j <= i+1; j++) {
					arr[x][--y] = number++;
				}
				for(int j = 1; j <= i+1; j++) {
					arr[--x][y] = number++;
				}
				
				i += 2;
			}
		}

		
		
		for(i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
				
				if(arr[i][j] == val) {
					a = i+1;
					b = j+1;
				}
			}
			
			System.out.println();
		}
		
		System.out.println(a + " " + b);
	}

}