package helpers;

import models.Actor;
import models.MenuOptions;

import java.util.Scanner;

public class UserInputHandler {
    static Scanner scan = new Scanner(System.in);

    public static MenuOptions getMenuOptionFromUser(){
        return MenuOptions.values()[getSelectedOptionFromUser() - 1];
    }
    private static int getSelectedOptionFromUser(){
        int result = getIntegerFromUser();
        scan.nextLine();
        if(result > 0 && result<MenuOptions.values().length + 1){
            return result;
        }
        else{
            System.out.println("Wybrałęś nieistniejącą opcję " + result);
            System.out.println("Spróbuj jeszcze raz");
            return getSelectedOptionFromUser();
        }
    }

    private static int getIntegerFromUser() {
        while(!scan.hasNextInt()){
            scan.nextLine();
            System.out.println("It is not Integer try again");
        }
        return scan.nextInt();
    }
    public static Actor getActorFromUser(){
        System.out.println("Podaj imię i nazwisko aktora :");
        String[] actors = scan.nextLine().split(" ");
        return new Actor(actors[0], actors[1]);
    }
}
