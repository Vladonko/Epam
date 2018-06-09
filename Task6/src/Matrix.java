public class Matrix {
    public static double findMax(double[][] matrix) {
        double max = matrix[0][0];
        for (double[] row: matrix) {
            for(double element: row) {
                if(max < element){
                    max = element;
                }
            }
        }
        return max;
    }
    public static double findMin(double[][] matrix) {
        double min = matrix[0][0];
        for (double[] row: matrix) {
            for(double element: row) {
                if(min > element){
                    min = element;
                }
            }
        }
        return min;
    }
}
