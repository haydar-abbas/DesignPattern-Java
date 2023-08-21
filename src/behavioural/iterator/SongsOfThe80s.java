package behavioural.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class SongsOfThe80s implements SongIterator {
    SongInfo[] bestSongs;
    private int arrayValue;

    public SongsOfThe80s() {
        this.bestSongs = new SongInfo[3];
        this.arrayValue = 0;
        addSong("Roam", "B52s", 1989);
        addSong("Cruel Summer", "Bananarama", 1984);
        addSong("Head over heels", "Tears for Fears", 1985);
    }

    public void addSong(String songName, String bandName, int yearReleased) {
        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
        bestSongs[arrayValue++] = songInfo;
    }

    @Override
    public Iterator<SongInfo> createIterator() {
        return Arrays.asList(bestSongs).iterator();
    }
}
