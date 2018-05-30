public class DragonHead {
    public static int getHeads (int Age){
        int sum;
        if (Age > 300){
            sum = Age - 300 + 803;
        } else if (Age > 200) {
            sum = (Age - 200) * 2 + 603;
        } else sum = Age * 3 + 3;
        return sum;
    }
    public static int getEyes (int Age){
        return DragonHead.getHeads(Age) * 2;
    }
}
