package day11;

import java.util.Scanner;

public class ArrayArgs {
	//�迭�� �Ű������� �޴� �޼���
	//��, ��, �� ������ �迭�� �޾ƿͼ� ����, ��� ���ϱ�
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
		System.out.println("��, ��, �� ���� �Է�!!");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}

		//call by reference - �Ű������� ���� �Ѿ�°� �ƴ϶� �ּҰ� �Ѿ
		// => ���� �ּҸ� �����Ƿ�, ���� ���� ����Ű�� ��
		// => �޼��忡�� �Ű������� ���� �����ϸ� main(�޼��带 ȣ���� ��)������ 
		//	  ������ ���� �����
		double avg = findAvg(arr);
		System.out.println("��� :"+Math.round(avg*100)/100.0);
		System.out.println("�޼��� ȣ�� �� arr[0]= "+arr[0]);

		//call by value - ���� �Ű������� �ѱ�
		//�޼��忡�� �Ű������� ���� �����ص� main���� ���� ������� ����
		int n1=10, n2=20;
		int res = add(n1,n2);
		System.out.println(res);
		System.out.println("�޼��忡�� �Ű������� ���� �� n1="+n1);
	}

	public static int add(int a, int b) {
		int c = a+b;
		a=100;
		return c;
	}
}
