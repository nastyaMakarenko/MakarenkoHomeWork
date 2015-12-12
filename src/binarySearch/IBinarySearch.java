package binarySearch;


import java.util.ArrayList;

public interface IBinarySearch<T extends Comparable<T>>{

    void sortArray();
    int returnIndexOfSearchingElement (Comparable<T> numForSearch);

}
