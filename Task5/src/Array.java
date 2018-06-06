public class Array {
    public static void reverse(double[] array){
        double temp;
        for(int i = 0,j = array.length-1; i < j; i++,j--){
           temp = array[i];
           array[i] = array[j];
           array[j] = temp;
        }
    }
}
