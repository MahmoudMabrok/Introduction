package ch8;

import java.util.Scanner;

/**
 * this is
 * Created by mo3tamed on 9/11/17.
 */
public class SudukuSolver {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Sudoku puzzle solution:");
        int[][] grid = new int[9][9];
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                grid[i][j] = input.nextInt();



        System.out.println(isValid(grid ));

    }

    public static boolean isValid (int[][] grid )
    {

        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j <grid[i].length ; j++) {
                if (  grid[i][j] < 1  || grid[i][j] > 9  || !isValid(i , j , grid))
                    return  false ;

            }
        }

        return true ;
    }

    public static boolean isValid (int row  , int col , int[][] grid ) {

        for (int i = 0; i <9 ; i++) { // check unique in row
            if ( i != col  && ( grid[row][i] == grid [row][col]))
                return false ;
        }

        for (int i = 0; i < 9; i++) {// check unique in col
            if (i!= row && (grid[i][col] == grid [row][col]))
                return false ;
        }


        int start_row = (row / 3 ) * 3  , end_row = start_row +3 ; //get start of row 3*3 box
        int start_col = (col / 3 ) * 3  , end_col = start_col +3 ;//get start of col  3*3 box

        for (int i = start_row; i <end_row ; i++) {
            for (int j = start_col; j < end_col; j++) {
                if ( i != row && j != col && grid[i][j] == grid [row][col])
                    return false ;
            }
        }

     return true ;
    }

    }
