import java.util.*;

class Node {
	char col;
	int num;

	public Node(char col, int num) {
		this.col = col;
		this.num = num;
	}
}

public class s5_2621 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		List<Node> list = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			list.add(new Node(sc.next().charAt(0), sc.nextInt()));
		}

		Collections.sort(list, new Comparator<Node>() {

			@Override
			public int compare(Node o1, Node o2) {
				// TODO Auto-generated method stub
				return o1.num - o2.num;
			}

		});

		int tem = 0;
		int tem2 = 0;
		int tem3 = 0;

		int same = 0;

		for (int i = 0; i < 4; i++) {
			if (list.get(i).col == list.get(i + 1).col) {
				tem++;
			}

			if (list.get(i).num == list.get(i + 1).num) {
				same = list.get(i).num;
				tem2++;
			}

			if (list.get(i).num + 1 == list.get(i + 1).num) {
				tem3++;
			}
		}

		if (tem == 4 || tem3 == 4) {
			if (tem3 == 4 && tem == 4) {
				System.out.println(900 + list.get(4).num);
			}

			else if (tem3 == 4 && tem != 4) {
				System.out.println(500 + list.get(4).num);
			}

			else if (tem3 != 4 && tem == 4) {
				System.out.println(600 + list.get(4).num);
			}
		}

		else if (tem2 == 3) {
			if (list.get(0).num != list.get(1).num || list.get(3).num != list.get(4).num) {
				System.out.println(list.get(2).num + 800);
			} else if (list.get(0).num == list.get(2).num) {
				System.out.println(list.get(0).num * 10 + list.get(4).num + 700);
			} else if (list.get(2).num == list.get(4).num) {
				System.out.println(list.get(4).num * 10 + list.get(0).num + 700);
			}
		}

		else if (tem2 == 2) {
			if (list.get(2).num == list.get(0).num) {
				System.out.println(list.get(2).num + 400);
			} else if (list.get(2).num == list.get(4).num) {
				System.out.println(list.get(2).num + 400);
			} else {
				System.out.println(list.get(3).num * 10 + list.get(1).num + 300);
			}
		}

		else if (tem2 == 1) {
			System.out.println(same + 200);
		}

		else {
			System.out.println(list.get(4).num + 100);
		}

	}

}
