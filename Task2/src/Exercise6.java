public class Exercise6 {
    public static int ReversiveNumber(int num){
        int a = num / 1000000;
        int b = num / 100000 % 10;
        int c = num / 10000 % 10;
        int d = num / 1000 % 10;
        int e = num / 100 % 10;
        int f = num / 10 % 10;
        int g = num % 10;
        return (1000000 * g + 100000 * f + 10000 * e + 1000 * d + 100 * c + 10 * b + a);
    }
}
