package binarySearch.utils;



public class SortingUtils<T extends Comparable<T>> {

    public T[] bubbleSorting(T[] arr){
        boolean counter = true;

        while (counter){
            counter = false;

            for (int i = 0; i < arr.length-1; i++) {
                int res = arr[i].compareTo(arr[i+1]);
                if (res > 0){
                    swap(arr[i], arr[i+1]);
                    counter = true;
                }
            }
        }
        showArr(arr);

        return arr;
    }


    public void swap (T elem1, T elem2){
        T helper;
        helper = elem1;
        elem1 = elem2;
        elem2 = helper;
    }

    public void showArr(T[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
