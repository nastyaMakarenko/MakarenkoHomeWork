package binarySearch;


import binarySearch.exceptions.ArrayEmptyException;
import binarySearch.utils.SortingUtils;

public class BinarySearch <T extends Comparable<T>> implements IBinarySearch<T> {

    private T[] arr;

    public BinarySearch (T[] usersArray) {
        if (usersArray.length == 0){
            throw new ArrayEmptyException();
        }
        arr = usersArray;
    }

    public int recursiveBinarySearch(int startIndex, int endIndex, Comparable<T> elemForSearch){
        int res = 0;
        int midIndex = (startIndex + endIndex) / 2;

        if (startIndex <= endIndex - 1) {

            T midValue = arr[midIndex];
            int result = elemForSearch.compareTo(midValue);

            if (result < 0) {
                res += recursiveBinarySearch(startIndex, midIndex - 1, elemForSearch);
            }
            else if (result > 0) {
                res += recursiveBinarySearch(midIndex + 1, endIndex, elemForSearch);
            }
            else {
                res += midIndex;
            }
            return res;
        }
        else{
            return -1;
        }

    }

    @Override
    public void sortArray(){
        SortingUtils su = new SortingUtils();
        su.bubbleSorting(arr);
    }

    @Override
    public int returnIndexOfSearchingElement(Comparable<T> elemForSearch) {

        int startIndex = 0;
        int endIndex = arr.length;

        return recursiveBinarySearch(startIndex, endIndex, elemForSearch);

    }

}

