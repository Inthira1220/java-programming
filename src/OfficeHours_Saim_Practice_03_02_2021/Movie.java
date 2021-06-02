package OfficeHours_Saim_Practice_03_02_2021;

public class Movie {
    public static void main(String[] args){
        String name = "Harry Potter";
        String genre = "Kids show";
        String duration = "1:00-3:00PM EST";
        char rating = 'G';
        char isASequelsOrNot = 'N';
        String rottenTomatoesRating = "99 out of 100";
        char isOnDvd = 'N';
        System.out.println("------ Welcome to the Cinema ------");
        System.out.println("Tonight we are streaming \""+ name + "\" which was released on \""+ genre+ ".");
        System.out.println("This genre movie got a rottenTomatoesRating rating on Rotten Tomatoes.");
        System.out.println("- Rating:/t" + rating);
        System.out.println("Time:/t "+ duration);
        System.out.println("Dont wait, the rate is" + rottenTomatoesRating) ;
        System.out.println("DVD: "+ isOnDvd);
        System.out.println("-----Dont be miss it and hope to see you guys-----");
                        //The rating is $rating and it runs for $duration hours.
       // This is a sequel $isSequel and is on dvd $isOnDvd.);
    }
}
/*
 - Each the datatype you feel is most appropriate for each variable.

    - Create the following variables:
        name, genre, duration, release date, rating(G, PG, R, etc..),
        is a sequels or not, rotten tomatoes rating (out of 100), is on dvd.

    - Print out the Movie information using concatenations and print statements

    ------ Welcome to the Cinema ------

    Tonight we are streaming "$movieName" which was released on $releaseDate
    This $genre movie got a $rottenTomatoesRating rating on Rotten Tomatoes.
    The rating is $rating and it runs for $duration hours.
    This is a sequel $isSequel and is on dvd $isOnDvd.
 */