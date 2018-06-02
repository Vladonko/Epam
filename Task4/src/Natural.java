public class Natural {
    public static int countMax(int number){
        int max = 0;
        int temp;
        while(number != 0) {
            if ((temp = number % 10) > max) {
                max = temp;
            }
            number /= 10;
        }
        return max;
    }
    public static boolean isPalindrom(int value) {
        int reverse = 0;
        int lastDigit = 0;
        int temp = value;

        while (temp != 0) {
            lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp /= 10;
        }

        return reverse == value;
    }
    public static boolean isNaturalSimple(int natural){
        for (int i = 2; i < natural; i++) {
            if (natural % i == 0){
                return false;
            }
        }
        return true;
    }
    public static String getSimpleDivisors(int number){
        StringBuffer result = new StringBuffer("");

        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                if (isNaturalSimple(i)){
                    result.append(i+" ");
                }
            }
        }

        return result+"";
    }


    public static int GCD(int number1, int number2){
        while (number1 != 0 && number2 != 0){
            if (number1 > number2){
                number1 %= number2;
            } else {
                number2 %= number1;
            }
        }

        return number1 + number2;
    }

    public static int LCM(int number1, int number2) {
        return number1 / GCD(number1,number2) * number2;
    }

    public static int getCountOfDifDigit(int num) {
        int count = 0;
        int temp;

        for (int i = 0; i < 10; i++) {
            temp = num;
            while (temp > 0) {
                if (temp % 10 == i) {
                    count++;
                    break;
                }
                temp /= 10;
            }
        }

        return count;
    }
}
