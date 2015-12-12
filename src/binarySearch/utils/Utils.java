package binarySearch.utils;

public class Utils {

    private static int generateRandomNum(int leftR, int rightR){
        return leftR + (int)(Math.random() * (rightR - leftR));
    }

    public static int[] createArray(int size, int leftR, int rightR){
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generateRandomNum(leftR, rightR);
        }
        return arr;
    }

    public static double[] numberArrToDoubleArr (Number[] arr){
        double[] arrOfDouble = new double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrOfDouble[i] = arr[i].doubleValue();
        }
        return arrOfDouble;
    }


}
