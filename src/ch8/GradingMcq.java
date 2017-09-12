package ch8;

import ch7.ArrayOPeration;

/**
 * this is excercise of Book "INtroducion of Java "
 * Created by mo3tamed on 9/7/17.
 *
 *
 * HINT ArrayOPeration is a class from ch7
 */
public class GradingMcq {
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};


        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        ArrayOPeration.display(gradingMcq( answers,keys ));


    }

    public static int []  gradingMcq( char[][] answer  , char[] key ) {
        int answer_length = answer.length  , key_length = key.length ;
        int [] score = new int [answer.length ] ;
        int sum ;

        for (int i = 0; i <answer_length ; i++) {
            sum = 0 ;
            for (int j = 0; j <key_length ; j++) {

                if (answer[i][j] == key [j] )
                    sum ++ ;
            }

            score[i] = sum ;
        }

        return  score ;

    }
}
