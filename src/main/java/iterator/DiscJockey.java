package iterator;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class DiscJockey {

    SongIterator iter70sSongs;
    SongIterator iter80sSongs;
    SongIterator iter90sSongs;

    public DiscJockey(SongIterator songs70s, SongIterator songs80s, SongIterator songs90s) {
        iter70sSongs = songs70s;
        iter80sSongs = songs80s;
        iter90sSongs = songs90s;
    }
    /*
    public void showTheSongs() {

        ArrayList aL70sSongs = songs70s.getBestSongs();

        System.out.println("Songs of the 70s\n");

        for (int i = 0; i < aL70sSongs.size(); i++) {

            SongInfo bestSongs = (SongInfo) aL70sSongs.get(i);

            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased());

        }

        SongInfo[] aL80sSongs = songs80s.getBestSongs();

        System.out.println("Songs of the 80s\n");

        for (int i = 0; i < aL80sSongs.length; i++) {

            SongInfo bestSongs = aL80sSongs[i];

            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased());

        }

        Hashtable<Integer, SongInfo> ht90sSongs = songs90s.getBestSongs();

        System.out.println("Songs of the 90s\n");

        for (Enumeration<Integer> e = ht90sSongs.keys(); e.hasMoreElements();) {

            SongInfo bestSongs = ht90sSongs.get(e.nextElement());

            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased());
        }

    }
     */
    public void showTheSongs() {

        Iterator songs70s = iter70sSongs.createIterator();
        Iterator songs80s = iter80sSongs.createIterator();
        Iterator songs90s = iter90sSongs.createIterator();

        System.out.println("Songs of the 70s\n");
        printTheSongs(songs70s);

        System.out.println("Songs of the 80s\n");
        printTheSongs(songs80s);

        System.out.println("Songs of the 90s\n");
        printTheSongs(songs90s);

    }

    public void printTheSongs(Iterator iterator) {

        while (iterator.hasNext()) {

            SongInfo songInfo = (SongInfo) iterator.next();

            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getBandName());
            System.out.println(songInfo.getYearReleased());

        }

    }

}
