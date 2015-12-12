package binarySearch.utils;



public class SortingUtils<T extends Comparable<T>> {

    public T[] bubbleSorting(T[] arr){
        boolean counter = true;
        T helper;

        while (counter){
            counter = false;

            for (int i = 0; i < arr.length-1; i++) {
                int res = arr[i].compareTo(arr[i+1]);
                if (res > 0){
                    helper = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = helper;

                    counter = true;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr;
    }


}
