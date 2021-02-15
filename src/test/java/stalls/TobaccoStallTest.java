package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor Earnest_Oldman;
    Visitor Nooby_Youngman;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 5);
        Earnest_Oldman = new Visitor(100, 160, 600.0);
        Nooby_Youngman = new Visitor(5, 100, 5.50);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void under18sCannotBuyCigarettes() {
        assertEquals(false, tobaccoStall.isAllowedTo(Nooby_Youngman));
    }
    @Test
    public void over18sCanBuyCigarettes() {
        assertEquals(true, tobaccoStall.isAllowedTo(Earnest_Oldman));
    }
    @Test
    public void hasRating() {
        assertEquals(5, tobaccoStall.getRating());
    }
}
