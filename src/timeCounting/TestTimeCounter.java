package timeCounting;

public class TestTimeCounter {
    public static void main(String[] args) {
        long time1 = TimeCounter.countActionTime(new BubbleSearchTimeCount());
        System.out.println(time1);



    }
}
