import helpers.Menu;
import helpers.UserInputHandler;
import models.MovieLibrary;

import java.util.Scanner;

import static models.MenuOptions.*;

public class MovieLibraryApp {
    public static void main(String[] args) {
        MovieLibrary.fillMovieList();
        Menu.welcomeMessage();
        while (true) {
            Menu.printMenuOptions();

            switch (UserInputHandler.getMenuOptionFromUser()) {
                case DISPLAYINFORMATIONABOUTRANDOMMOVIE:
                    System.out.println("Wylosowałeś film: ");
                    MovieLibrary.getRandomMovieInformation();
                    break;
                case DISPLAYACTORFROMMOVIE:
                    MovieLibrary.printActorFilmography();
                    break;
                case EXITAPPLICATION:
                    System.out.println("Zamykanie aplikacji");
                    System.exit(1);
                default:
                    System.out.println("Wybrałeś niepoprawny numer!");
            }
        }
    }
}