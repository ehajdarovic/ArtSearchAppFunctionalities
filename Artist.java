public class Artist {
    public String artist;//name
    private String nationality;
    private String birthDate;
    private String deathDate;

    public Artist(String artist,String nationality,String birthDate,String deathDate) {
        this.artist = artist;
        this.nationality = nationality;
        this.birthDate=birthDate;
        this.deathDate=deathDate;
    }

    public String getArtist() {
        return artist;
    }

    public String getArtistInfo() {
        return "Nationality: "+nationality+"\nBirth Date: "+birthDate+"\nDeath Date: "+deathDate;
    }

}

