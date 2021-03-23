package day11;

public class ForEachTest {
	public static void main(String[] args) {
		  /*
	       Ȯ�� for (Enhanced for, foreach)
	       - Ư�� ������ ��ҵ��� �ݺ� ó���� �� ���
	       - �迭�̳� �÷��ǿ� �����Ͱ� �ִ� ��ŭ �ݺ�
	       
	       for(�ڷ��� ���� : �迭){
	          ��ɹ�;
	       }
	       */

	      int[] arr = {1, 3, 4, 6, 8};

	      for(int i=0;i<arr.length;i++) {
	         System.out.println(arr[i]);
	      }

	      System.out.println("\nȮ�� for�̿�");

	      for(int n : arr) {
	         System.out.println(n);
	      }

	      String[] sArr= {"java","oracle","spring"};

	      for(int i=0;i<sArr.length;i++) {
	         System.out.print(sArr[i]+"\t");
	      }

	      System.out.println("\n\n===Ȯ�� for===");

	      for(String s : sArr) {
	         System.out.print(s+"\t");
	      }//for

	}
}
