package behavioural.iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class SongsOfThe90s implements SongIterator {
    Hashtable<Integer, SongInfo> bestSongs;
    private int hasKey = 0;

    public SongsOfThe90s() {
        this.bestSongs = new Hashtable<>();
        addSong("Losing My Religion", "REM", 1991);
        addSong("Creep", "Radiohead", 1993);
        addSong("Walk on the ocean", "Toad the wet sprocket", 1991);
    }

    public void addSong(String songName, String bandName, int yearReleased) {
        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
        bestSongs.put(hasKey, songInfo);
        hasKey++;
    }

    @Override
    public Iterator<SongInfo> createIterator() {
        return bestSongs.values().iterator();
    }
}
