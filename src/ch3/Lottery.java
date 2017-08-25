package ch3;

import java.util.Scanner;

/**
 * this is  1.0
 * Created by mo3tamed on 8/24/17.
 */
public class Lottery {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in) ;
        int user = in.nextInt() ;
        int u1 = user /10  , u2= user%10;

        int r1 = (int)(Math.random()*10) ;
        int r2 = (int)(Math.random()*10) ;
        System.out.println( ""+r1+r2);

        if (u1 == r1 && u2==r2)
        {
            System.out.println("Exact  win 10.000$");
        }
        else if (u1 == r2 && u2==r1)
        {
            System.out.println("Match win 3.000$");
        }
        else if (u1 == r2 ||u1 == r1 ||u2 == r2 || u2 == r1 )
            System.out.println( "win  1.000$");
        else
            System.out.println("you lose");



    }
}
