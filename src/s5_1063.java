import java.util.*;

public class s5_1063 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String king = sc.next();
		String stone = sc.next();
		int num = sc.nextInt();
		String chess[][] = {
				{"A8", "B8", "C8", "D8", "E8", "F8", "G8", "H8"},
				{"A7", "B7", "C7", "D7", "E7", "F7", "G7", "H7"},
				{"A6", "B6", "C6", "D6", "E6", "F6", "G6", "H6"},
				{"A5", "B5", "C5", "D5", "E5", "F5", "G5", "H5"},
				{"A4", "B4", "C4", "D4", "E4", "F4", "G4", "H4"},
				{"A3", "B3", "C3", "D3", "E3", "F3", "G3", "H3"},
				{"A2", "B2", "C2", "D2", "E2", "F2", "G2", "H2"},
				{"A1", "B1", "C1", "D1", "E1", "F1", "G1", "H1"}
		};
		int king_loc1 = 0;
		int king_loc2 = 0;
		int stone_loc1 = 0;
		int stone_loc2 = 0;
		for(int a = 0; a < 8; a++) {
			for(int b = 0; b < 8; b++) {
				if(chess[a][b].equals(king) && chess[a][b].equals(stone)) {
					break;
				}
				if(chess[a][b].equals(king)) {
					king_loc1 = a;
					king_loc2 = b;
				}
				else if(chess[a][b].equals(stone)) {
					stone_loc1 = a;
					stone_loc2 = b;
				}
			}
		}
		for(int i = 0; i < num; i++) {
			String command = sc.next();
			switch(command) {
			case "R":
				if(king_loc2+1 != 8 && chess[king_loc1][king_loc2+1].equals(chess[stone_loc1][stone_loc2]) && stone_loc2+1 == 8) {
					break;
				}
				else if(king_loc2+1 != 8 && stone_loc2+1 != 8) {
					++king_loc2;
					++stone_loc2;
				}
				else if(king_loc2+1 != 8 && stone_loc2+1 == 8) {
					++king_loc2;
				}
				break;
			case "L":
				if(king_loc2-1 != -1 && chess[king_loc1][king_loc2-1].equals(chess[stone_loc1][stone_loc2]) && stone_loc2-1 == -1) {
					break;
				}
				else if(king_loc2-1 != -1 && stone_loc2-1 != -1) {
					--king_loc2;
					--stone_loc2;
				}
				else if(king_loc2-1 != -1 && stone_loc2-1 == -1) {
					--king_loc2;
				}
				break;
			case "B":
				if(king_loc1+1 != 8 && chess[king_loc1+1][king_loc2].equals(chess[stone_loc1][stone_loc2]) && stone_loc1+1 == 8) {
					break;
				}
				else if(king_loc1+1 != 8 && stone_loc1+1 != 8) {
					++king_loc1;
					++stone_loc1;
				}
				else if(king_loc1+1 != 8 && stone_loc1+1 == 8) {
					++king_loc1;
				}
				break;
			case "T":
				if(king_loc1-1 != -1 && chess[king_loc1-1][king_loc2].equals(chess[stone_loc1][stone_loc2]) && stone_loc1-1 == -1) {
					break;
				}
				else if(king_loc1-1 != -1 && stone_loc1-1 != -1) {
					--king_loc1;
					--stone_loc1;
				}
				else if(king_loc1-1 != -1 && stone_loc1-1 == -1) {
					--king_loc1;
				}
				break;
			case "RT":
				
				break;
			case "LT":
				
				break;
			case "RB":
				
				
				break;
			case "LB":
				
				break;
			}
		}
		System.out.println(chess[king_loc1][king_loc2]);
		System.out.println(chess[stone_loc1][stone_loc2]);
	}
}