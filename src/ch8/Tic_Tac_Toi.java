package ch8;

import ch7.ArrayOPeration;

import java.util.Scanner;

/**
 * this is
 * Created by mo3tamed on 9/12/17.
 */
public class Tic_Tac_Toi {

    public static void main(String[] args) {
        
        char[][]  grid = new char[3][3] ;
        int x , y ;
        Scanner in = new Scanner(System.in) ;
        for (int i = 0; i <5 ; i++) {

            System.out.println("enter your X location ( 0 1 2 , 0 1 2 ) ");
            x=in.nextInt() ;
            y= in.nextInt() ;
            grid[x][y ] = 'X' ;
            ArrayOPeration.display(grid );
            chechGame(grid);

            if (i == 4 ) //case of toi
            {
                System.out.println("TOI  ??????? ");
                System.exit(0);
            }
            System.out.println("enter your O  location ( 0 1 2 , 0 1 2 ) ");
            x=in.nextInt() ;
            y= in.nextInt() ;
            grid[x][y ] = 'O' ;
            ArrayOPeration.display(grid );
            chechGame(grid);


        }

    }

    public static void chechGame (char[][]grid  ){
        //check rows
        for (int i = 0; i < grid.length; i++) {
            if ( (grid[i][0]== grid[i][1]) && grid[i][1]== grid[i][2] )
            {
                if (grid[i][0] == 'X')
                {
                    System.out.println("X won ");
                    System.exit(0);
                }
                else if (grid[i][0] == 'O')
                {
                    System.out.println("O won ");
                    System.exit(0);
                }
            }
        }
        //check col
        for (int col = 0; col < grid.length; col++) {
            if ( (grid[0][col]== grid[1][col]) && grid[1][col]== grid[2][col] )
            {
                if (grid[0][col] == 'X')
                {
                    System.out.println("X won ");
                    System.exit(0);
                }
                else if (grid[0][col] == 'O')
                {
                    System.out.println("O won ");
                    System.exit(0);
                }
            }
        }

        //check main diagonal

        if ( (grid[0][0]== grid[1][1]) && grid[1][1]== grid[2][2] )
        {
            if (grid[0][0] == 'X')
            {
                System.out.println("X won ");
                System.exit(0);
            }
            else if (grid[0][0] == 'O')
            {
                System.out.println("O won ");
                System.exit(0);
            }
        }
        //check sub  diagonal
        if ( (grid[0][2]== grid[1][1]) && grid[1][1]== grid[2][0] )
        {
            if (grid[0][2] == 'X')
            {
                System.out.println("X won ");
                System.exit(0);
            }
            else if (grid[0][0] == 'O')
            {
                System.out.println("O won ");
                System.exit(0);
            }
        }
    }


}








