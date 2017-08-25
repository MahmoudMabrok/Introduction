package ch2;

/**
 * this is
 * Created by mo3tamed on 8/22/17.
 */
public class SumOfDigt {
    public static long sumDigit(long value )
    {
        long sum = 0 ;
        while(value > 0 ){
            sum += value %10 ;
            value/=10;
        }
        return  sum ;

    }
}
