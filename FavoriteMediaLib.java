public class FavoriteMediaLib {
    public static void main(){
        int favoriteSongRating = 8;
        for (int i = 1; i <=Song.numSongs; i++) {
            String curr_file = MediaFile.readString();
            int split = curr_file.indexOf("|", 1);
            String curr_name = curr_file.substring(1, split);
            String curr_rating = curr_file.substring(split + 1);
            if (Integer.valueOf(curr_rating) > favoriteSongRating) {
               System.out.println(curr_name + "(" + curr_rating + ")");
            }
        }
    }
}