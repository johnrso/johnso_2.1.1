public class Song
{
    // fields
    
    private int rating;
    private String title;
    private double price;
    private boolean favorite;
    public static int numSongs;
    /**
     * Constructor for objects of class Song
     */
    public Song() {
        numSongs++;
        rating = 0;
        title = "";
        price = 0.0;
        favorite = false;
    }
    
    public Song(String title, double price) { //sets title and price
        numSongs++;
        this.title = title;
        this.price = price;
    }
    
    public Song(String title, double price, int rating) { //sets title, price, rating
        numSongs++;
        this.title = title;
        this.price = price;
        this.rating = rating;
    }
    //accessors and mutators for title
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String t) {
        title = t;
    }
    //accessors and mutators for rating
    public void setRating(int i) {
        rating = i;
    }
    
    public int getRating() {
        return rating;
    }
    //accessors and mutators for price
    public double getPrice(){ //gets price
        return price;
    }
    
    public void setPrice(double p){ //sets price
        price = p;
    }
    //accessors and mutators for favorite
    public void addToFavorites(){ //sets favorite to true
        favorite = true;
    }
    
    public void removeFromFavorites(){ //sets favorite to false
        favorite = false;
    }
}
