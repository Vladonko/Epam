public class Task4 {
    public static void main(String[] args) {
        //Coin
        int N = 1000;
        System.out.println(HeadsorTail.CoinFlip(N));
//--------------------------------------------------------------------------------------------------------------------------
        //MaxDigit
        int number = 1920;
        System.out.println(Natural.countMax(number));

        //Ispalindrom
        int value = 868;
        System.out.println(Natural.isPalindrom(value));

        //Simple
        int natural = 151;
        System.out.println(Natural.isNaturalSimple(natural));

        //Simple divisors
        System.out.printf("Simple divisors of %d is %s\n",number,Natural.getSimpleDivisors(number));

        //Greatest Common Divisor
        int number1 = 18;
        int number2 = 81;
        System.out.printf("GCD of %d and %d is %d\n",number1,number2,Natural.GCD(number1,number2));

        //Lowest Common Multiple
        System.out.printf("LCM of %d and %d is %d\n",number1,number2,Natural.LCM(number1,number2));

        //Different digits
        System.out.println("different " + Natural.getCountOfDifDigit(number));
//--------------------------------------------------------------------------------------------------------------------------
        //PerfectNatural
        int perfect = 494;
        System.out.printf("Is the number %d perfect %b\n",perfect,PerfectNumber.isPerfect(perfect));
    }
}
