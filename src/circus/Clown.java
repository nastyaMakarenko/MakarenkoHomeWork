package circus;

public class Clown extends Artist{

    public Clown(String name, int age, String phone, int numberOfPerformances){
        super(name, age, phone, numberOfPerformances);
    }

    public void perform(Artist clown){

        System.out.println("Clown is performing for kids");
        increaseNumberOfShows(clown);
    }

    public String toString() {
        return "Clown: " + super.toString();

    }
}
