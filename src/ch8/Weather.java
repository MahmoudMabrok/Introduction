package ch8;

import java.util.Scanner;

/**
 * this is
 * Created by mo3tamed on 9/11/17.
 */
public class Weather {

    public static void main(String[] args) {

        final int n_day = 1 ;
        final int n_hour = 2 ;

        int[][][] data = new int[n_day][n_hour][2] ;

        Scanner in = new Scanner(System.in) ;

       /* int day , hour , temp , humnity ;
        for (int i = 0; i <n_day *  n_hour ; i++) {
            System.out.println("Enter day ( 1 - " +(n_day)+  " - hour ( 0-"+(n_hour-1) +  " - temp - hum ");

            day = in.nextInt() ;
            hour = in.nextInt() ;
            temp = in.nextInt() ;
            humnity  = in.nextInt() ;

            data[day -1 ][hour][0] =temp ;
            data[day -1 ][hour][1] =humnity ;*/    // in case of enter individual inputs


        for (int i = 0; i < n_day; i++) {
            for (int j = 0; j <n_hour ; j++) {
                System.out.println("day "+ (i) +  " hour" + (j) + ""  );
                data[i][j][0 ] = in.nextInt() ;
                data[i][j][1 ] = in.nextInt() ;
            }
        }


        int total_t , total_h ;
        for (int i = 0; i < n_day; i++) {
            total_t = total_h = 0 ;
            for (int j = 0; j <n_hour ; j++) {
                total_t+= data[i][j][0] ;
                total_h+= data[i][j][1] ;
            }

            System.out.println("avg day " +(i+1)+ " of temp  is  " + (total_t / (n_hour*1.0) )  );
            System.out.println("avg day " +(i+1)+ " of hummnity is  " + (total_h / (n_hour*1.0) )  );
        }

    }
}
