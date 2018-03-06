package ch19;

/**
 * this is
 * Created by mo3tamed on 1/19/18.
 */
public class TestGeneric {

    public static void main(String[] args) {

        Integer[][] m1 = new Integer[][]{{1, 2, 3}, {4, 5, 6}, {1, 1, 1}};
        Integer[][] m2 = new Integer[][]{{1, 1, 1}, {2, 2, 2}, {0, 0, 0}};

        IntegerMatrix  integerMatrix = new IntegerMatrix() ;
        IntegerMatrix.printResult( m1,m2, integerMatrix.addMatrix(m1 ,m2) , '+' );




    }
}
