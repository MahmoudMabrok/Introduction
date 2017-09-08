package ch6;

/**
 * this is excercise of Book "INtroducion of Java "
 * Created by mo3tamed on 9/7/17.
 */
public class getRoot {
    public static void main(String[] args) {

        System.out.println(getRoot(9));
    }

    public static double getRoot  (double n )
    {
     double last , next  = 1  ;

     do
     {
       last = next ;

       next = (last + n/last) / 2.0 ;

         System.out.println("last " + last + " next " + next);

     }while ( Math.abs(next -last  ) > 1e-4) ;


     return  next ;
    }
}
