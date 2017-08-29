package ch4;

/**
 * this is
 * Created by mo3tamed on 8/29/17.
 */
public class Dec2Hex {
    public static void main(String[] args) {
        System.out.println(dec2Hex(256));

    }
    public static String   dec2Hex(long num )
    {
        StringBuilder sb = new StringBuilder() ;
        long value = 0 ;
        while (num > 0 )
        {
            value = num %16 ;
            if (value < 10 )
            {
                sb.append(value) ;
              //  System.out.println(sb.toString());
            }else
            {
                sb.append( (char)('A' + (value - 10)));
               // System.out.println(sb.toString());
            }

            num /= 16 ;

        }

        sb.reverse() ;  // because we start from right
        return sb.toString() ;

    }
}
