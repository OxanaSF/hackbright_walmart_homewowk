import java.lang.Thread;
import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition() {}

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Expedition prep program starting...");

        System.out.println("Booting up...");
        System.out.println("...");
        Thread.sleep(2000);
        System.out.println("...");
        Thread.sleep(2000);
        System.out.println("Ready");

        System.out.println("What is your name?");
        String teamLeaderName = input.nextLine();

        System.out.println("Hi, " + teamLeaderName + " — Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");
        String leaderResponse = input.nextLine();

        if(leaderResponse.equalsIgnoreCase("N")) {
            System.out.println("Too bad you are team leader. You have to go.");  
        } else {
            prepareExpedition(input, teamLeaderName);
        }
    }


    public static void prepareExpedition ( Scanner input, String teamLeaderName) {
        System.out.println("I knew you would say that. You are a team leader for a reason.");
        System.out.println("How many people do you want on your team?");
        int teamSize;

        while (true) {
            try {
                teamSize = input.nextInt();
                if(teamSize < 0) {
                    throw new IllegalArgumentException("The number can't be negative.");
                } else if (teamSize > 2) {
                    System.out.println("That’s way to many people. We can only send two more members. I've set two team members for your team instead of " + teamSize);
                    teamSize = 2;
                } else if ( teamSize < 2) {
                    System.out.println("We want a team with you plus two members. " +
                            "\nI added " + (2 - teamSize) + " members to your team.");
                    teamSize = 2;
                    System.out.println();
                } else {
                    System.out.println("Perfect!");
                    System.out.println();
                }
                break;

            } catch (IllegalArgumentException e) {
                System.out.println("The number can't be negative.");
            }
        }



        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
        input.nextLine();
        String snack = input.nextLine();
        System.out.println("Nice choice, you will be bringing " + snack + " with you.");


        System.out.println("Choose a vehicle from a list" +
                "\nA: A Mars Rover" +
                "\nB: A Chevy Silverado" +
                "\nC: A Honda Civic");

        String vehicle = input.nextLine();
        System.out.println();

        if (vehicle.equalsIgnoreCase("A")) {
            vehicle = "A Mars Rover";
        } else if (vehicle.equalsIgnoreCase("B")) {
            vehicle = "Chevy Silverado";
        } else {
            vehicle = "A Honda Civic";
        }

        System.out.println("The team is ready!" +
                "\nThe Leader is " + teamLeaderName + "." +
                "\nThe team size is " + teamSize + "." +
                "\nThe vehicle is " + vehicle + "." +
                "\n3..." +
                "\n2..." +
                "\n2..." +
                "\nGO!");
    }

}
