package ch30;

/**
 * this is
 * Created by mo3tamed on 2/25/18.
 */
public class customThread extends Thread {


    public static void main(String[] args) {
        new customThread(50).start();
    }
int n ;
public customThread(int num ){
    n= num ;

}
    @Override
    public void run() {
        for (int i = 0; i <n ; i++) {
            System.out.print(i+" ");
        }
    }
}
