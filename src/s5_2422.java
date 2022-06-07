import java.util.*;

public class s5_2422 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		boolean check[][] = new boolean[201][201];
		
		int ans = 0;
		
		for (int i = 1; i <= n; i++) {
	        for (int j = i + 1; j <= n; j++) {
	            check[i][j] = true;
	            check[j][i] = true;
	        }
	    }
	 
	    for (int i = 0; i < m; i++) {
	        int a, b;
	        a = sc.nextInt();
	        b = sc.nextInt();
	        check[a][b] = false;
	        check[b][a] = false;
	    }
	 
	    for (int i = 1; i <= n; i++) {
	        for (int j = i + 1; j <= n; j++) {
	            if (check[i][j] == true) {
	                for (int k = j + 1; k <= n; k++) {
	                    if (check[i][k] == true && check[j][k] == true) {
	                        ans++;
	                    }
	                }
	            }
	        }
	    }
	    
	    System.out.println(ans);
	}

}
