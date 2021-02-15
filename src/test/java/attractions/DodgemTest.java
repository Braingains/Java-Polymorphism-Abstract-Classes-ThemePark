package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor Hugh_Tallman;
    Visitor Mousey_Smallman;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        Hugh_Tallman = new Visitor(20, 201, 100.0);
        Mousey_Smallman = new Visitor(30, 120, 150.0);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(4.50, dodgems.defaultPrice(), 0.01);
    }
    @Test
    public void normalPeoplePayDefaultPrice() {
        assertEquals(4.50, dodgems.priceFor(Mousey_Smallman), 0.01);
    }
    @Test
    public void tallPeopleAreDiscriminatedAgainst() {
        assertEquals(9.00, dodgems.priceFor(Hugh_Tallman), 0.01);
    }

}
