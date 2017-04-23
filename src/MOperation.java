
public class MOperation {

    public static Matrix tr(Matrix op){
        int x=op.getX_dimension();
        int y=op.getY_dimension();

        Matrix result= new Matrix(y, x);

        for(int row=0; row<x; row++){
            for (int col=0; col<y; col++){
                result.set(col, row, op.get(row, col));
            }
        }
        return result;
    }

    public static Matrix mult(Matrix m1, Matrix m2){

        int x = m1.getX_dimension();
        int y = m2.getY_dimension();
        int z = m2.getX_dimension();
        int value=0;

        Matrix rez = new Matrix(x, y);

        for(int row=0; row<x; row++){
            for (int col=0; col<y; col++){
                for (int row1=0; row1<z; row1++){
                    value+=m1.get(row, row1)*m2.get(row1, col);
                }
                rez.set(row, col, value);
                value=0;
            }
        }
        return rez;

    }
}
