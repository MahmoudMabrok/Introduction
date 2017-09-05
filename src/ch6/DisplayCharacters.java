package ch6;

/**
 * this is 6 .12
 * This method prints the characters between ch1 and ch2 with the specified num-
 * bers per line. Write a test program that prints ten characters per line from 1 to Z.
 * Characters are separated by exactly one space.
 *
 * Sol ::
 * get int of first then loop to last
 * in out cast int to char
 *
 * Created by mo3tamed on 9/5/17.
 */
public class DisplayCharacters {


    public static void main(String[] args) {

        printBetween2Char('a' , 's' );
    }


    public static  void printBetween2Char( char ch1 , char ch2 )
    {

        for (int i = (int)ch1; i <(int)ch2 ; i++) {
            System.out.print((char)i  + "  ");
        }
    }

}
