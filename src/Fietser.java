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

    void bandPlakker(Fiets fiets, Fietser fietser) {
        if (fiets.bandPlat) {
            if (fietser.conditie < 20) {
                conditie -= 20;
                System.out.println("*je conditie gaat met 20 omlaag en is nu " + conditie + ".*");
                fiets.setPlatteBand();
                sound.bandPlakker();
            } else {
                System.out.println("Je bent te moe om dit te doen, ga naar de fietsenmaker of eet een snack!\n");
            }
        } else {
            System.out.println("Je band is helemaal niet plat. Ga toch fietsen!\n");
        }
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
