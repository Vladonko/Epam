import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //The First exercise
        System.out.println("-------------Find Min and Max Element-------------");
        double[] array1 = {5.5, 6, 8, -10.5, 0, 51.1, -68, 53};
        System.out.println("Max element: " + MinMax.findMax(array1));
        System.out.println("Min element: " + MinMax.findMin(array1));
        double[] array2 = {2.5, 5, 3, 10.5, -0.5, 53};
        //The Second exercise
        System.out.println("-------------Find Arth and Geo Average-------------");
        System.out.println("Average Arithmetic " + Average.findArithmetic(array2));
        try {
            System.out.println("Average Geometric " + Average.findGeometric(array2));
        } catch (Error error) {
            System.out.println(error.getMessage());
        }
        //The Third Exercise
        System.out.println("-------------Is ordered-------------");
        double[] array3 = {-1, 5, 6, 10.5, 55.5};
        double[] array4 = {-1, -5, -6, -10.5, -55.5};
        double[] array5 = {-1, 5, 100, 10.5, 65};
        System.out.println("Is array ordered : " + Order.isOrdered(array3));
        System.out.println("Is array ordered : " + Order.isOrdered(array4));
        System.out.println("Is array ordered : " + Order.isOrdered(array5));
        //The Forth Exercise
        System.out.println("-------------Local Extremum-------------");
        double[] array6 = {-1, -10, -2, 10.5, 65};
        double[] array7 = {-1, 10, 12, -10.5, 65};
        double[] array8 = {1, 2, 3, 4, 5};
        try {
            System.out.println("Local extremum position is " + LocalExtremum.findPosition(array6));
        } catch (Error error) {
            System.out.println(error.getMessage());
        }
        try {
            System.out.println("Local extremum position is " + LocalExtremum.findPosition(array7));
        } catch (Error error) {
            System.out.println(error.getMessage());
        }
        try {
            System.out.println("Local extremum position is " + LocalExtremum.findPosition(array8));
        } catch (Error error) {
            System.out.println(error.getMessage());
        }
        //The fifth exercise
        System.out.println("-------------Reverse-------------");
        double[] array9 = {-1, 2, -3, 4, 5};
        System.out.println(Arrays.toString(array9));
        Array.reverse(array9);
        System.out.println(Arrays.toString(array9));
    }
}
