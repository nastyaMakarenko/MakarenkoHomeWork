package binarySearch;


public interface IBinarySearch<T extends Comparable<T>>{

    void sortArray();
    int returnIndexOfSearchingElement (Comparable<T> numForSearch);

}
