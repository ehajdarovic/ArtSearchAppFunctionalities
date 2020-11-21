import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class searchArtistTest {

    @Test
    void searchArtistInfo() {
        Artist artist1=new Artist("Vincent van Gogh","Dutch","March 30, 1853","July 29, 1890");
        assertEquals("Nationality: Dutch\n"+"Birth Date: March 30, 1853\n" + "Death Date: July 29, 1890",artist1.getArtistInfo());
    }
}
