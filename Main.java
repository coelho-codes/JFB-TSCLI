import java.util.Scanner;
import java.util.Locale;

class Main {
    public static void main(String args[]) {
        Main main = new Main();
        String input;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("\033[H\033[2J"); //Clears the console
        System.out.println("Welcome to The Sims in CLI!");
        System.out.println("To start the game press 's' on your keyboard. To see the menu for help and informations press 'm'. To quit press 'q'.");

        for(;;) { //Sets the initial loop for user interactions
            input = scanner.nextLine();

            if(input.equals("q")) {
                break;
            } else if(input.equals("s")) {
                main.game(main, scanner);
            } else if(input.equals("m")) {
                main.menu(scanner, main); //If the user selects q(to quit) in the menu method, they will return to this 'for loop' inside main method(!)
            } else {
                System.out.println("Wrong option... Please provide a valid input.");
            }
        }   
    }

    public void game(Main main, Scanner scanner) {
        System.out.println("\nStarting game.");

        String loading = "loading";
        //Simulates a loading screen
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                loading += ".";
                System.out.print("\r" + loading);
                try {
                    Thread.sleep(800);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            loading = "loading";
        }

        System.out.println();
        System.out.println();

        Character character = main.create(scanner); //main.create() returns a character(with it's attributes)

        //Simulates a loading screen
        String initializing = "Initializing world";
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                initializing += ".";
                System.out.print("\r" + initializing);
                try {
                    Thread.sleep(1200);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            initializing = "Initializing world";
        }

        System.out.println("\nWorld successfully created!");
        System.out.println("You may now interact with the world... Happy gaming!"); //Stop point so far
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

            if(menuInput.equals("q")) { //this is ugly as hell at the moment I KNOW :(
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
                main.game(main, scanner);
            } else {
                System.out.println("Wrong option... Please provide a valid input.");
            }
        }
    }

    //Simplistic version of this method
    public Character create(Scanner scanner) {
        String name;
        int age;
        String gender; //male or female
        double height; //in feet
        double weight; //in pounds
        String skinColor; //white, brown or black(for the sake of simplicity)
        String eyesColor; //blue, brown, green(for the same reason)
        String hairSize; //big(reaching shoulders or below), medium(above the shoulders or short) and short(short or bald)

        System.out.println("Start by creating your character!");

        for(;;) {
            System.out.println("\nYour character's full name: ");
            name = scanner.nextLine();

            System.out.println("\nAge: ");
            age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("\nGender[Male of female]: ");
            gender = scanner.nextLine();

            System.out.println("\nHeight: ");
            height = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("\nWeight: ");
            weight = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("\nSkin color[White, brown or black]: ");
            skinColor = scanner.nextLine();

            System.out.println("\nEyes color[Blue, brown or green]: ");
            eyesColor = scanner.nextLine();

            System.out.println("\nHair size[Big, medium or short]: ");
            hairSize = scanner.nextLine();
            
            break;
        }

        Character character = new Character(name, age, gender, height, weight, skinColor, eyesColor, hairSize);

        System.out.println("\033[H\033[2J");
        System.out.println("Your character was successfully created!!");
        System.out.println();

        return character;
    }
}