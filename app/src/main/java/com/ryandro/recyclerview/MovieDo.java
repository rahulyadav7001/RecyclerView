package com.ryandro.recyclerview;

import java.io.Serializable;

public class MovieDo implements Serializable {
    private int movieImage;
    private String movieName = "";
    private String movieRunTime = "";
    private String directorName = "";
    private String writerName = "";
    private String ReleaseDate = "";

    public MovieDo(int movieImage, String movieName, String movieRunTime, String directorName, String writerName, String releaseDate) {
        this.movieImage = movieImage;
        this.movieName = movieName;
        this.movieRunTime = movieRunTime;
        this.directorName = directorName;
        this.writerName = writerName;
        ReleaseDate = releaseDate;
    }

    public MovieDo() {

    }

    public int getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(int movieImage) {
        this.movieImage = movieImage;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public String getReleaseDate() {
        return ReleaseDate;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getmovieRunTime() {
        return movieRunTime;
    }

    public void setmovieRunTime(String movieRunTime) {
        this.movieRunTime = movieRunTime;
    }
}
