package behavioural.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class SongsOfThe70s implements SongIterator {
    ArrayList<SongInfo> bestSongs;

    public SongsOfThe70s() {
        this.bestSongs = new ArrayList<>();
        addSong("Imaging", "John Lennon", 1971);
        addSong("American Pie", "Don McLean", 1971);
        addSong("I will survive", "Gloria Gaynor", 1979);
    }

    public void addSong(String songName, String bandName, int yearReleased) {
        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
        bestSongs.add(songInfo);
    }

    @Override
    public Iterator<SongInfo> createIterator() {
        return bestSongs.iterator();
    }

}
