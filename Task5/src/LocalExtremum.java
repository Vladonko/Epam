public class LocalExtremum {
    public static int findPosition(double[] array) {
        for (int i = 2; i < array.length; i++) {
            if ((array[i - 1] > array[i - 2] & array[i - 1] > array[i]) || (array[i - 1] < array[i - 2] & array[i - 1] < array[i])) {
                return i - 1;
            }

        }
        throw new Error("This array hasn't got local extremum");
    }
}
