package ch2;

/**
 * this is
 * Created by mo3tamed on 8/21/17.
 */
public class GetTime {
    public static void main(String[] args) {
        long  totalSecond ,totalMin,totalHour ;
        totalSecond = System.currentTimeMillis() / 1000 ;
        System.out.println(totalSecond % 60);
        totalMin = totalSecond / 60 ;
        System.out.println(totalMin % 60);
        totalHour=totalMin / 60 ;

        System.out.println(totalHour % 24);
     

    }
}
