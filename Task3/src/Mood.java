import java.util.Random;
public class Mood {
        public static String getMood(){
            String[] face = {":)",";)",":o",":|","-_-",":(",":D",":/",":3"};

            Random mood = new Random();
            int i = mood.nextInt(9);

            return face[i];
        }
    }

