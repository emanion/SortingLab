package common;

import java.time.LocalDate;
import java.util.Objects;


public class Song implements Comparable<Song> {
    
    private String title;
    private String artist;
    private LocalDate releaseDate;
    private double runtime;

    public Song(String title, String artist, LocalDate releaseDate, double runtime) {
        this.title = title;
        this.artist = artist;
        this.releaseDate = releaseDate;
        this.runtime = runtime;
    }

    public Song() {
    }

    
    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getRuntime() {
        return runtime;
    }

    public void setRuntime(double runtime) {
        this.runtime = runtime;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.title);
        hash = 29 * hash + Objects.hashCode(this.artist);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Song other = (Song) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.artist, other.artist)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Song{" + "title=" + title + ", artist=" + artist + 
                ", releaseDate=" + releaseDate + ", runtime=" + runtime + '}';
    }

    @Override
    public int compareTo(Song song) {
        
        final int BEFORE = 1;
	final int EQUAL = 0;
	final int AFTER = -1;
        
        //Use the String method compareTo for both title and artist.
        int titleCompareToValue = 
                getTitle().compareToIgnoreCase(song.getTitle());
        int artistCompareToValue = 
                getArtist().compareToIgnoreCase(song.getArtist());
        
        
        if (titleCompareToValue == 0)
            return artistCompareToValue;
        else
            return titleCompareToValue;
        
        
    }
}

    
    
  
