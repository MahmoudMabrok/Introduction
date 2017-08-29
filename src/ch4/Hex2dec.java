package ch4;

/**
 * this is
 * Created by mo3tamed on 8/29/17.
 */
public class Hex2dec {


    public static void main(String[] args) {

        System.out.println(hex2Dec("FF"));

    }

    public static long  hex2Dec(String input )
    {
        int value = 0  ;
        long result = 0 ;

        for (int i = 0; i < input.length(); i++) {
             if (Character.isDigit(input.charAt(i)))
             {
                 StringBuilder sb = new StringBuilder() ;
                 sb.append(input.charAt(i)) ;
                 value =Integer.parseInt(sb.toString());

             }else
             {
                 value = input.charAt(i) - 'A'+10;
             }
            System.out.println(value);

             result += (value * Math.pow(16 , input.length() -1-i)) ;
        }

        return  result ;
    }


}
