public class Order {
    public static boolean isOrdered(double[] array) {
       return isDecreased(array) || isIncreased(array);
    }

    public static boolean isIncreased(double[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDecreased(double[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                return false;
            }
        }
        return true;

    }
}
