import java.util.*;

public class s5_1404 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double player0[] = new double[7];
		double player1[] = new double[7];
		double player2[] = new double[7];
		double player3[] = new double[7];
		double player4[] = new double[7];
		double player5[] = new double[7];
		double player6[] = new double[7];
		double player7[] = new double[7];
		
		for(int i = 0; i < 7; i++) {
			player0[i] = sc.nextDouble()*0.01;
		}
		player1[0] = 1-player0[0];
		player2[0] = 1-player0[1];
		player3[0] = 1-player0[2];
		player4[0] = 1-player0[3];
		player5[0] = 1-player0[4];
		player6[0] = 1-player0[5];
		player7[0] = 1-player0[6];
		
		for(int i = 1; i < 7; i++) {
			player1[i] = sc.nextDouble()*0.01;
		}
		player2[1] = 1-player1[1];
		player3[1] = 1-player1[2];
		player4[1] = 1-player1[3];
		player5[1] = 1-player1[4];
		player6[1] = 1-player1[5];
		player7[1] = 1-player1[6];
		
		for(int i = 2; i < 7; i++) {
			player2[i] = sc.nextDouble()*0.01;
		}
		player3[2] = 1-player2[2];
		player4[2] = 1-player2[3];
		player5[2] = 1-player2[4];
		player6[2] = 1-player2[5];
		player7[2] = 1-player2[6];
		
		for(int i = 3; i < 7; i++) {
			player3[i] = sc.nextDouble()*0.01;
		}
		player4[3] = 1-player3[3];
		player5[3] = 1-player3[4];
		player6[3] = 1-player3[5];
		player7[3] = 1-player3[6];
		
		for(int i = 4; i < 7; i++) {
			player4[i] = sc.nextDouble()*0.01;
		}
		player5[4] = 1-player4[4];
		player6[4] = 1-player4[5];
		player7[4] = 1-player4[6];
		
		for(int i = 5; i < 7; i++) {
			player5[i] = sc.nextDouble()*0.01;
		}
		player6[5] = 1-player5[5];
		player7[5] = 1-player5[6];
		
		for(int i = 6; i < 7; i++) {
			player5[i] = sc.nextDouble()*0.01;
		}
		player7[6] = 1-player6[6];
		
		
	}
}