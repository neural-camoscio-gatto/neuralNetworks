package Test;

import Math.Matrix;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix matrix = new Matrix(3,2);
		double data[][] = {
				{1, 2, 3},
				{4, 5, 0}
		};
		Matrix matrixFromData = new Matrix(data);
		double[] packedArray = matrixFromData.toPackedArray();
		String s = "";
		for(int i = 0; i < packedArray.length; i++) {
			 s+=packedArray[i] + " ";
		}
		System.out.println("packedArray: " + s);

		double a[] = {1, 2, 3};
		Matrix columnMatrix = Matrix.createColumnMatrix(a);
		Matrix rowMatrix = Matrix.createRowMatrix(a);
		
		System.out.println("columnMatrix \n" + columnMatrix.toString());
		System.out.println("rowMatrix \n" + rowMatrix.toString());
		System.out.println("matrixFromData \n" + matrixFromData.toString());
		System.out.println("matrix \n" + matrix.toString());

	}

}
