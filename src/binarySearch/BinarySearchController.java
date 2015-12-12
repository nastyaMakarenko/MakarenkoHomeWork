package binarySearch;


import java.util.ArrayList;

public class BinarySearchController<T extends Comparable<T>> {


        public BinarySearchController(){

        }

        public void doBinarySearch(T[] userArr, T elementForSearch){
            BinarySearch<T> bS = new BinarySearch<>(userArr);

            bS.sortArray();

            int index = bS.returnIndexOfSearchingElement(elementForSearch);

            checkReturnIndexOfSearchingResult(elementForSearch, index);
        }

        public void checkReturnIndexOfSearchingResult(T elementForSearch, int index){
            System.out.println();

            if (index < 0){
                System.out.println("Element " + elementForSearch + " was not found");
            }
            else{
                System.out.println("Element " + elementForSearch + " was found with index "
                        + index);
            }

        }


}
