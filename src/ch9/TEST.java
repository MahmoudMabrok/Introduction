package ch9;

/**
 * this is
 * Created by mo3tamed on 10/16/17.
 */
public class TEST {
    private int[]values ={10,25,14} ;

    public static void main(String[] args) {

       /* Integer i = new Integer("5");
        System.out.println("i = " + i);

        i= new Integer("25") ;
        System.out.println("i = " + i);


        Object o = new Object();
        System.out.println(o);*/


    }
    public static Integer increment( Integer n ){
        /*System.out.println("n = " + n);
        n++ ;
        System.out.println("n = " + n);*/
        n++;
        n++;
        n++;
        System.out.println();
        return n;
    }
    public   int[] getValues()
    {
        return  values ;

    }

}

class ANA {

    int a  ;
    int b ;

    public ANA(int a, int b) {
        this.a = a;
        this.b = b;
    }
    /*
    public static void main(String[] args) {

        TEST t = new TEST();
        t.getValues()[0] = 2220 ;
        System.out.println(t.getValues()[0]);
    }*/
}
