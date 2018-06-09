import java.lang.reflect.Array;

public class Test {
    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        double[][] matrix = new double[n][m];
        int[][] squareMatrix = new int[n][n];
        RandomMatrix.addMatrixWithRandom(matrix);
        RandomMatrix.addMatrixWithRandomInt(squareMatrix);
        //The First exercise
        System.out.println("----------------Find Max Min Value----------------");
        System.out.println(Matrix.findMax(matrix));
        System.out.println(Matrix.findMin(matrix));
        //The Second Exercise
        System.out.println("----------------Find Averege Arithmetic and Geometric----------------");
        System.out.println("Average Arithmetic is " + Average.findArithmetic(matrix));
        try {
            System.out.println("Average Geometric is " + Average.findGeometric(matrix));
        } catch (Error error) {
            System.out.println(error.getMessage());
        }
        //The third exercise
        System.out.println("----------------Find Local Extremum----------------");
        System.out.println("Element " + java.util.Arrays.toString(LocalExtremum.findPositionMax(matrix)) + " is local Maximum");
        System.out.println("Element " + java.util.Arrays.toString(LocalExtremum.findPositionMin(matrix)) + " is local Minimum");
        //The Forth exercise
        System.out.println("----------------Transparent Matrix----------------");
        System.out.println("Square Matrix: ");
        String firstMatrix = Initializer.toStringInt(squareMatrix);
        System.out.println(firstMatrix);
        System.out.println("Transposed square Matrix: ");
        Transparent.transposeSquareMatrix(squareMatrix);
        String transposedMatrix = Initializer.toStringInt(squareMatrix);
        System.out.println(transposedMatrix);

    }
}
