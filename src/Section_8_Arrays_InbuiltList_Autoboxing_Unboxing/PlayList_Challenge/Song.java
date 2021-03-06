package Section_8_Arrays_InbuiltList_Autoboxing_Unboxing.PlayList_Challenge;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String toString() {
        return title + ": " + duration;
    }

    public String getTitle() {
        return title;
    }
}
