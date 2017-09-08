package ch6;

/**
 * this is 6.18
 *
 *
 * password must have at least eight characters.
 * A password consists of only letters and digits.
 * A password must contain at least two digits.
 * Write a program that prompts the user to enter a password and displays Valid
 * Password if the rules are followed or Invalid Password otherwise.
 *
 * Created by mo3tamed  on 9/5/17.
 */
public class CheckPassword {
    public static void main(String[] args) {

        System.out.println(checkPass("jhu987?1"));
        System.out.println(checkPass("jh7?1"));
        System.out.println(checkPass("jhurwewews1"));  //all get false

    }

    public static boolean checkPass ( String input )
    {
        boolean status  = true;
        int n_digit = 0 ;

        if (input.length() < 8 ) // check length of pass
            return  false ;


        char temp  ;
        for (int i = 0; i < input.length(); i++) {
            temp = input.charAt(i) ;
            if ( !Character.isAlphabetic(temp)  &&  !Character.isDigit(temp) ) // check if it contain a non (digit & alpha )
                status =  false   ;
            else if (Character.isDigit(temp))
                n_digit ++ ; // get num of digit
            else
                status = true ; // this case char is valid to be pass
        }


        if (n_digit < 2)
            status = false ;


        return  status ;


    }


}
