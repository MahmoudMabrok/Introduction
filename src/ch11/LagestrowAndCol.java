package ch11;
import ch7.ArrayOPeration;

import java.util.ArrayList;
import java.util.Scanner ;

/**
 * this is
 * Created by mo3tamed on 9/30/17.
 *
 * (Largest rows and columns) Write a program that randomly fills in 0s and 1s
 into an n-by-n matrix, prints the matrix, and finds the rows and columns with the
 most 1s. (Hint: Use two ArrayLists to store the row and column indices with
 the most 1s.) Here is a sample run of the program:

 */
public class LagestrowAndCol {

    public static void main(String[] args) {


        Scanner in =new Scanner(System.in);

        int n  = in.nextInt() ;
        int[][] arr =new int[n][n] ;
        int[] rows = new int[n];
        int[] cols = new int[n];

        //fill matrix& get sum of  rows

        int sum_row , sum_col ;

        for (int i = 0; i <n ; i++) {
            sum_row = 0 ;
            for (int j = 0; j <n ; j++) {
                arr[i][j]=(int)((Math.random()*2)) ;
                sum_row += arr[i][j] ;
            }
            rows[i] = sum_row;
        }
        for (int i = 0; i <n ; i++) {
             sum_col = 0 ;
            for (int j = 0; j <n ; j++) {
                sum_col += arr[j][i] ;
            }
            cols[i] = sum_col;
        }
        //display
        System.out.println("Matrix");
        ArrayOPeration.display(arr);
        // display sums
        System.out.println("rows");
            ArrayOPeration.display(rows);
        System.out.println("cols");
            ArrayOPeration.display(cols);

        //get max

        int max_row = rows[0] , max_col=cols[0] ;
        for (int i = 1; i <n ; i++) {
            if (max_row < rows[i])
                max_row=rows[i];
            if (max_col < cols[i])
                max_col=cols[i];
        }

        ArrayList<Integer> row_index = new ArrayList<>() ;
        ArrayList<Integer> col_index = new ArrayList<>() ;

        for (int i = 0; i <n ; i++) {
            if ( rows[i] == max_row)
                row_index.add(i);
            if ( cols[i] == max_col)
                col_index.add(i);

        }

        System.out.println(row_index.toString());
        System.out.println(col_index.toString());


    }
}
