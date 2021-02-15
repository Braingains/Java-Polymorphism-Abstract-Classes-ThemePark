import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark LisneyDand;

    @Before
    public void before() throws Exception {
        LisneyDand = new ThemePark("LisneyDand");
    }

    @Test
    public void getName() {
        assertEquals("LisneyDand", LisneyDand.getName());
    }

}
