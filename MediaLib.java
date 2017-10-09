/**
 * Write a description of class MediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MediaLib
{
    public static void main () {
        Song.numSongs = 0;
        System.out.println("Welcome to your media library");
        Song song1 = new Song();
        Movie movie1 = new Movie();
        Book book1 = new Book();
        song1.setTitle("Symphony No. 5");
        song1.setPrice(5.00);
        System.out.println(song1.getTitle());
        book1.setTitle("Common Sense");
        System.out.println(book1.getTitle());
        movie1.setTitle("Dunkirk");
        System.out.println(movie1.getTitle());
        System.out.println(song1.getPrice());
        Song song2 = new Song("Song2", 2.2, 5);
        Song song3 = new Song("Song3", 2.3, 6);
        Song song4 = new Song("Song4", 2.4, 7);
        Song song5 = new Song("Song5", 2.5, 8);
        Song song6 = new Song("Song6", 2.6, 9);
        Song song7 = new Song("Song7", 2.7, 10);
        //double averageCost = (Song.getTotalCost() / Song.getTotalSongs());
        //System.out.println(averageCost);
        //double averageRating = ((double)Song.getTotalRating() / Song.getTotalSongs());
        //System.out.println(averageRating);
        String songOutput = song1.getTitle() + "|" + song1.getRating() + "\n";        
        MediaFile.writeString(songOutput);
        songOutput = song2.getTitle() + "|" + song2.getRating() + "\n";        
        MediaFile.writeString(songOutput);
        songOutput = song3.getTitle() + "|" + song3.getRating() + "\n";        
        MediaFile.writeString(songOutput);
        songOutput = song4.getTitle() + "|" + song4.getRating() + "\n";        
        MediaFile.writeString(songOutput);
        songOutput = song5.getTitle() + "|" + song5.getRating() + "\n";        
        MediaFile.writeString(songOutput);
        songOutput = song6.getTitle() + "|" + song6.getRating() + "\n";        
        MediaFile.writeString(songOutput);
        songOutput = song7.getTitle() + "|" + song7.getRating() + "\n";        
        MediaFile.writeString(songOutput);
        MediaFile.saveAndClose();
    }
}
