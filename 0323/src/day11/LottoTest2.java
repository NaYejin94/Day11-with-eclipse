package day11;

import java.util.*;

public class LottoTest2 {
	public static int[] lotto() {
		int[] arr = new int[6];

		for(int i=0;i<6;i++) {
			//2. 1~45������ ������ ���� �̾Ƽ� �迭��ҿ� �ֱ� - �ʱ�ȭ
			arr[i] = (int)(Math.random()*45+1);

			//3. �ߺ����� �ʵ���
			for(int k=0;k<arr.length;k++) {
				if(arr[i] == arr[k]) {
					i--; //�ߺ��� ��Ҹ� �ٽ� �̵��� 1�����Ѵ�
					break;
				}
			}//���� for
		}//for

		return arr;
	}

	public static void main(String[] args) {
		//�ζǸ����
		Scanner sc = new Scanner(System.in);

		//1. 6�� ��Ҹ� ���� int �迭 ����
		int[] arr = null;

		while(true) {
			//6�� �ݺ� - for
			arr = lotto();

			//4. for �ۿ��� �迭��� ����
			Arrays.sort(lotto());

			//5. ���
			for(int n : arr) {
				System.out.print(n+" ");
			}//for

			System.out.println("\n�׸��Ϸ��� Q");
			String quit = sc.nextLine();
			if(quit.equalsIgnoreCase("Q")) break;
		}//while

	}

}
