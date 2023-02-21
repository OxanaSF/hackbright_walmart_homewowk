    import java.util.ArrayList;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();
            Cupcake cupcake = new Cupcake("Standard");
            RedVelvet redVelvet = new RedVelvet("Red velvet");
            Chocolate chocolate = new Chocolate("Chocolate");

            System.out.println();
            System.out.println("We are in the middle of creating the cupcake menu. " +
                    "\nWe currently have three cupcakes on the menu, but we need " +
                    "to decide on pricing.");

            createPrice(cupcake);
            createPrice(redVelvet);
            createPrice(chocolate);

            cupcakeMenu.add(cupcake);
            cupcakeMenu.add(redVelvet);
            cupcakeMenu.add(chocolate);

            cupcakeMenu.forEach(cupcakeName -> {
                System.out.println(cupcakeName.getName());
            } );



            ArrayList<Drink> drinkMenu = new ArrayList<Drink>();
            Drink water = new Drink("Water");
            Soda soda = new Soda("Soda");
            Milk milk = new Milk("Milk");

            System.out.println();
            System.out.println("We are in the middle of creating the drink menu. " +
                    "\nWe currently have three drinks on the menu, but we need " +
                    "to decide on pricing.");

            createPrice(water);
            createPrice(soda);
            createPrice(milk);

            drinkMenu.add(water);
            drinkMenu.add(soda);
            drinkMenu.add(milk);

            drinkMenu.forEach(drinkName -> {
                System.out.println(drinkName.getName());
            } );



            Order order = new Order(cupcakeMenu, drinkMenu);
            order.createOrder();
        }


        public static void createPrice (Cupcake cupcakeCategory) {

            Scanner input = new Scanner(System.in);
            System.out.println();
            System.out.println("We are deciding on the price for our " + cupcakeCategory.getName() + " cupcake. " +
                    "\nHere is the description:");

            cupcakeCategory.type();

            System.out.println("How much would you like to charge for the " + cupcakeCategory.getName() + " ? " +
                    "(Input a numerical number taken to 2 decimal places.)");

            String priceText = input.nextLine();

            double price = Double.parseDouble(priceText);
            cupcakeCategory.setPrice(price);

        }

        public static void createPrice (Drink drinkCategory) {

            Scanner input = new Scanner(System.in);
            System.out.println();
            System.out.println("We are deciding on the price for " + drinkCategory.getName() + "." +
                    "\nHere is the description:");

            drinkCategory.type();

            System.out.println("How much would you like to charge for the " + drinkCategory.getName() + " ? " +
                    "(Input a numerical number taken to 2 decimal places.)");

            String priceText = input.nextLine();

            double price = Double.parseDouble(priceText);
            drinkCategory.setPrice(price);
        }
    }


    class Cupcake {
        public double price;
        private String name;

        public Cupcake(String name ) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void type() {
            System.out.println("\"A basic, generic cupcake, with vanilla frosting.\"");
        }
    }


    class RedVelvet extends Cupcake {
        public RedVelvet(String name) {
            super(name);
        }

        @Override
        public void type() {
            System.out.println("\"A red velvet based cupcake, with cream cheese frosting.\"");
        }
    }

    class Chocolate extends Cupcake {
        public Chocolate(String name) {
            super(name);
        }

        @Override
        public void type() {
            System.out.println("\"A chocolate based cupcake, with chocolate frosting.\"");
        }
    }


    class Drink {
        public double price;
        private String name;

        public Drink(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void type() {
            System.out.println("\"A bottle of water.\"");
        }
    }

    class  Soda extends Drink {
        public Soda(String name) {
            super(name);
        }

        @Override
        public void type() {
            System.out.println("\"A bottle of soda.\"");
        }
    }

    class  Milk extends Drink {
        public Milk(String name) {
            super(name);
        }

        @Override
        public void type() {
            System.out.println("\"A bottle of milk.\"");
        }
    }

