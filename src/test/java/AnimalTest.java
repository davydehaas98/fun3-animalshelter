import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
    private Animal animal;
    @Before
    public void setup() {
        animal = new Animal("Ugly Duckling", Gender.Male);
    }
    @Test
    public void testConstructor()
    {
        assertEquals("Ugly Duckling", this.animal.Name);
        assertEquals(Gender.Male, this.animal.Gender);
        assertNull(this.animal.ReservedBy);
    }
    @Test
    public void testReservation()
    {
        assertNull(this.animal.ReservedBy);
        assertTrue(this.animal.Reserve("John Doe"));
        assertNotNull(this.animal.ReservedBy);
        assertEquals("John Doe", this.animal.ReservedBy.Name);
        assertFalse(this.animal.Reserve("Jane Doe"));
    }
}