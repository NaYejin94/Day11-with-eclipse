package day11;

import java.util.Scanner;

//������
public class Homework_0323 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//[p.45]
		int[] arr = new int[5];
		System.out.println("5���� ���ڸ� �Է��ϼ���");

		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
		}//for

		int[] temp = new int[5];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<=i;j++) {
				if(arr[i]>arr[j]) {
					temp[i]=arr[i];
					arr[i]=arr[j];
					arr[j]=temp[i];
				}
			}//���� for
		}//for

		System.out.println("===������������ ����===");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}//for

		System.out.println("\n\n================================\n");

		//[p.51]
		int[] coinUnit = {500, 100, 50, 10};

		int money = 3870;
		System.out.println("money="+money+"\n");

		int result=0;
		for(int i=0;i<coinUnit.length;i++) {
			result = money/coinUnit[i];
			money %=coinUnit[i];

			System.out.println(coinUnit[i]+"�� : "+result);
		}//for

		System.out.println("\n================================\n");

		// [p.52]
		char[] abcCode=
			{'`','~','!','@','#','$','%','^','&','*',
			'(',')','-','_','+','=','|','[',']','{',
			'}',';',':',',','.','/'};	

		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};

		String src = "abc123";
		String result2 = "";

		for(int i=0;i<src.length();i++) {
			char ch = src.charAt(i);
			if(ch>='a' && ch<='z') {
				char ch2 = abcCode[ch-97];
				result2+=ch2;
			}else {
				char ch2 =numCode[i-2];
				result2+=ch2;
			}

		}

		System.out.println("src:"+src);
		System.out.println("result:"+result2);
	}
}
