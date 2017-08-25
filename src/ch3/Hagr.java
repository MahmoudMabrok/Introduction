package ch3;

import java.util.Scanner;


/**
 * this is implement Hager wa game 
 * Created by mo3tamed on 8/24/17.
 */
public class Hagr {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in) ;
        System.out.println("مرحبا بك ف لعبة حجر ورقة مقص " +
                "الشرح \n" +
                "حجر يصدم المقص و الورقة تلف الحجر والمقص يقطع الورقة " +
                "\n " +
                " يلا نبدا ونا هاقطعك " +
                "دخل رقم من  0,1,2  حجر وورقة ومقص ");
        System.out.println("رقمك ");
        Byte user = in.nextByte() ;
        int com = (int)(Math.random()*3) ;

        System.out.println("انا");
        switch (com) {
            case 0:
                System.out.println("حجر");
                break;
            case 1:
                System.out.println("ورقة");
                break;
            case 2:
                System.out.println("مقص ");
                break;

        }
        System.out.print(" وانت ");
        switch (user) {
            case 0:
                System.out.println("حجر");
                break;
            case 1:
                System.out.println("ورقة");
                break;
            case 2:
                System.out.println("مقص ");
                break;
            default:
                System.out.println(" هتستعبط ,  انا مش لاعب معاك ");
                System.exit(0);
        }


        System.out.println("النتيجة .... ؟؟؟");
        if (user == com)
            System.out.println(" تعادل . فلت منى "); //draw
        else
        {

            if (user == 0)
                System.out.println((com==2) ?  "لقد صدمتنى . بس مش هاسيبك  " : "لفيتك ياض .امشي يا فاشل" );
           else if (user == 1)
                System.out.println((com==0) ? " فزت و لفتنى ماشي يا كبير "  :"انا قصيتك امشي يا فاشل "  );
            else
                System.out.println((com==1) ?  " قطعتنى يا قاسي مبروك النصر " : "خلصت عليك يا فاشل " );

        }
    }
}
