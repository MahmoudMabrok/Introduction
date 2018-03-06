package ch20;

import java.util.Stack;

/**
 * this is
 * Created by mo3tamed on 1/21/18.
 *
 * (Match grouping symbols) A Java program contains various pairs of grouping
 symbols, such as:
 ■
 Parentheses: ( and )
 ■
 Braces: { and }
 ■
 Brackets: [ and ]
 Note that the grouping symbols cannot overlap. For example, (a{b)} is illegal.
 Write a program to check whether a Java source-code file has correct pairs of
 grouping symbols. Pass the source-code file name as a command-line argument.

 */
public class Excercise20_11 {

    public static void main(String[] args) {


        System.out.println(isGrouped("((s5))"));
        System.out.println(isGrouped("((sasasa})"));
        System.out.println(isGrouped("([]{s4k})"));
    }
    public static boolean isGrouped (String s ){

        Stack<Character > st = new Stack<>() ;
        for (char  c :s.toCharArray() )
        {
            if (Character.isDigit(c) || Character.isAlphabetic(c))
                continue;
            else if ( c == '(' ||
                    c == '{' ||
                    c == '[' )
                st.push(c) ;
            else
            {
                char p = st.pop() ;
                if ((p == '(' && c==')' ) || (
                        p == '{' && c == '}') || (
                        p == '[' && c==']') )
                    ;
                else
                    return false ;
            }
        }
        st = null;
        return true ;
    }
}
















