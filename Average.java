public class Average {
    public static double findArithmetic(double[][] matrix) {
        double sum = 0;
        int number = matrix[0].length + matrix.length;
        for (double[] row : matrix) {
            for (double element : row) {
                sum += element;
            }
        }
        return sum / (matrix.length + matrix[0].length);
    }

    public static double findGeometric(double[][] matrix) {
        double mult = 1;
        for (double[] row : matrix) {
            for (double element : row) {
                mult *= element;
            }
        }
        if (mult > 0) {
            return Math.pow(mult, 1. / (matrix[0].length + matrix.length));
        } else {
            throw new Error("Can't calculate root of this nagative value");
        }

    }
}
