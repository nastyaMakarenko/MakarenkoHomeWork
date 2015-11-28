package circus;


public class TightRopeWalker extends Artist {

    final private int percentsForRisk = 25;

    public TightRopeWalker(String name, int age, String phone, int numberOfPerformances){
        
        super(name, age, phone, numberOfPerformances);
    }

    public double getSalary() {
        return standartSalary/100*(100+percentsForRisk);
    }

    public void perform(Artist tightRopeWalker){

        System.out.println("Tight-rope walker is performing on rope");
        increaseNumberOfShows(tightRopeWalker);
    }

    public String toString() {

        return "Tight-rope walker: " + super.toString();

    }
}
