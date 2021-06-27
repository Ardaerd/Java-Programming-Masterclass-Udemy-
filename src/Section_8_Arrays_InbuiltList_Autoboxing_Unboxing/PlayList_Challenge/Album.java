package Section_8_Arrays_InbuiltList_Autoboxing_Unboxing.PlayList_Challenge;

import java.util.ArrayList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<Song>();
    }

    public boolean addSong(String titleOfSong, double duration) {
        if (songs.contains(findSong(titleOfSong)))
            return false;
        else {
            songs.add(new Song(titleOfSong,duration));
            return true;
        }
    }

    public Song findSong(String titleOfSong) {
        for (Song song : songs) {
            if(song.getTitle().equals(titleOfSong))
                return song;
        }
        return null;
    }
}
