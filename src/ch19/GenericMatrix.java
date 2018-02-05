package ch19;

/**
 * this is
 * Created by mo3tamed on 1/19/18.
 */
public abstract  class GenericMatrix <E extends  Number> {


    public  abstract  E  add (E element1 , E element2) ;
    public  abstract  E  multiply (E element1 , E element2) ;
    public  abstract  E  zero () ;
    public   E[][] addMatrix( E [][] mat1 , E [][] mat2 ) {
        E [][] result ;
        //check bounds
        if (mat1.length == mat2.length && mat1[0].length == mat2[0].length  )
        {

            result  = (E [][]) new Number [mat1.length][mat1[0].length] ;

            for (int i = 0; i < mat1.length; i++) {
                for (int j = 0; j < mat1[0].length; j++) {
                    result[i][j] = add (mat1[i][j] , mat2[i][j]) ;
                }
            }
        }else
            throw new  RuntimeException ("NOt Applicable Matrix , NOt same Dimension ") ;

        return  result ;
    }

    /**
     *
     * @param numer1 first operand
     * @param numer2 second operand
     * @param numer3 result
     * @param op     operation
     */
    public  static   void  printResult ( Number [][] numer1 ,Number [][] numer2,Number [][] numer3 , char op  ){
        for (int i = 0; i < numer1.length; i++) {
            for (int j = 0; j <numer1[0].length ; j++) {
                System.out.print(numer1[i][j]+"  ");
            }

            if  ( i == numer1.length/2)
                System.out.print( op + " ");
            else
            {
                System.out.print("  ");
            }

            for (int j = 0; j <numer2[0].length ; j++) {
                System.out.print(numer2[i][j]+"  ");
            }

            if  ( i == numer1.length/2)  // print at middle between two matrix
                System.out.print( "=" + " ");
            else
            {
                System.out.print("  ");
            }

            for (int j = 0; j <numer3[0].length ; j++) {
                System.out.print(numer3[i][j]+"  ");
            }
            System.out.println();
        }

    }

}
