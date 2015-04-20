package Math;

/**
 * Created by nicoladesimone on 10/04/15.
 */
public class MatrixMath {

    public static Matrix add(final Matrix a, final Matrix b) {
        final double result[][] = new double[a.getRows()][a.getCols()];
        for(int resultRow=0; resultRow < a.getRows(); resultRow++) {
            for(int resultCol=0; resultCol < a.getCols(); resultCol++) {
                result[resultRow][resultCol] = a.get(resultRow, resultCol) + b.get(resultRow, resultCol);
            }
        }
        return new Matrix(result);
    }

    public static Matrix divide(final Matrix a, final double b) {
        final double result[][] = new double[a.getRows()][a.getCols()];
        for(int row=0; row < a.getRows(); row++) {
            for(int col=0; col < a.getCols(); col++) {
                result[row][col] = a.get(row, col) / b;
            }
        }
        return new Matrix(result);
    }

    public static double dotProduct(final Matrix a, final Matrix b) {
        final double aArray[] = a.toPackedArray();
        final double bArray[] = b.toPackedArray();
        double result = 0;
        final int length = aArray.length;
        for (int i = 0; i < length; i++) {
            result += aArray[i] * bArray[i];
        }
        return result;
    }

    public static Matrix identity(final int size) {
        final Matrix result = new Matrix(size, size);
        for (int i = 0; i < size; i++) {
            result.set(i, i, 1);
        }
        return result;
    }

    public static Matrix multiply(final Matrix a, final Matrix b) {
        final double result[][] = new double[a.getRows()][b.getCols()];
        for (int row = 0; row < a.getRows(); row++) {
            for (int col = 0; col < b.getCols(); col++) {
                result[row][col] = a.get(row, col);
            }
        }
        return new Matrix(result);
    }

}
