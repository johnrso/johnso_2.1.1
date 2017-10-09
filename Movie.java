public class Movie
{
    // fields
    
    private int rating;
    private String title;
    private int duration;
    /**
     * Constructor for objects of class Song
     */
    public Movie() {
        rating = 0;
        title = "";
        
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String t) {
        title = t;
    }
    
    public void setRating(int i) {
        rating = i;
    }
    
    public int getRating() {
        return rating;
    }
    
    public void setDuration(int d){
        duration = d;
    }
    
    public int getDuration(){
        return duration;
    }
    
    public void displayDuration(){
        System.out.print((duration / 60) + " hours and ");
        System.out.println((duration % 60) + " minutes");
    }
}
