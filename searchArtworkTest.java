import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class searchArtworkTest {

    @Test
    void searchArtworkInfo() {
        Artwork artwork1=new Artwork("The Starry Night","Vincent van Gogh","June 1889","MoMA, NYC");
        assertEquals("Artist: Vincent van Gogh\n" + "Date Done: June 1889\n"+ "Museum Displayed at: MoMA, NYC",artwork1.getArtworkInfo());
    }
}
