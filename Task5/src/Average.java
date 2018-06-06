public class Average {
    public static double findArithmetic(double[] array){
       double sum = 0;
       for(int i = 0; i < array.length; i++){
           sum+=array[i];
       }
        return sum/array.length;
    }
    public static double findGeometric(double[] array){
        double mult = 1;
        for(int i = 0; i < array.length; i++){
                mult *= array[i];
        }
        if(mult > 0){
        return Math.pow(mult,1./array.length);
        } else {
            throw new Error("Can't calculate root of negative value");
        }
    }
}
