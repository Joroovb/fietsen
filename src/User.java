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
                    "3 || Band plakken\n" +
                    "4 || Stoppen met fietsen");

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
                    bandenPlakken(fietser, fiets, fietsenmaker);
                    continue;
                case "4":
                    System.out.println("Het is een mooie tocht geweest. Morgen weer een dag!");
                    wilJeDoorSpelen = false;
                    break;
                default:
                    System.out.println("Dat was geen geldige keuze, probeer het opnieuw!");
                }
        }
    }
    public void bandenPlakken(Fietser jan, Fiets fiets, Fietsenmaker kees) {
        if (fiets.bandPlat) {
            Scanner scanner3 = new Scanner(System.in);
            String bandIn = scanner3.nextLine();

            switch (bandIn) {

                case "1":
                    jan.bandPlakker();
                    fiets.setPlatteBand();
                    scanner3.close();

                case "2":
                    if (kees.bandPlakker(jan.portemonnee)) {
                        jan.portemonnee -= 10;
                        fiets.setPlatteBand();
                        scanner3.close();
                    } else {
                        System.out.println("Je hebt niet genoeg geld om naar de fietsenmaker te gaan, je zult zelf je band moeten plakken!\n");
                        scanner3.close();
                    }
            }
        } else {
            System.out.println("Je band is helemaal niet plat. Ga lekker fietsen!\n");
        }
    }
}
