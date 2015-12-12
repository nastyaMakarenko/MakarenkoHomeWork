package timeCounting;


import timeCounting.sortings.BubbleSorting;

public class BubbleSearchTimeCount implements TimeAction {

    @Override
    public void callWrappedAction(){
        int[] defaultArr = {9,0,7,2,44,0,23,33,7,4,99,1};

        BubbleSorting.bubbleSorting(defaultArr);
    }
}
