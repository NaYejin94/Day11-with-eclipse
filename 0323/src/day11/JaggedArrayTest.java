package day11;

public class JaggedArrayTest {
	public static void main(String[] args) {
		/*
		  �����迭(Jagged Array)
		  - �迭�� �迭, ���߳��� �迭, ���� �迭
		  - �迭�� ��Ұ� �迭
		  - �迭 ��Ҹ��� ũ�⸦ �ٸ��� ������ �� �ִ�
		    (�� �ึ�� �ٸ� ũ���� �迭�� �����ϴ� ���� ����)
		 */

		int[][] arr = new int[3][];	//���� �迭
		arr[0]=new int[] {1,2,3,4};
		arr[1]=new int[] {5,6};
		arr[2]=new int[] {7,8,9,10,11,12};

		int[][] arr2 = new int[3][2];	//2���� �迭
		arr2[0][0]=10;
		arr2[0][1]=20;
		arr2[1][0]=11;
		arr2[1][1]=23;
		arr2[2][0]=17;
		arr2[2][1]=29;

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("\n");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}
}
