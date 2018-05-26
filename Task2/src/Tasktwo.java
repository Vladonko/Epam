import java.sql.SQLOutput;

public class Tasktwo {
    public static void main(String[] args) {
        //First Exercise
        System.out.println("Exercise 1");
        int a=2, b=9, c=5;
        boolean result = Exercise1.Comparison(a,b,c);
        System.out.printf("Is numbers %d %d %d are equal: %b\n",a,b,c,result);

        //Second Exercise
        System.out.println("Exercise 2");
        double kg=8004.56;
        double tons;
        double gr;
        double mg;
        tons = Exercise2.DinosaurWeightTons(kg);
        gr = Exercise2.DinosaurWeightGramms(kg);
        mg = Exercise2.DinosaurWeightMilligramms(kg);
        System.out.printf("Dinosaur mass is: \nkilograms: %.1f\ngrams: %.1f\ntons: %.1f\nmilligrams: %.1f\n",kg,gr,tons,mg);

        //Third Exercise
        System.out.println("Exercise 3");
        double R1=30.51, R2=55.11;
        double Area = Exercise3.SircleArea(R1,R2);
        System.out.printf("Radius 1 - %.2f\nRadius 2 - %.2f\nSquare of ring - %.2f\n", R1, R2, Area);

        //Fourth Exercise
        System.out.println("Exercise 4");
        int number = 5689;
        boolean Is = Exercise4.IncreasingFigure(number);
        System.out.printf("Digits of number %d form an increasing progression --> %b\n", number, Is);
        number = 6666;
        Is = Exercise4.IncreasingFigure(number);
        System.out.printf("Digits of number %d form an increasing progression --> %b\n", number, Is);

        //Fifth Exercise
        System.out.println("Exercise 5");
        int figure = 121621;
        double arth = Exercise5.AverageArithmetic(figure);
        double geom = Exercise5.AverageGeometric(figure);
        System.out.printf("Average arithmetic of %d : %.2f\n", figure, arth);
        System.out.printf("Average geometric of %d : %.2f\n", figure, geom);

        //Sixth Exercise
        System.out.println("Exercise 6");
        int num = 1234567;
        int mun = Exercise6.ReversiveNumber(num);
        System.out.printf("Reverse of number %d is %d\n", num, mun);

        //Seventh Exercise
        System.out.println("Exercise 7");
        int x = 5, y = 9;
        String swap = Exercise7.Revers(x,y);
        System.out.printf("x = %d y = %d ->  %s",x,y,swap);
    }

}
