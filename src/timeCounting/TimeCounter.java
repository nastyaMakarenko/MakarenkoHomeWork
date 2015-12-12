package timeCounting;



public class TimeCounter {
    public static long countActionTime(TimeAction timeAction){

        long start = System.currentTimeMillis();
        timeAction.callWrappedAction();
        long end = System.currentTimeMillis();

        return end - start;
    }

}

