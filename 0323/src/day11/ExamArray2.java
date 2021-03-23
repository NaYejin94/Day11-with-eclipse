package day11;

import java.util.Scanner;

public class ExamArray2 {

	public static void main(String[] args) {
		double[] dArr = new double[5];
		Scanner sc = new Scanner(System.in);

		for(int i=0;i<dArr.length;i++) {
			System.out.println("잔고를 입력하세요");
			dArr[i] = sc.nextDouble();
		}//for

		System.out.println("이자율을 입력하세요");
		double interest = sc.nextDouble();

		for(int i=0;i<dArr.length;i++) {
//			dArr[i] += dArr[i]*(interest/100);
			dArr[i] *=(1+interest/100.0);

			System.out.println("이자가 반영된 잔고 조회 : "+Math.round(dArr[i]));
		}//for
	}

}
