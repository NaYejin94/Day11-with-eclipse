package day11;

public class JaggedArrayTest {
	public static void main(String[] args) {
		/*
		  가변배열(Jagged Array)
		  - 배열의 배열, 들쭉날쭉 배열, 동적 배열
		  - 배열의 요소가 배열
		  - 배열 요소마다 크기를 다르게 지정할 수 있다
		    (각 행마다 다른 크기의 배열을 생성하는 것이 가능)
		 */

		int[][] arr = new int[3][];	//가변 배열
		arr[0]=new int[] {1,2,3,4};
		arr[1]=new int[] {5,6};
		arr[2]=new int[] {7,8,9,10,11,12};

		int[][] arr2 = new int[3][2];	//2차원 배열
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
