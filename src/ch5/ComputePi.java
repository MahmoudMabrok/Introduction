package ch5;

/**
 * this is
 * Created by mo3tamed on 9/3/17.
 */
public class ComputePi {

    public static void main(String[] args) {

        System.out.println(computePI(1_000_000_000));
    }

    public  static double computePI(int n )
    {
        double pi = 0  ;
        for (int i = 0; i < n; i++) {
            pi += (Math.pow(-1  , i+1)) / (2*i+1)   ;
        }

        return  pi * 4  ;
    }


}
