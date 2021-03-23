package day11;

import java.util.*;

public class LottoTest2 {
	public static int[] lotto() {
		int[] arr = new int[6];

		for(int i=0;i<6;i++) {
			//2. 1~45사이의 임의의 정수 뽑아서 배열요소에 넣기 - 초기화
			arr[i] = (int)(Math.random()*45+1);

			//3. 중복되지 않도록
			for(int k=0;k<arr.length;k++) {
				if(arr[i] == arr[k]) {
					i--; //중복된 요소를 다시 뽑도록 1감소한다
					break;
				}
			}//안쪽 for
		}//for

		return arr;
	}

	public static void main(String[] args) {
		//로또만들기
		Scanner sc = new Scanner(System.in);

		//1. 6개 요소를 갖는 int 배열 생성
		int[] arr = null;

		while(true) {
			//6번 반복 - for
			arr = lotto();

			//4. for 밖에서 배열요소 정렬
			Arrays.sort(lotto());

			//5. 출력
			for(int n : arr) {
				System.out.print(n+" ");
			}//for

			System.out.println("\n그만하려면 Q");
			String quit = sc.nextLine();
			if(quit.equalsIgnoreCase("Q")) break;
		}//while

	}

}
