package ch7;

/**
 * this is excercise of Book "INtroducion of Java "
 *
 * task
 * get student and scores
 * then sort scores
 * and display student after sort
 *
 * idea sort scores by Selection Sort and in swap scope
 * also swap students ....
 * Created by mo3tamed on 9/7/17.
 */
public class sortStudentScore {
    public static void main(String[] args) {

        int[] scores = { 10 , 12 , 15 , 17 , 11 , 10 } ;
        String[] students = { "Ahmed", "Mohamed","Mahmoud","Islam", "Mark ", "Magdy" } ;

        System.out.println("before ");

        for (int i = 0; i < scores.length; i++) {
            System.out.println("name " + students[i] + "   " + scores[i]);
        }

        sortStudentScore(students , scores );
        System.out.println("after ");

        for (int i = 0; i < scores.length; i++) {
            System.out.println("name " + students[i] + "   " + scores[i]);
        }

    }

    public static  void sortStudentScore( String[] students , int[] val ) {

        int minValue  ;
        int minIndex  ;

        for (int i = 0; i <val.length ; i++) {
            minValue = val[i];
            minIndex = i;
            for (int j = i+1; j < val.length; j++) {
                if (val[j] < minValue)
                {
                    minValue = val[j] ;
                    minIndex = j ;

                }
            }

            if (minIndex != i)
            {
                val[minIndex] = val[i] ;
                val[i] = minValue ;

                String temp  = students[minIndex] ; // replace student as their indexs of scores change
                students[minIndex] = students[i] ;
                students[i] = temp ;
            }
        }
    }
}
