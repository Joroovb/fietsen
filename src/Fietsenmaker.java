public class Fietsenmaker {

    boolean bandPlakker(double x) {
        if (x > 10) {
            System.out.println( "De fietsen maken heeft je band geplakt. Dat kost je 10 euro\n" +
                                "Je hebt nog " + x + " euro over.");
            return true;
        }
        return false;
    }
}
