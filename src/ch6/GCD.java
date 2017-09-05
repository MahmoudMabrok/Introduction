package ch6;

/**
 * this is
 * Created by mo3tamed on 9/3/17.
 */
public class GCD {
    public static void main(String[] args) {

        System.out.println(getGCD(120 , 48));


    }

    public  static  int getGCD (int n1 , int n2)
    {
        int gcd = 1  , k=1;
        while(k <= Math.min(n1 , n2)) // k is below // min of two
        {
            if ( n1 %k == 0 && n2%k == 0 )
                gcd = k ;
            k++;
        }
        return  gcd ;
    }
}
