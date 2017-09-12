package ch8;

import ch7.ArrayOPeration;

/**
 * this is excercise of Book "INtroducion of Java "
 * Created by mo3tamed on 9/7/17.
 */
public class MultiplyMatrix {
    public static void main(String[] args) {
       /* int [][] a = {  { 1,1 } ,{1, 1} };
        int [][] b = {  { 1,1 } ,{1, 1} };*/


        int [][] a = {  { 1,3 } ,{5, 6} };
        int [][] b = {  { 1,1 ,1} ,{4, 2,3} };

        ArrayOPeration.display(multiplyMatrix( a , b ));
}

    public static int [][]  multiplyMatrix( int[][] a,int[][] b ) {

        if (a[0].length == b.length )
            System.out.println("Valid ");

        int [][] c = new int[a.length][b[0].length] ;
        int sum   ;
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length ; j++) {
                sum = 0 ;
                for (int k = 0; k <b.length ; k++) {
                 sum+=   ( a[i][k]*b[k][j] ) ;
                }
                c[i][j] = sum ;
            }
        }

        return  c ;

    }
}
