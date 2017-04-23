import java.util.Random;
import java.util.Scanner;

public class OneMatrix {
    public static void main(String[] args) {
        int i, j;

        Scanner ar = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Please enter number of rows");
        i = ar.nextInt();
        System.out.println("Please enter number of columns");
        j = ar.nextInt();

        System.out.println("Original array:");

        Matrix m1=new Matrix(i,j);

        for (int row = 0; row < m1.getX_dimension(); row++) {
            for (int col = 0; col < m1.getY_dimension(); col++) {
                m1.set(row, col, r.nextInt(200));
                System.out.print(m1.get(row, col) + "\t");
            }
            System.out.println();
        }

        System.out.println("Transposed array:");

        Matrix result= MOperation.tr(m1);

        System.out.println(result);
    }
}
