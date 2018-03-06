package ch30;
import  java.util.concurrent.* ;

/**
 * this is
 * Created by mo3tamed on 2/25/18.
 */
public class StartThreads {

    public static void main(String[] args) {

        Runnable printA = new printChar('a' , 1000) ;
        Runnable print1000 = new printNum(1000) ;


        Thread thread1 = new Thread(printA) ;
        Thread thread2 = new Thread(print1000) ;

      //  ExecutorService ex = Executors.newFixedThreadPool(10) ;
        ExecutorService ex = Executors.newCachedThreadPool();
        ex.execute(new printChar('a' , 100));
        ex.execute(new printChar('q' , 1100));
        ex.execute(new printChar('e' , 30000));
        ex.execute(new printChar('s' , 50));
        ex.execute(new printChar('b' , 30));
        ex.execute(new printChar('b' , 30));
        ex.execute(new printChar('b' , 30));
        ex.execute(new printChar('b' , 30));
        ex.execute(new printChar('b' , 30));


        ex.shutdown();





      //  thread1.start();
     //   thread2.start();
        

    }
}
class printChar implements  Runnable {

    char c ;
    int n ;

    public printChar(char c , int n )
    {
        this.c = c ;
        this.n = n ;
    }

    @Override
    public void run() {
        try {
        for (int i = 0; i <n ; i++) {
            System.out.println(c  + " "+i);
                Thread.sleep(1);
        }
    }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
 class  printNum implements Runnable {

    int n ;

     public printNum(int n) {
         this.n = n;
     }

     @Override
     public void run (){

         Thread t = new Thread(new printChar('a'  , 1000));
         t.start();

         try {
             for (int i = 0; i <= n; i++) {
                 System.out.println(" " + i);
                 if (i == n / 2)
                     t.join();
             }
         }catch (InterruptedException e)
         {

         }
    }
 }