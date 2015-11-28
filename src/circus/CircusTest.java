package circus;


public class CircusTest {

    public static void main(String[] args) {

        Artist acrobat1 = new Acrobat("Dmitriy", 23, "+8098546372", 4, false, false);
        Artist acrobat2 = new Acrobat("Danil", 30, "+380737336", 22, true, false);
        Artist clown = new Clown("Petr", 18, "+380954738", 13);
        Artist illusionist = new Illusionist("Vadim", 38, "+3804545343", 39);
        Artist tightRopeWalker = new TightRopeWalker("Olga", 24, "+3804583459", 7);

        Director director = new Director();

        director.hireNewArtist(acrobat1);
        director.hireNewArtist(acrobat2);
        director.hireNewArtist(clown);
        director.hireNewArtist(illusionist);
        director.hireNewArtist(tightRopeWalker);

        director.showAllArtists();

        String firing = director.FireBadAcrobat();
        System.out.println(firing);
        director.showAllArtists();

        firing = director.FireBadAcrobat();
        System.out.println(firing);
        director.showAllArtists();

        director.doShow();

        director.showNumberOfPerformancesPerEachArtist();

        director.giveSalary();
    }
}


