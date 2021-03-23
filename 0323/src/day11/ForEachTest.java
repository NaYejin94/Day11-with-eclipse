package day11;

public class ForEachTest {
	public static void main(String[] args) {
		  /*
	       확장 for (Enhanced for, foreach)
	       - 특정 집합의 요소들을 반복 처리할 때 사용
	       - 배열이나 컬렉션에 데이터가 있는 만큼 반복
	       
	       for(자료형 변수 : 배열){
	          명령문;
	       }
	       */

	      int[] arr = {1, 3, 4, 6, 8};

	      for(int i=0;i<arr.length;i++) {
	         System.out.println(arr[i]);
	      }

	      System.out.println("\n확장 for이용");

	      for(int n : arr) {
	         System.out.println(n);
	      }

	      String[] sArr= {"java","oracle","spring"};

	      for(int i=0;i<sArr.length;i++) {
	         System.out.print(sArr[i]+"\t");
	      }

	      System.out.println("\n\n===확장 for===");

	      for(String s : sArr) {
	         System.out.print(s+"\t");
	      }//for

	}
}
