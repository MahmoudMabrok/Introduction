package ch5;

/**
 * this is
 *
 * (Financial application: compute future tuition) Suppose that the tuition for a uni-
 * versity is $10,000 this year and increases 5% every year. In one year, the tuition
 * will be $10,500. Write a program that computes the tuition in ten years and the
 * total cost of four years’ worth of tuition after the tenth year.

 * Created by mo3tamed on 8/31/17.
 */
public class FutureTutition {

    public static void main(String[] args) {


        int  Tut = 10_000 ;
        for (int i = 0; i < 10; i++) {
            Tut *= 1.05 ;
        }
        System.out.println(Tut); // Tut after ten Years

        int sum = 0  ;
        for (int i = 0; i < 4; i++) {
            Tut*= 1.05 ;
            sum += Tut ;
        }

        System.out.println(sum); // sum of worth after 4 years after 10 years ;


    }
}
