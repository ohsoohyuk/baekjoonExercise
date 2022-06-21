import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s5_2578 {
	
	static int[][] bingo = new int[5][5];
	static int[][] cBingo = new int[5][5];
	static int[][] visited = new int[5][5];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int answer = 0;
		
		for(int i=0; i<5; i++) { //bingo�� �Է�
			st = new StringTokenizer(br.readLine()," ");
			for(int j=0; j<5; j++) {
				bingo[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<5; i++) { //call bingo �Է�
			st = new StringTokenizer(br.readLine()," ");
			for(int j=0; j<5; j++) {
				cBingo[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		loop :
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				int tmp = cBingo[i][j];
				answer++; //���° �θ��� ��
				
				for(int a=0; a<5; a++) {
					for(int b=0; b<5; b++) {
						if(tmp==bingo[a][b]) { //�θ��Ͱ� ���ٸ�
							visited[a][b] = 1;
							if(InArea()==true) break loop;
						}
					}
				}
			}
		}
		
		System.out.println(answer);
	}

	private static boolean InArea() {
		int line = 0;
		int su = 0;
		
		//����
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(visited[i][j]==1) su++;
			}
			if(su==5) line++;
			su = 0;
		}
		
		//����
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(visited[j][i]==1) su++;
			}
			if(su==5) line++;
			su = 0;
		}
		
		//��->�� �밢��
		for(int i=0; i<5; i++) {
			if(visited[i][i]==1) su++;
		}
		if(su==5) line++;
		su = 0;
		
		//��->�� �밢��
		for(int i=0; i<5; i++) {
			if(visited[i][4-i]==1) su++;
		}
		if(su==5) line++;
		su = 0;
		
		if(line>=3) return true;
		return false;
	}
	
}