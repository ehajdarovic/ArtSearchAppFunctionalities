public class Artwork {
    public String artwork;//name of artwork
    private String artist;//name of artist
    private String date;//date done
    private String MuseumDisplayed;

    public Artwork(String artwork,String artist,String date,String MuseumDisplayed) {
        this.artwork = artwork;
        this.artist=artist;
        this.date=date;
        this.MuseumDisplayed=MuseumDisplayed;
    }

    public String getArtwork() {
        return artwork;
    }

    public String getArtworkInfo() {
        return "Artist: "+artist+"\nDate Done: "+date+"\nMuseum Displayed at: "+MuseumDisplayed;
    }

}
