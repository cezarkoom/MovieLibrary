package models;

import helpers.RandomDataProvider;

import java.util.LinkedList;
import java.util.List;

public class MovieLibrary {
    private static List<Movie> moviesLibrary;

    public static void fillMovieList(){
        moviesLibrary = new LinkedList<>();
        //Directors
        Director r_Scott = new Director("Ridel", "Scott");
        Director g_Verbinski = new Director("Gore","Verbinski");
        Director q_Tarantino = new Director("Quentin","Tarantino");
        Director p_Jackson = new Director("Peter","Jackson");
        //Actors
        Actor r_Crowe = new Actor("Russel", "Crowe");
        Actor o_Reed = new Actor("Oliver", "Reed");
        Actor d_Jacob = new Actor("Derek", "Jacob");
        Actor j_Deep = new Actor("Johnny", "Deep");
        Actor o_Bloom = new Actor("Orlando", "Bloom");
        Actor k_Knightley = new Actor("Keira", "Knightley");
        Actor j_Travolta = new Actor("John", "Travolta");
        Actor u_Thurman = new Actor("Uma", "Thurman");
        Actor h_Keitel = new Actor("Harvey", "Keitel");
        Actor t_Cruze = new Actor("Tom", "Cruise");

        moviesLibrary.add(new Movie("Gladiator",r_Scott,List.of(r_Crowe,o_Reed)));
        moviesLibrary.add(new Movie("Pirates of the Caribbean",g_Verbinski, List.of(o_Reed, j_Deep)));
        moviesLibrary.add(new Movie("Pulp Fiction",q_Tarantino, List.of(j_Travolta, u_Thurman)));
        moviesLibrary.add(new Movie("Hobbit - An Unexpected Jorney",r_Scott, List.of(k_Knightley, d_Jacob)));
        moviesLibrary.add(new Movie("Poranek Kojota",p_Jackson, List.of(r_Crowe, o_Bloom)));
        moviesLibrary.add(new Movie("Transformers",q_Tarantino, List.of(r_Crowe, d_Jacob)));
        moviesLibrary.add(new Movie("Top Gun",r_Scott, List.of(r_Crowe, t_Cruze)));
        moviesLibrary.add(new Movie("Desperado",r_Scott, List.of(r_Crowe, o_Bloom)));
        moviesLibrary.add(new Movie("Mission Impossible",p_Jackson, List.of(r_Crowe, t_Cruze)));
        moviesLibrary.add(new Movie("Forest Gump",g_Verbinski, List.of(o_Reed, h_Keitel)));
    }
    public static List<Movie> getMoviesLibrary() {
        return moviesLibrary;
    }
    public static void getRandomMovieInformation(){
        System.out.println(moviesLibrary.get(RandomDataProvider.getRandomMovieIndex()));
    }

}
