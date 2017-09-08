package ch6;

/**
 * prime a is a non-palindromic prime number
 * which reverse also prime
 * Created by mo3tamed on 9/7/17.
 */
public class EmirpPalindrom {

   public static void main(String[] args) {


       for (int i = 10; i <200; i++) {
               if (isEmirp(i))
                   System.out.println(i);
       }

   }

   public static boolean   isEmirp (int n )
   {

       boolean status ;
       int reverse = PalindromeInteger.getReverse(n) ;

       if(isPrime(n) && !PalindromeInteger.isPalendrom(n))
       {
           if (isPrime(reverse))
               status = true ;
           else
               status = false ;
       }
       else
           status = false ;

       return status ;
   }

   public static boolean isPrime (int val )
   {
       boolean status = true ;
       int sqrt = (int) Math.sqrt(val) ;

       if (val < 2  )
           return  false ;
       else  if (val  == 2 )
           return true ;
       else if (val % 2 == 0  )
           return  false ;
       else {
           for (int i = 3; i <= sqrt; i+=2) {
            if (val  % i == 0 )
                status= false ;
           }
       }

       return  status ;
   }
}
