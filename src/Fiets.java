import java.util.Random;

public class Fiets {
    String merk;
    String kleur;
    String model;
    boolean bandPlat;

    public Fiets(String merk, String kleur, String model, boolean bandPlat) {
        this.merk = merk;
        this.kleur = kleur;
        this.model = model;
        this.bandPlat = bandPlat;
    }

    void platteBand() {
        Random random = new Random();
        int i = random.nextInt(20);

        if (i == 0) {
            bandPlat = true;
            System.out.println( "*ppppssssssshhhhhhhhhtttttt*\n" +
                                "Je hebt een lekke band! Je kan niet verder fietsen.\n");
        }
    }

    void setPlatteBand() {
        bandPlat = false;
    }
}
