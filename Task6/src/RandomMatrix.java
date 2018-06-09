import java.util.Random;
public class RandomMatrix {
    public static void addMatrixWithRandom(double[][] matrix){
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = random.nextDouble()*(20 + 20) - 20;
            }
        }
    }
    public static void addMatrixWithRandomInt(int[][] matrix){
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = random.nextInt(20)-10;
            }
        }
    }
}

