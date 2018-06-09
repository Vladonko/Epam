public class LocalExtremum {
    public static int[] findPositionMax(double[][] matrix) {
        for (int i = 2; i < matrix.length; i++) {
            for (int j = 2; j < matrix[i].length; j++) {
                if ((matrix[i - 1][j - 1] < matrix[i - 2][j - 1]) & (matrix[i - 1][j - 1] < matrix[i][j - 1]) & (matrix[i - 1][j - 1] < matrix[i - 1][j - 2]) & (matrix[i - 1][j - 1] < matrix[i - 1][j])) {
                    return new int[]{i - 1, j - 1};
                }

            }

        }
        return new int[]{-1, -1};
    }

    public static int[] findPositionMin(double[][] matrix) {
        for (int i = 2; i < matrix.length; i++) {
            for (int j = 2; j < matrix[i].length; j++) {
                if ((matrix[i - 1][j - 1] > matrix[i - 2][j - 1]) & (matrix[i - 1][j - 1] > matrix[i][j - 1]) & (matrix[i - 1][j - 1] > matrix[i - 1][j - 2]) & (matrix[i - 1][j - 1] > matrix[i - 1][j])) {
                    return new int[]{i - 1, j - 1};
                }

            }

        }
        return new int[]{-1, -1};
    }
}
