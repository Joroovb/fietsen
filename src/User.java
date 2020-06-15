import java.util.Scanner;

public class User {

    public void loop() {

        boolean wilJeDoorSpelen = true;
        Fietser fietser = new Fietser("Joris", 100, 15, 0);
        Fiets fiets = new Fiets("Gazelle", "zwart", "stadfiets", false);
        Fietsenmaker fietsenmaker = new Fietsenmaker();

        while (wilJeDoorSpelen && !fietser.teMoe()) {
            System.out.println("Wat wil je doen?\n" +
                    "1 || Verder Fietsen\n" +
                    "2 || Mars eten\n" +
                    "3 || Zelf band plakken\n" +
                    "4 || Fietsenmaker band laten plakker\n" +
                    "5 || Stoppen met fietsen");

            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();

            switch (userInput) {
                case "1":
                    if (fiets.bandPlat) {
                        System.out.println("Je band is lek, daar kan je niet mee verder fietsen\n");
                        break;
                    } else if (fietser.teMoe()) {
                        break;
                    } else {
                        fietser.fietsen();
                        fiets.platteBand();
                        continue;
                    }
                case "2":
                    fietser.marsEten();
                    continue;
                case "3":
                    fietser.bandPlakker(fiets, fietser);
                    continue;
                case "4":
                    fietsenmaker.bandPlakker(fietser.portemonnee, fiets);
                    continue;
                case "5":
                    System.out.println("Het is een mooie tocht geweest. Morgen weer een dag!");
                    wilJeDoorSpelen = false;
                    break;
                default:
                    System.out.println("Dat was geen geldige keuze, probeer het opnieuw!");
                }
        }
    }
}
