import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {
    private Cat cat;
    @Before
    public void setup(){
        cat = new Cat("Ms. Meow", Gender.Female, "Scratches couch");
    }
    @Test
    public void testConstructor(){
        assertEquals("Ms. Meow", this.cat.Name);
        assertEquals(Gender.Female, this.cat.Gender);
        assertNull(this.cat.ReservedBy);
        assertEquals("Scratches couch", this.cat.BadHabits);
    }
    @Test
    public void testReservation()
    {
        assertNull(this.cat.ReservedBy);
        assertTrue(this.cat.Reserve("John Doe"));
        assertNotNull(this.cat.ReservedBy);
        assertEquals("John Doe", this.cat.ReservedBy.Name);
        assertFalse(this.cat.Reserve("Jane Doe"));
    }
}