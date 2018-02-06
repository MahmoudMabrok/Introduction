package ch23;

import ch7.ArrayOPeration;

import java.util.ArrayList;

/**
 * this is
 * Created by mo3tamed on 2/4/18.
 */
public class Sorting {

    public static void main(String[] args) {
        int[] val = new int[]{5, 2, 1, 6, 8, 3, 0};

        Integer[] valI = new Integer[]{5, 2, 1, 6, 8, 3, 0};

        for (int e : val)
            System.out.print(e + "\t");
        System.out.println("\n**********************");
/*

        System.out.println("\nInsertion ^_^");
        insertion(val);
*/
      /*  System.out.println("\nBubbleSort ^_^");
        improvedBubble(val);
        */
           /* System.out.println("\nMerge ^_^");
           mergeSort(val);
*/
       /* System.out.println("\nQuickSort");
        quickSort(val);
*/

        for (int e : bucketSort(valI , 8 ))
            System.out.print(e + "\t");
/*

        for (int e : bucketSort(valI , 8 ))
            System.out.print(e + "\t");

*/

    }

    public static void insertion(int[] values) {

        for (int i = 1; i < values.length; i++) {
            int temp = values[i];
            int k = i - 1;
            while (k >= 0 && values[k] > temp) {
                values[k + 1] = values[k];
                k--;
            }
            values[k + 1] = temp;
        }
    }

    public static void improvedBubble(int[] values) {

        boolean needNextPass = true;  // used to indicate need to next pass
        int temp;
        for (int i = 1; i < values.length && needNextPass; i++) { //n of pass is (n-1 )
            needNextPass = false;
            for (int j = 0; j < values.length - i; j++) {
                if (values[j] > values[j + 1]) {
                    temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }

    public static void mergeSort(int[] list) {

        if (list.length > 1) {
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);

            int secondLength = list.length - firstHalf.length;
            int[] secondHalf = new int[secondLength];
            System.arraycopy(list, list.length / 2, secondHalf, 0, secondLength);
            mergeSort(secondHalf);

            merge(firstHalf, secondHalf, list);

        }
    }

    public static void merge(int[] list1, int[] list2, int[] list) {
        int current1 = 0;
        int current2 = 0;
        int current = 0;

        while (current1 < list1.length && current2 < list2.length) {
            if (list1[current1] < list2[current2])
                list[current++] = list1[current1++];
            else
                list[current++] = list2[current2++];

        }

        while (current1 < list1.length) // as if comparison not take all list1 then copy it to list
            list[current++] = list1[current1++];
        while (current2 < list2.length)
            list[current++] = list2[current2++];


    }

    public static void quickSort(int[] list) {
        quikSort(list, 0, list.length - 1);

    }

    public static void quikSort(int[] list, int first, int last) {
        if (last > first) {

            int pivot = partion(list, first, last);

            quikSort(list, first, pivot - 1);
            quikSort(list, pivot + 1, last);

        }

    }

    public static int partion(int[] list, int first, int last) {

        int pivot = list[first];
        int low = first + 1;
        int high = last;

        while (high > low) {
            while (low <= high && list[low] <= pivot)
                low++;
            while (low <= high && list[high] > pivot)
                high--;


            //swap
            if (high > low) {
                int temp = list[low];
                list[low] = list[high];
                list[high] = temp;
            }
        }
       /*
        while (high > first && list[high] >= pivot)
            high--;
       */


        if (pivot > list[high]) {

            int temp = list[first];
            list[first] = list[high];
            list[high] = temp;
            return high;

        } else
            return first;

    }


    public static Integer[] bucketSort(Integer [] values  , int max )
    {

        ArrayList<Integer>[]  bucket = new ArrayList[max+1] ;

        Integer  key ;
        for (int i = 0; i < values.length; i++) {
            key = values[i] ;

            if (bucket [key] == null )
                bucket[key] = new ArrayList<>() ;

            bucket[key].add(key);
        }

        int k =0 ;
        for (int i = 0; i <bucket.length ; i++) {

            if(bucket[i] != null)
                for (int j = 0; j <bucket[i].size() ; j++) {
                    values[k++] = bucket[i].get(j);
                }
        }

        return values ;
    }

}