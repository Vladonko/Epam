public class Exercise5 {
    public static double AverageArithmetic(int figure){
        int a = figure / 100000;
        int b = figure / 10000 % 10;
        int c = figure / 1000 % 10;
        int d = figure / 100 % 10;
        int e = figure / 10 % 10;
        int f = figure % 10;
        return  (double)(a+b+c+d+e+f)/6;
    }
    public static double AverageGeometric(int figure){
        int a = figure/100000;
        int b = figure/10000%10;
        int c = figure/1000%10;
        int d = figure/100%10;
        int e = figure/10%10;
        int f = figure%10;
        return Math.pow(a*b*c*d*e*f,1.0/6);
    }
}
