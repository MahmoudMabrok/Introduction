package ch3;

import java.util.Scanner;

/**
 * this is
 * Created by mo3tamed on 8/24/17.
 */
public class FutureDay {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in) ;
        int day = in.nextInt() ;
        System.out.println("الان "  + " " + getDay(day));
        System.out.println( "" + "  " + getDay((day +2) %7) );


    }


    public static String getDay (int n )
    {
        switch (n)
        {
            case 0:return  "السبت" ;
            case 1: return   "الاحد"  ;
            case 2: return   "الاثنين"  ;
            case 3: return   "الثلاثاء"  ;
            case 4: return   "الاربعاء"  ;
            case 5: return   "الخميس"  ;
            case 6: return   "الجمعه"  ;
            default:System.exit(0);
                return "خطا"   ;

        }
    }
}
