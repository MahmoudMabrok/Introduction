package ch19;

/**
 * this is
 * Created by mo3tamed on 1/19/18.
 */
public class IntegerMatrix extends  GenericMatrix<Integer > {

    @Override
    public Integer add(Integer element1, Integer element2) {
        return   element1 + element2 ;
    }

    @Override
    public Integer multiply(Integer element1, Integer element2) {
        return element1 * element2 ;
    }

    @Override
    public Integer zero() {
       return  0 ;
    }
}
