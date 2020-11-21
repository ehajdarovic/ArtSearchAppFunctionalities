public class searchArtist {
    public static String searchArtistInfo(String artistName) {
        //portion of artist directory
        Artist[] Artists = new Artist[4];
        Artists[0] = new Artist("Vincent van Gogh","Dutch","March 30, 1853","July 29, 1890");
        Artists[1] = new Artist("Claude Monet","French","November 14, 1840","December 5, 1926");
        Artists[2] = new Artist("Frida Kahlo","Mexican","July 6, 1907","July 13, 1954");
        Artists[3] = new Artist("Gustav Klimt","Austrian","July 14, 1862","February 6, 1918");

        for(int i=0;i<Artists.length;i++){//look through object artists in hypothetical database
            if (artistName.equals(Artists[i].getArtist()))
                return Artists[i].getArtistInfo();
        }
        return "not found";//not found in the objects of artists
    }
}
