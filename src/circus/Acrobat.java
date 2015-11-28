package circus;


public class Acrobat extends Artist{

    private boolean drunkFactor;
    private boolean jobQuality;

    @Override
    public String toString() {

        return "Acrobat: " + super.toString() +
                "is he drinking?: " + isDrunkFactor() +
                "is he doing his job good?: " + isJobQuality() +
                '}';

    }

    public Acrobat(String name, int age, String phone, int showsCounter, boolean drunkFactor, boolean jobQuality) {
        super(name, age, phone, showsCounter);
        this.drunkFactor = drunkFactor;
        this.jobQuality = jobQuality;
    }

    public boolean isJobQuality() {
        return jobQuality;
    }

    public boolean isDrunkFactor() {
        return drunkFactor;
    }

    public void perform(Artist acrobat){

        System.out.println("Acrobat is jumping");
        increaseNumberOfShows(acrobat);
    }
}
