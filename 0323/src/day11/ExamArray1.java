package day11;

public class ExamArray1 {
	public static void main(String[] args) {
		 //double[][] twoArr={{10.1, 10.2},{10.3, 10.4},{10.5, 10.6}};

	      double[][] twoArr=new double[3][2];

	      int n=0;
	      for (int i=0;i<twoArr.length ;i++ )   {
	         for (int k=0;k<twoArr[i].length ;k++ ){
	            twoArr[i][k]=10+(++n/10.0);
	         }
	      }//for

	      for (int i=0;i<twoArr.length ;i++ )   {
	         for (int k=0;k<twoArr[i].length ;k++ ){
	            System.out.println("twoArr["+i+"]["+k+"]="
	               + twoArr[i][k]);
	         }
	      }//for

	      //
	      int row = twoArr.length;  //행: 3
	      int col = twoArr[0].length; //열 : 2
	      double[] oneArr = new double[row * col]; //6

	      for (int i=0;i<row ;i++ ){  //3
	         for (int k=0;k<col ;k++ ){ //2
	            oneArr[col * i+k] = twoArr[i][k];
	            //[column의 크기*row+column] = [row][column]
	         }
	      }//for

	      for (double num: oneArr){
	         System.out.print(num  +"\t");
	      }


	}
}
