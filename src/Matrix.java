
public class Matrix {
    private Integer[][] matrix;
    private int x_dimension;
    private int y_dimension;

    public Matrix(int x, int y) {
        int z;
        matrix = new Integer[x][y];
        this.x_dimension = x;
        this.y_dimension = y;
    }

    public int getX_dimension() {
        return x_dimension;
    }

    public int getY_dimension() {
        return y_dimension;
    }

    public Integer get(int x, int y) {
        return matrix[x][y];
    }

    public void set(int x, int y, Integer value) {

        matrix[x][y] = value;
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        for (int row = 0; row < this.x_dimension; row++) {
            for (int col = 0; col < this.y_dimension; col++) {
                buffer.append(matrix[row][col]);
                buffer.append("\t");
            }
            buffer.append("\n");
        }
        return buffer.toString();
    }

}
