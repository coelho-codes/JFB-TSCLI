import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        String input;
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome to The Sims in CLI!");
        System.out.println("To start the game press 's' on your keyboard. To see the menu for help press 'm'. To quit press 'q'.");

        for(;;) {
            input = scanner.nextLine();

            if(input.equals("q")) {
                break;
            } else if(input.equals("s")) {
                main.game();
            } else if(input.equals("m")) {
                main.menu();
            } else {
                System.out.println("Wrong option... Please provide a valid input.");
            }
        }   
    }

    public void game() {
        //This will be where the game is.
    }

    public void menu() {
        //This will be where the menu is.
    }
}