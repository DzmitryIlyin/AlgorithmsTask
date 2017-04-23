import java.util.Random;
import java.util.Scanner;

public class TwoMatrix {

    public static void main(String[] args) {
        int x, y, i, j, a;

        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Enter 1st Matrix rows count");
        x = scanner.nextInt();
        System.out.println("Enter 1st Matrix columns count");
        y = scanner.nextInt();

        System.out.println("Enter 2nd Matrix rows count");
        i = scanner.nextInt();
        System.out.println("Enter 2nd Matrix columns count");
        j = scanner.nextInt();

        if (x == j) {
            System.out.println("First Matrix is:");
            Matrix m1 = new Matrix(x, y);

            for (int row = 0; row < m1.getX_dimension(); row++) {
                for (int col = 0; col < m1.getY_dimension(); col++) {
                    m1.set(row, col, r.nextInt(4));
                    System.out.print(m1.get(row, col) + "\t");
                }
                System.out.print("\n");
            }

            System.out.println("Second Matrix is:");
            Matrix m2 = new Matrix(i, j);
            for (int row = 0; row < m2.getX_dimension(); row++) {
                for (int col = 0; col < m2.getY_dimension(); col++) {
                    m2.set(row, col, r.nextInt(4));
                    System.out.print(m2.get(row, col) + "\t");
                }
                System.out.print("\n");
            }

            System.out.println("Muliplication result:");

            Matrix result= MOperation.mult(m1, m2);

            System.out.println(result);
        } else {
            System.out.println("Matrices could not be multiplied");
        }
    }
}