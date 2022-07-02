import java.io.*;

public class s5_2751 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		boolean arr[] = new boolean[2000001];
		
		for(int i = 0; i < n; i++) {
			arr[Integer.parseInt(bf.readLine())+1000000] = true;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i <= 2000000; i++) {
			if(arr[i] == true) {
				sb.append(i-1000000).append("\n");
			}
		}
		
		System.out.println(sb);
	}

}
