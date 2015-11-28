package circus;


public class Illusionist extends Artist{

    public Illusionist(String name, int age, String phone, int numberOfPerformances){
        super(name, age, phone, numberOfPerformances);
    }

    public void perform(Artist illusionist){

        System.out.println("Illusionist is making focuses");
        increaseNumberOfShows(illusionist);
    }

    public String toString() {
        return "Illusionist: " + super.toString();

    }
}
