import java.security.SecureRandom;

public class aula08 {

    public static void main(String[] Args) {

        final int lines = 5;
        final int columns = 5;

        int[][] numbers = new int[lines][columns];

        int l = 0;

        for (l = 0; l < lines; l++) {
            for (int c = 0; c < columns; c++) {
                numbers[l][c] = new SecureRandom().nextInt(100);
                System.out.printf("%3d |", numbers[l][c]);
            }
            System.out.printf("\n");
        }
    }
}
