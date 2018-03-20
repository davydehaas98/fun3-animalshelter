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
        assertEquals("Ms. Meow", this.cat.getName());
        assertEquals(Gender.Female, this.cat.getGender());
        assertNull(this.cat.getReservedBy());
        assertEquals("Scratches couch", this.cat.getBadHabits());
    }
    @Test
    public void testReservation()
    {
        assertNull(this.cat.getReservedBy());
        assertTrue(this.cat.Reserve("John Doe"));
        assertNotNull(this.cat.getReservedBy());
        assertEquals("John Doe", this.cat.getReservedBy().getName());
        assertFalse(this.cat.Reserve("Jane Doe"));
    }
}