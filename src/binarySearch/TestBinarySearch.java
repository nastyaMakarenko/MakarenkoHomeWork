package binarySearch;


public class TestBinarySearch {

    public static void main(String[] args) {
        Integer[] intArr = {0,5,2,8,1};

        BinarySearchController<Integer> controller = new BinarySearchController<>();

        controller.doBinarySearch(intArr,5);
    }
}
