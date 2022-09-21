import java.util.*;
public class ComparablePractice
{
   public static void main(String[] args)
   {
   
      List<Movie> movieList=new ArrayList<Movie>();
      movieList.add(new Movie("Force Awakens", 8.3, 2015));
      movieList.add(new Movie("Star Wars", 8.7, 1977));
      movieList.add(new Movie("Empire Strikes Back", 8.8, 1980));
      movieList.add(new Movie("Return of the Jedi", 8.4, 1983)); 
       Collections.sort(movieList);
 
        System.out.println("Movies after sorting : ");
        for (Movie movie: movieList)
        {
            System.out.println(movie.getName() + " " +
                               movie.getRating() + " " +
                               movie.getYear());  
   }

}
}

class Movie implements Comparable<Movie>
{
   private double rating;
   private String name;
   private int year;

   public Movie(String name, double rating,  int year)
   {
      this.rating=rating;
      this.name=name;
      this.year=year;
   
   } 
   
   public double getRating() { 
      return rating; }
   public String getName()   {  
      return name; }
   public int getYear()      {  
      return year;  }
    
   @Override
    public int compareTo(Movie m)
   {
      return this.name.compareTo(m.name);
   }



}