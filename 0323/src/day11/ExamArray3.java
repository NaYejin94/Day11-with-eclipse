package day11;

public class ExamArray3 {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==j) {
					arr[i][j] = 1;
				}
				System.out.print(arr[i][j]+"\t");
			}//¾ÈÂÊ for
			System.out.println();
		}//for

		System.out.println("\n===============================\n");

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==j || (j-i==2 || i-j==2)) {
					arr[i][j] = 1;
				}
				System.out.print(arr[i][j]+"\t");
			}//¾È¦U for
			System.out.println();
		}//for

		System.out.println("\n===============================\n");

		int sum=0;
		double avg=0.0;
		int[][] arr2 = new int[4][5];
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				arr2[i][j] = (int)(Math.random()*35+10);
				System.out.print(arr2[i][j]+" ");
				sum+=arr2[i][j];
				avg = (double)sum/(arr2.length * arr2[i].length);
			}
			System.out.println();

		}

		System.out.println("ÃÑÇÕ°è: "+sum);
		System.out.println("Æò±Õ : "+Math.round(avg*100)/100.0);
	}
}
