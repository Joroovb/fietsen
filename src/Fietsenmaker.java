public class Fietsenmaker {

    void bandPlakker(double x, Fiets fiets) {
        if (fiets.bandPlat) {
            if (x > 10) {
                System.out.println("De fietsen maken heeft je band geplakt. Dat kost je 10 euro\n" +
                        "Je hebt nog " + x + " euro over.");
                fiets.setPlatteBand();
            } else {
                System.out.println("Je hebt niet genoeg geld om je band te laten plakken! Je moet het zelf doen.\n");
            }
        } else {
            System.out.println("Je band is helemaal niet plat. Ga toch fietsen!\n");
        }
    }
}
