import java.lang.Thread;
public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String colonyName = "Pioneers";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;


        meals = meals - (0.75 * shipPopulation * 2);
        System.out.println(meals);

        meals = meals * ((double)50 / 100);

        shipPopulation += 5;

        String landingLocation = "The Hill";

        if (landingLocation.equalsIgnoreCase("The Plain") ) {
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }

        landing = landingCheck(3);


        GuessingGame game = new GuessingGame();

        MarsExpedition marsExpedition = new MarsExpedition();
    }

    public static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for (int minute = 0; minute <= minutesLeft; minute++ ) {
            if (minute % 2 == 0 && minute % 3 == 0) {
                System.out.println("Keep Center");
            } else if (minute % 2 == 0 ) {
                System.out.println("Right");
            } else if (minute % 3 == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }

            Thread.sleep(250);
        }
        System.out.println("Landed");

        return false;
    }
}