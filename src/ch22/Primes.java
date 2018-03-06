package ch22;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * this is
 * Created by mo3tamed on 2/3/18.
 */
public class Primes {

    public static void main(String[] args) {
        /*int c = 0  ;
        boolean[] primes = sieveEratho(1000) ;
        for (int i = 2; i <primes.length ; i++) {
            if (primes[i]) {
                System.out.println(" " + i);
                c++ ;
            }
        }
        System.out.println(c);*/

        System.out.println(primesDP(100_000_000).size());
       // System.out.println(sieveEratho(1000000000));
    }

    public static boolean [] sieveEratho (int  n ){
        boolean [] primes = new boolean[n+1];

        for (int i = 0; i <= n ; i++) {
            primes[i] = true ; 
        }

        for (int i = 2; i <= n/i ; i++) {  // sufficient  i * (i/n) will ne less or equal n (size of arr )
            if(primes[i] ){
                for (int j = i; j <= n/i ; j++) {
                    primes[j*i] = false ; 
                }
            }
        }
        return primes ; 
    }

    public static ArrayList<Integer> primesDP (int n ){

        ArrayList<Integer> primes = new ArrayList<>() ;
        int num = 2 ;
        int squareRoot = 1 ;
        boolean isPrime = true ;

        while (num <= n)
        {
            isPrime=true;// for each num assum it is a prime

            if (squareRoot * squareRoot < num )
                squareRoot ++ ;

            for (int i = 0; i < primes.size() && primes.get(i) <= squareRoot ; i++) {
                if (num % primes.get(i) == 0 )
                    isPrime = false ;
            }

            if (isPrime)
                primes.add(num);

            num ++ ;
        }

        return primes ;
    }






}
