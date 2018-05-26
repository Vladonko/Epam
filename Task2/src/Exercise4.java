public class Exercise4 {
    public static boolean IncreasingFigure(int number){
        int a = number/1000;
        int b = number/100%10;
        int c = number/10%10;
        int d = number%10;
        return  (a<b)&&(b<c)&&(c<d);
    }
}
