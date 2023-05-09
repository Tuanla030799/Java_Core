public class Main {
    public static void main(String[] args) {
//        Movie theMovie = new Aventure("Star Wars");
        Movie theMovie = Movie.geMovie("Science", "Star Wars");
        theMovie.watchMovie();
    }
}