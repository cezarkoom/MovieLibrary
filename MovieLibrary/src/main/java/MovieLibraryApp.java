import helpers.Menu;

import java.util.Scanner;

public class MovieLibraryApp {
    public static void main(String[] args) {
        Menu.welcomeMessage();
        while (true) {
            Menu.printMenuOptions();
            Scanner scan = new Scanner(System.in);
            int userOption = scan.nextInt();

            switch (userOption) {
                case 1:
                    System.out.println("Top Gun\n\n");
                    // TODO Uzupełnić opcję 1
                    break;
                case 2:
                    System.out.println("Mission Impossible\n\n");
                    // TODO Uzupełnić opcję 2
                    break;
                case 3:
                    System.out.printf("Zamykanie aplikacji");
                    System.exit(1);
                default:
                    System.out.println("Wybrałeś niepoprawny numer!");
            }
        }
    }
}