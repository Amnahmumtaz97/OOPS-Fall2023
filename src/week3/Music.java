package week3;

public class Music {
    private String title;
    private String duration;
    private String genre;
    private Date releaseDate;
    private Singer singer;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }
    public Music(String title,String duration,String genre,Date releaseDate,Singer singer){
        this.title=title;
        this.duration=duration;
        this.genre=genre;
        this.releaseDate=releaseDate;
        this.singer=singer;
    }
    public String toString() {
        return String.format("Title: %s\nDuration: %s\nGenre: %s\nRelease Date: %s\nSinger: %s",
                this.title, this.duration, this.genre, this.releaseDate, this.singer);
    }
    public boolean equals(Music m1) {
        if (this.title == m1.title)
            return true;
        else
            return false;}

//    public String toString(){
//        return String.format("%s/%s/%s/%s/%s",this.title,this.duration,this.genre,this.releaseDate,this.singer);
//    }

}
