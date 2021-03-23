package day11;

import java.util.*;

public class LottoTest {
	public static void main(String[] args) {
		//로또만들기
		Scanner sc = new Scanner(System.in);

		//1. 6개 요소를 갖는 int 배열 생성
		int[] arr = new int[6];

		while(true) {
			//6번 반복 - for
			for(int i=0;i<6;i++) {
				//2. 1~45사이의 임의의 정수 뽑아서 배열요소에 넣기 - 초기화
				arr[i] = (int)(Math.random()*45+1);

				//3. 중복되지 않도록
				for(int k=0;k<i;k++) {
					if(arr[i] == arr[k]) {
						i--; //중복된 요소를 다시 뽑도록 1감소한다
						break;
					}
				}//안쪽 for
			}//for

			//4. for 밖에서 배열요소 정렬
			Arrays.sort(arr);

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
