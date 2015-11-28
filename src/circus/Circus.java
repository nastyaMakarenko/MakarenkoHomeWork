package circus;


public class Circus {

    private String city;
    private String district;
    private String street;
    private int houseNumber;

    public Circus(String city, String district, int houseNumber, String street) {
        this.city = city;
        this.district = district;
        this.houseNumber = houseNumber;
        this.street = street;
    }

    public void setCity(String city) {

        this.city = city;
    }

    public void setDistrict(String district) {

        this.district = district;
    }

    public void setHouseNumber(int houseNumber) {

        this.houseNumber = houseNumber;
    }

    public void setStreet(String street) {

        this.street = street;
    }

    public String getCity() {

        return city;
    }

    public String getDistrict() {

        return district;
    }

    public int getHouseNumber() {

        return houseNumber;
    }

    public String getStreet() {

        return street;
    }

    public String toString() {
        return "Circus{" +
                "city:" + getCity() +
                ", district:" + getDistrict() +
                ", street:" + getStreet() +
                ", number of house:" + getHouseNumber() +
                '}';
    }
}
