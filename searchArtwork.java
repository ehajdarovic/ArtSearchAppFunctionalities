public class searchArtwork {
    public static String searchArtworkInfo(String artistName) {
        //portion of artwork directory
        Artwork[] Artworks = new Artwork[4];
        Artworks[0] = new Artwork("The Starry Night","Vincent van Gogh","June 1889","MoMA, NYC");
        Artworks[1] = new Artwork("Impression, Sunrise","Claude Monet","1872","Musée Marmottan Monet, France");
        Artworks[2] = new Artwork("The Two Fridas","Frida Kahlo","1939","Museo de Arte Moderno, Mexico City");
        Artworks[3] = new Artwork("The Kiss","Gustav Klimt","1908","Austrian Gallery Belvedere, Austria");

        for(int i=0;i<Artworks.length;i++){
            if (artistName.equals(Artworks[i].getArtwork()))
                return Artworks[i].getArtworkInfo();
        }
        return "not found";
    }
}
