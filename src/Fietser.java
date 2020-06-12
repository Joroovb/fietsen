public class Fietser {

    String naam;
    int conditie;
    double portemonnee;
    int afstand;

    Sound sound = new Sound();

    Fietser(String naam, int conditie, double portemonnee, int afstand) {
        this.conditie = conditie;
        this.portemonnee = portemonnee;
        this.afstand = afstand;
    }

    void fietsen() {
        System.out.println("Lekker fietsen! Weer 10 kilometer verder!");
        conditie -= 10;
        System.out.println("*je conditie gaat met 10 omlaag en is nu " + conditie + ".*");
        afstand += 10;
        System.out.println("Je hebt nu " + afstand + " km gefietst!\n");
        sound.fietsen();
    }

    void marsEten() {
        System.out.println("Even een lekkere snack eten!\n");
        conditie +=20;
        System.out.println("*je conditie gaat met 20 omhoog en is nu " + conditie + ".*");
        portemonnee -= 1.20;
        System.out.println("*je hebt 1.20 uitgegeven aan een Mars. je hebt nog " + portemonnee + " over.*\n");
        sound.eten();
    }
    void bandPlakker() {
        conditie -= 20;
        System.out.println("*je conditie gaat met 20 omlaag en is nu " + conditie + ".*");
        sound.bandPlakker();
    }
    boolean teMoe() {
        if (conditie < 5) {
            System.out.println("Je bent te moe om verder te gaan. De trauma helikopter moet komen!\nGAME OVER!\n");
            sound.crash();
            return true;
        } else {
            return false;
        }
    }
}
