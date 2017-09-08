package ch7;

/**
 * this is excercise of Book "INtroducion of Java "
 * Created by mo3tamed on 9/7/17.
 */
public class isSorted {
    public static void main(String[] args) {

        int[] m = {  1,2,3 , 5 , 8 , 77  } ;

        System.out.println(isSorted(m));
    }

    public static boolean isSorted(int[] val )
    {

        for (int i = 0; i <val.length -1  ; i++) {
            if (val[i]  >  val[i+1] )
                return  false ;
        }

        return  true ;
    }
}
