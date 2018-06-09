public class Initializer {
    public static String toString(double[][] matrix) {
        StringBuilder builder = new StringBuilder();

        for (double[] ints : matrix) {
            builder.append(java.util.Arrays.toString(ints));
            builder.append("\n");
        }

        return builder.toString();
    }
    public static String toStringInt(int[][] matrix) {
        StringBuilder builder = new StringBuilder();

        for (int[] ints : matrix) {
            builder.append(java.util.Arrays.toString(ints));
            builder.append("\n");
        }

        return builder.toString();
    }
}
