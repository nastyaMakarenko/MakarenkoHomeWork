package timeCounting.sortings;


public class BubbleSorting {

    public static void bubbleSorting(int[] arr){
        boolean counter = true;
        int helper;

        while (counter){
            counter = false;

            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i+1]){
                    helper = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = helper;

                    counter = true;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +  " ");
        }

    }
}
