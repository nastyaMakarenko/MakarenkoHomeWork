package circus;


abstract public class Artist extends Human {

    final public double standartSalary = 500.00;
    protected int numberOfPerformances;

    public Artist(String name, int age, String phone, int numberOfPerfomances) {
        super(name, age, phone);
        this.numberOfPerformances = numberOfPerfomances;
    }

    @Override
    public String toString() {
        return super.toString() +
                "salary:" + getSalary() +
                ", number performances:" + getNumberOfPerformances();

    }

    public int getNumberOfPerformances() {

        return numberOfPerformances;
    }

    public double getSalary() {

        return standartSalary;
    }

    abstract public void perform(Artist artist);

    protected void increaseNumberOfShows(Artist artist){

        artist.numberOfPerformances++;
    }

    public String toStringToShowNumberOfPerfomances() {
        return "Name:" + getName()+
                ", number performances:" + getNumberOfPerformances();

    }
}
