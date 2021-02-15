package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;
import people.Visitor;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor Earnest_Oldman;
    Visitor Nooby_Youngman;
    Visitor Oldy_Shortman;
    Visitor Yung_Tallman;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        Earnest_Oldman = new Visitor(100, 160, 600.0);
        Nooby_Youngman = new Visitor(5, 100, 5.50);
        Oldy_Shortman = new Visitor(90, 100, 1000.0);
        Yung_Tallman = new Visitor(10, 200, 20.0);

    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void oldEnoughButTooShortCannotRide(){
        assertEquals(false, rollerCoaster.isAllowedTo(Oldy_Shortman));
    }

    @Test
    public void tallEnoughButTooYoungCannotRide(){
        assertEquals(false, rollerCoaster.isAllowedTo(Yung_Tallman));
    }
    @Test
    public void tallAndOldEnoughCanRide(){
        assertEquals(true, rollerCoaster.isAllowedTo(Earnest_Oldman));
    }

}
