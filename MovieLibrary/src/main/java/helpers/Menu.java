package helpers;

public class Menu {
    public static void welcomeMessage(){
        System.out.println("Witaj w aplikacji MovieLibrary!");
    }
    public static void printMenuOptions(){
        System.out.println("Co chcesz zrobić?");
        System.out.println("1. Przeczytaj szczegóły losowego filmu");
        System.out.println("2. Wyświetl filmy z wybranym aktorem");
        System.out.println("3. Zamknij aplikację");
    }
}
