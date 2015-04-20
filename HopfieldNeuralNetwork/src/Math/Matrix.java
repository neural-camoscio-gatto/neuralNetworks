package Math;

public class Matrix {
	
	
	private double matrix[][];
	private final int rows;
	private final int cols;
	
	public Matrix(int rows, int cols) {
		this.matrix = new double[rows][cols];
		this.rows = rows;
		this.cols = cols;
		for(int i=0; i<rows-1; i++) {
			for(int j=0; j<cols-1; j++) {
				this.matrix[i][j] = 0;
			}
		}
		
	}
	
	public Matrix(double[][] matrix) {
		rows = matrix.length;
		cols = matrix[0].length;
		this.matrix = matrix;
	}
	

	//Gets the value for a cell.
	public double get(int row, int col) {
		if(row > rows || col > cols) {
			throw new IndexOutOfBoundsException("Error index out of bounds!");
		}else
			return matrix[row-1][col-1];
	}

	//Sets the value of a cell.
	public void set(int row, int col, double value) {
		matrix[row][col] = value;
	}

	//Adds the specified value to every cell in the matrix.
	public void add(double value) {
		for (int i=0; i < rows; i++) {
			for (int j=0; j < cols; j++) {
				matrix[i][j] += value;
			}
		}
	}

	//Sets every cell in a matrix to zero.
	public void clear() {
		for (int i=0; i < rows; i++) {
			for (int j=0; j < cols; j++) {
				matrix[i][j] = 0;
			}
		}
	}

	//Determines if a matrix is a vector. A vector matrix has either a single row or a single column.
	public boolean isVector() {
		return rows==0 || cols==0;
	}

	//Determines if every cell in a matrix object is zero.
	public boolean isZero() {
		boolean isZero = true;
		for (int i=0; i < rows; i++) {
			for (int j=0; j < cols; j++) {
				if (matrix[i][j] != 0) {
					isZero = false;
					break;
				}
			}
		}
		return isZero;
	}
	//Returns the sum of every cell in a matrix object.
	public double sum() {
		double sum = 0;
		for (int i=0; i < rows; i++) {
			for (int j=0; j < cols; j++) {
				sum+=matrix[i][j];
			}
		}
		return sum;
	}
	//Determines the number of rows in a matrix object.
	public int getRows() {
		return rows;
	}
	//Determines the number of columns in a matrix object.
	public int getCols() {
		return cols;
	}

	@Override
	public String toString() {
		String s = "";
		for(int i=0; i< rows; i++) {
			for(int j=0; j< cols; j++) {
				s = s + " " + matrix[i][j] + " ";
			}
			s+="\n";
		}
		return s;
	}

	//Static method which creates a matrix with a single column.
	public static Matrix createColumnMatrix(double[] columnMatrix) {
		double matrix[][] = new double[columnMatrix.length][1];
		return new Matrix(matrix);
	}

	//Static method which creates a matrix with a single row.
	public static Matrix createRowMatrix(double[] rowMatrix) {
		double matrix[][] = new double[1][rowMatrix.length];
		return new Matrix(matrix);
	}

	//Converts a two dimensional matrix array into a one dimen- sional array of Java double variables.
	public double[] toPackedArray() {
		double[] packedArray = new double[rows*cols];
		int index = 0;
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				packedArray[index] = matrix[row][col];
				index++;
			}
		}

		return packedArray;
	}



}
