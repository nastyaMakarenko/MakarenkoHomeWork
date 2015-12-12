package binarySearch;


public class TestBinarySearch2 {

    public static void main(String[] args) {
        BinarySearchController<Integer> controller = new BinarySearchController<>();

        Integer[] intArr = {6, 4, 0, 1, 3};
        BinarySearch<Integer> bs = new BinarySearch<>(intArr);

        bs.sortArray();

        int elementForSearch = 6;
        int indexOfSearchingElem = bs.returnIndexOfSearchingElement(elementForSearch);
        controller.checkReturnIndexOfSearchingResult(elementForSearch, indexOfSearchingElem);

    }
}
