package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor Earnest_Oldman;
    Visitor Nooby_Youngman;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        Earnest_Oldman = new Visitor(100, 160, 600.0);
        Nooby_Youngman = new Visitor(5, 100, 5.50);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void under16sCanEnter() {
        assertEquals(true, playground.isAllowedTo(Nooby_Youngman));
    }
    @Test
    public void over15sCannotEnter() {
        assertEquals(false, playground.isAllowedTo(Earnest_Oldman));
    }


}
