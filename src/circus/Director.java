package circus;
import java.util.ArrayList;

public class Director extends Human{

    protected ArrayList<Artist> artists = new ArrayList<Artist>();
    private double budget = 10000.00;

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void hireNewArtist(Artist artist){

        artists.add(artist);
        System.out.println("New artist was hired for a job");
    }

    public void showAllArtists(){

        for (int i = 0; i < artists.size(); i++) {
            System.out.println(artists.get(i).toString());                  //toString?
        }
    }

    public String FireBadAcrobat(){

        String res;

        for (int i = 0; i < artists.size(); i++) {

            if (artists.get(i) instanceof Acrobat){

                if (((Acrobat) artists.get(i)).isDrunkFactor() == true && ((Acrobat) artists.get(i)).isJobQuality() == false){

                    res = artists.get(i).toString() + " was fired";
                    artists.remove(i);
                    return res;
                }
            }
        }

        res = "None of artists was fired";
        return res;
    }

    public void doShow(){

        for (int i = 0; i < artists.size(); i++) {
            artists.get(i).perform(artists.get(i));
        }

    }

    public void showNumberOfPerformancesPerEachArtist(){

        for (int i = 0; i < artists.size(); i++) {
            System.out.println(artists.get(i).toStringToShowNumberOfPerfomances());
        }
    }

    public void giveSalary (){

        System.out.println("Budget before giving salary: " + getBudget());

        for (int i = 0; i < artists.size(); i++) {

            setBudget(getBudget() - artists.get(i).getSalary());;
        }

        System.out.println("Budget after giving salary: " + getBudget());
    }

    public void changeCircusLocation (Circus circusWithOldLocation, String city, String district, String street, int houseNumber){

        System.out.println("Old circus location: " + circusWithOldLocation.toString());

        circusWithOldLocation.setCity(city);
        circusWithOldLocation.setDistrict(district);
        circusWithOldLocation.setStreet(street);
        circusWithOldLocation.setHouseNumber(houseNumber);

        System.out.println("Location was changed. New location: " + circusWithOldLocation.toString());
    }
}
