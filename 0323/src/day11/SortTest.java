package day11;

import java.util.Arrays;

public class SortTest {
	public static void main(String[] args) {
		int[] arr = {10, 5, 44, 55, 1000, 140, 3, 55};

		for(int n : arr) {
			System.out.print(n+ " ");
		}

		System.out.println("\n\n==========������=============");

		Arrays.sort(arr);; //������������ ����

		for(int n : arr) {
			System.out.print(n+" ");
		}
	}
}
