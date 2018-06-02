import java.util.Random;

public class HeadsorTail {
    public static String CoinFlip(int N){
        final int Max_value = 2;
        final int Min_value = 1;
        int head = 0, tail = 0;
        Random random= new Random();
        for(int i=0; i<N; i++){
           if(random.nextInt(Max_value) == Min_value){
               tail++;
           }else{
               head++;
           }

        }
        return "Орел выпал- " + head + " раз" + "Решка выпала- " + tail + " раз";
    }

}
