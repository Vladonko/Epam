public class PerfectNumber {
    public static boolean isPerfect(int perfect){
        int sum = 1;

        for (int i = 2; i < perfect; i++) {
            if (perfect % i == 0){
                sum += i;
            }
        }

        return sum == perfect;
    }
}
