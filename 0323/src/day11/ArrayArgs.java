package day11;

import java.util.Scanner;

public class ArrayArgs {
	//배열을 매개변수로 받는 메서드
	//국, 영, 수 점수를 배열로 받아와서 총점, 평균 구하기
	public static double findAvg(int[] score) {
		int sum=0;
		for(int i=0; i<score.length;i++) {
			sum+=score[i];
		}

		double avg = (double)sum/score.length;

		score[0]++;

		return avg;
	}

	public static void main(String[] args) {
		int[] arr = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("국, 영, 수 점수 입력!!");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}

		//call by reference - 매개변수로 값이 넘어가는게 아니라 주소가 넘어감
		// => 같은 주소를 가지므로, 같은 곳을 가리키게 됨
		// => 메서드에서 매개변수의 값을 변경하면 main(메서드를 호출한 곳)에서도 
		//	  변수의 값이 변경됨
		double avg = findAvg(arr);
		System.out.println("평균 :"+Math.round(avg*100)/100.0);
		System.out.println("메서드 호출 후 arr[0]= "+arr[0]);

		//call by value - 값을 매개변수로 넘김
		//메서드에서 매개변수의 값을 변경해도 main에서 전혀 영향받지 않음
		int n1=10, n2=20;
		int res = add(n1,n2);
		System.out.println(res);
		System.out.println("메서드에서 매개변수값 변경 후 n1="+n1);
	}

	public static int add(int a, int b) {
		int c = a+b;
		a=100;
		return c;
	}
}
