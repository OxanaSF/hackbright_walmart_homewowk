import java.lang.Thread;
import java.util.Arrays;

public class FindingsList  {
    public FindingsList() {}

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(500);

        System.out.println("Welcome back!");

       String[] rocks = {"rock", "weird rock", "smooth rock", "not rock"};

       Boolean notRock = false;

       System.out.println("everything downloaded");
       for (int i = 0; i < rocks.length; i++) {
            if (rocks[i].equals("not rock")) {
                notRock = true;
            }
            System.out.println(rocks[i]);
       }

       if (notRock) {
        System.out.println("there’s a non-rock in the list – I need to delete it.");
        String[] rocksNewList = new String[rocks.length - 1];

        for (int i = 0; i < rocks.length; i++) {
            if (rocks[i].equals("not rock")) {
                continue;
            }
            rocksNewList[i] = rocks[i];
        }

        System.out.println(Arrays.toString(rocksNewList));
       }

       
    }
    
}
