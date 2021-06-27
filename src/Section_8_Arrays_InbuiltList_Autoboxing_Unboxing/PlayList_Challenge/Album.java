package Section_8_Arrays_InbuiltList_Autoboxing_Unboxing.PlayList_Challenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<Song>();
    }

    public boolean addToPlayList(int numberOfSong, LinkedList<Song> playlist) {
        if (0 < numberOfSong && songs.size() >= numberOfSong) {
            playlist.add(songs.get(numberOfSong-1));
            return true;
        } else {
            return false;
        }
    }

    public boolean addToPlayList(String titleOfSong, LinkedList<Song> playlist) {
        for (Song song : songs) {
            if (song.getTitle().equals(titleOfSong)) {
                playlist.add(song);
                return true;
            }
        }
        return false;
    }

    public boolean addSong(String titleOfSong, double duration) {
        if (songs.contains(findSong(titleOfSong)))
            return false;
        else {
            songs.add(new Song(titleOfSong,duration));
            return true;
        }
    }

    private Song findSong(String titleOfSong) {
        for (Song song : songs) {
            if(song.getTitle().equals(titleOfSong))
                return song;
        }
        return null;
    }
}
