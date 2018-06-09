public class Transparent {
    public static void transposeSquareMatrix(int[][] squareMatrix) {
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = i; j < squareMatrix[i].length; j++) {
                int temp = squareMatrix[i][j];
                squareMatrix[i][j] = squareMatrix[j][i];
                squareMatrix[j][i] = temp;
            }
        }
    }
}
