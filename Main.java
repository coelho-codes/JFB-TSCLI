import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Main main = new Main();
        String input;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome to The Sims in CLI!");
        System.out.println("To start the game press 's' on your keyboard. To see the menu for help and informations press 'm'. To quit press 'q'.");

        for(;;) { //Sets the initial loop for user interactions
            input = scanner.nextLine();

            if(input.equals("q")) {
                break;
            } else if(input.equals("s")) {
                main.game(main);
            } else if(input.equals("m")) {
                main.menu(scanner, main); //If the user selects q(to quit) in the menu method, they will return to this 'for loop' inside main method(!)
            } else {
                System.out.println("Wrong option... Please provide a valid input.");
            }
        }   
    }

    public void game(Main main) {
        System.out.println("\nStarting game.");
        String loading = "loading";
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                loading += ".";
                System.out.print("\r" + loading);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            loading = "loading";
        }
        System.out.println();
        main.create(); //Returns a character(with it's attributes)
    }

    public void menu(Scanner scanner, Main main) {
        String menuInput;

        System.out.println("\n===========================================================================================================================================================================");
        System.out.println("The Sims in CLI(as I'm calling it) is a simulation of the game The Sims, but in CLI environment.");
        System.out.println("The idea and purpose behind the project is to train with the Java language, getting accustomed to the language's syntax and logic.");
        System.out.println("Because of the nature of The Sims, I thought it would be natural to make the analogy between Java's classes and objects and The Sims's characters and objects themselves.");
        System.out.println("\nSelect from the menu below what would you like to know about the game: ");
        System.out.println("A- How the game works | B- Characters | C- Objects | D- Needs | E- Actions | Q- To quit | S- To start the game");

        for(;;) {
            menuInput = scanner.nextLine();

            if(menuInput.equals("q")) { //this is ugly as hell at the moment :(
                break;
            } else if(menuInput.equals("a")) {
                System.out.println("the game works like this...");
            } else if(menuInput.equals("b")) {
                System.out.println("the characters works like this");
            } else if(menuInput.equals("c")) {
                System.out.println("the objects work like this");
            } else if(menuInput.equals("d")) {
                System.out.println("the needs work like this");
            } else if(menuInput.equals("e")) {
                System.out.println("the actions work like this");
            } else if(menuInput.equals("s")) {
                main.game(main);
            } else {
                System.out.println("Wrong option... Please provide a valid input.");
            }
        }
    }

    public Character create() {
        String name;
        int age;
        String gender; //male or female
        double height; //in feet
        double weight; //in pounds
        String skinColor; //white, brown or black(for the sake of simplicity)
        String eyesColor; //blue, brown, green
        String hairSize; //big(reaching shoulders or below), medium(above the shoulders or short) and short(short to bald)

        System.out.println("this is inside the create method");
    }
}