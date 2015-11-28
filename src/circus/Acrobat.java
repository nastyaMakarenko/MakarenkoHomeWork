package circus;


public class Acrobat extends Artist{

    private boolean drunkFactor;
    private boolean jobQuality;

    public Acrobat(){

    }

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

    public Acrobat (boolean drunkFactor, boolean jobQuality){
        this.drunkFactor = drunkFactor;
        this.jobQuality = jobQuality;
    }

    public boolean isJobQuality() {
        return jobQuality;
    }

    public void setJobQuality(boolean jobQuality) {
        this.jobQuality = jobQuality;
    }

    public boolean isDrunkFactor() {
        return drunkFactor;
    }

    public void setDrunkFactor(boolean drunkFactor) {

        this.drunkFactor = drunkFactor;
    }

    public void perform(Artist acrobat){

        System.out.println("Acrobat is jumping");
        increaseNumberOfShows(acrobat);
    }





}
