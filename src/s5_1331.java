import java.util.*;

public class s5_1331 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String chess[] = new String[36];
		for(int i = 0; i < 36; i++) {
			chess[i] = sc.next();
		}
		char arr[] = {'A','B','C','D','E','F'};
		
		
		for(int i = 0; i < 35; i++) {
			if(chess[i].charAt(0)+2 == chess[i+1].charAt(0)){
				if(chess[i].charAt(1)+1 == chess[i+1].charAt(1)) {}
				else if(chess[i].charAt(1)-1 == chess[i+1].charAt(1)) {}
				else {
					System.out.println("Invalid");
					return;
				}
			}
			else if(chess[i].charAt(1)+2 == chess[i+1].charAt(1)){
				if(chess[i].charAt(0)+1 == chess[i+1].charAt(0)) {}
				else if(chess[i].charAt(0)-1 == chess[i+1].charAt(0)) {}
				else {
					System.out.println("Invalid");
					return;
				}
			}
			else if(chess[i].charAt(0)-2 == chess[i+1].charAt(0)){
				if(chess[i].charAt(1)+1 == chess[i+1].charAt(1)) {}
				else if(chess[i].charAt(1)-1 == chess[i+1].charAt(1)) {}
				else {
					System.out.println("Invalid");
					return;
				}
			}
			else if(chess[i].charAt(1)-2 == chess[i+1].charAt(1)){
				if(chess[i].charAt(0)+1 == chess[i+1].charAt(0)) {}
				else if(chess[i].charAt(0)-1 == chess[i+1].charAt(0)) {}
				else {
					System.out.println("Invalid");
					return;
				}
			}
			else {
				System.out.println("Invalid");
				return;
			}
		}
		
		if(chess[35].charAt(0)+2 == chess[0].charAt(0)){
			if(chess[35].charAt(1)+1 == chess[0].charAt(1)) {}
			else if(chess[35].charAt(1)-1 == chess[0].charAt(1)) {}
			else {
				System.out.println("Invalid");
				return;
			}
		}
		else if(chess[35].charAt(1)+2 == chess[0].charAt(1)){
			if(chess[35].charAt(0)+1 == chess[0].charAt(0)) {}
			else if(chess[35].charAt(0)-1 == chess[0].charAt(0)) {}
			else {
				System.out.println("Invalid");
				return;
			}
		}
		else if(chess[35].charAt(0)-2 == chess[0].charAt(0)){
			if(chess[35].charAt(1)+1 == chess[0].charAt(1)) {}
			else if(chess[35].charAt(1)-1 == chess[0].charAt(1)) {}
			else {
				System.out.println("Invalid");
				return;
			}
		}
		else if(chess[35].charAt(1)-2 == chess[0].charAt(1)){
			if(chess[35].charAt(0)+1 == chess[0].charAt(0)) {}
			else if(chess[35].charAt(0)-1 == chess[0].charAt(0)) {}
			else {
				System.out.println("Invalid");
				return;
			}
		}
		else {
			System.out.println("Invalid");
			return;
		}
		
		Arrays.sort(chess);
		
		for(int i = 0; i < 6; i++) {
			if(chess[i*6].charAt(0) == arr[i] && chess[i*6+1].charAt(0) == arr[i] && chess[i*6+2].charAt(0) == arr[i] && 
				chess[i*6+3].charAt(0) == arr[i] && chess[i*6+4].charAt(0) == arr[i] && chess[i*6+5].charAt(0) == arr[i]) {
				for(int j = 1; j <= 6; j++) {
					if(Character.getNumericValue(chess[i*6+(j-1)].charAt(1)) != j) {
						System.out.println("Invalid");
						return;
					}
				}
			}
			else {
				System.out.println("Invalid");
				return;
			}
		}
		System.out.println("Valid");
	}
}