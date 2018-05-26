public class Exercise7 {
    public static String Revers(int x, int y){
        x = x + y;
        y = y - x;
        y = - y;
        x = x - y;
        return "x = " + x + "y = " + y;
    }
}
