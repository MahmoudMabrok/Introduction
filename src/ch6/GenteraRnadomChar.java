package ch6;

/**
 * this is
 * Created by mo3tamed on 9/3/17.
 */
public class GenteraRnadomChar {

    public static void main(String[] args) {

        for (int i = 0; i <500 ; i++) {
            System.out.println( (char)getRandom('a' , 'z') );
        }

    }

    public static  int getRandom (int start  ,  int end )
    {
        return start + (int ) (Math.random() * (end - start + 1 )) ;
    }
}
