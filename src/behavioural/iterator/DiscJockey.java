package behavioural.iterator;

import java.util.Iterator;

public class DiscJockey {

    SongIterator iterator70sSongs;
    SongIterator iterator80sSongs;
    SongIterator iterator90sSongs;

    public DiscJockey(SongIterator songsOfThe70s, SongIterator songsOfThe80s, SongIterator songsOfThe90s) {
        this.iterator70sSongs = songsOfThe70s;
        this.iterator80sSongs = songsOfThe80s;
        this.iterator90sSongs = songsOfThe90s;
    }

    public void showTheSongs() {
        Iterator<SongInfo> songs70s = iterator70sSongs.createIterator();
        Iterator<SongInfo> songs80s = iterator80sSongs.createIterator();
        Iterator<SongInfo> songs90s = iterator90sSongs.createIterator();

        System.out.println("\nSongs of the 70s");
        printTheSongs(songs70s);
        System.out.println("\nSongs of the 80s");
        printTheSongs(songs80s);
        System.out.println("\nSongs of the 90s");
        printTheSongs(songs90s);
    }

    public void printTheSongs(Iterator<SongInfo> iterator) {
        while (iterator.hasNext()) {
            SongInfo songInfo = iterator.next();
            System.out.print(songInfo.getSongName() + " - ");
            System.out.print(songInfo.getBandName() + " - ");
            System.out.println(songInfo.getYearReleased());
        }
    }

}
