import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark LisneyDand;
    RollerCoaster rollerCoaster;
    Visitor Earnest_Oldman;

    @Before
    public void before() throws Exception {
        LisneyDand = new ThemePark("LisneyDand");
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        Earnest_Oldman = new Visitor(100, 160, 600.0);
    }

    @Test
    public void getName() {
        assertEquals("LisneyDand", LisneyDand.getName());
    }

    @Test
    public void canAddToReviewed() {
        LisneyDand.AddToReviewed(rollerCoaster);
        assertEquals(1, LisneyDand.getAllReviewed().size());
    }

    @Test
    public void canVisit() {
        LisneyDand.visit(Earnest_Oldman, rollerCoaster);
        assertEquals(1, Earnest_Oldman.getVisitedAttractions().size());
        assertEquals(1, rollerCoaster.getVisitCount());
    }

}
