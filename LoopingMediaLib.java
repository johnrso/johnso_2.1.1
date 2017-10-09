public class LoopingMediaLib
{
    public static void main(){

    for (int i = 0; i <=7; i++){
        System.out.println(MediaFile.readString() + "\n");
    }
    
    String songInfo = "";
    for (int i = 1; i <= Song.numSongs; i++) {
        songInfo = MediaFile.readString();
        String songTitle = songInfo.substring(0,songInfo.indexOf("|"));
        String songRating = songInfo.substring(songInfo.indexOf("|")+1);
        System.out.println("Title: " + songTitle);
        System.out.println("Rating: " + songRating);
    }

    System.out.println(MediaFile.readString());
    for (int i = 1; i <=Song.numSongs; i++) {
        String curr_file = MediaFile.readString();
        System.out.println(curr_file.substring(curr_file.indexOf("|") + 1));
    }

    songInfo = "";
    while(songInfo != null){
        songInfo = MediaFile.readString();
        System.out.println(songInfo);
    }


}
}


