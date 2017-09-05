package ch6;

/**
 * Task :
 * Use the reverse method to implement isPalindrome. A number is a palin-
 * drome if its reversal is the same as itself. Write a test program that prompts the
 * user to enter an integer and reports whether the integer is a palindrome.
 *
 *
 *
 *
 *
 *
 * Created by mo3tamed on 9/5/17.
 */
public class PalindromeInteger {
    public static void main(String[] args) {

        System.out.println(isPalendrom( 121 ));
    }

    public static   boolean isPalendrom ( int  n )
    {

        long reverse = getReverse(n ) ;
        System.out.println(reverse);
        return  reverse == n  ;
    }

    public static long  getReverse (int n )
    {
        long newnum = 0  ;
        int n_digit = getNumOfDigit(n) ;

        for (int i = 0; i <n_digit ; i++) {
            int current_num = n %10 ;
            n /= 10 ;
            newnum +=  (current_num *   Math.pow(10 , n_digit-i-1)) ;
        }

        return  newnum ;


    }

    public static int getNumOfDigit (int num )
    {
        int n = 1 ;
        while (  (num /= 10) > 0 )
            n++;

        return  n ;

    }

}
