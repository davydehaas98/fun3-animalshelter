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
        assertEquals("Ugly Duckling", this.animal.getName());
        assertEquals(Gender.Male, this.animal.getGender());
        assertNull(this.animal.getReservedBy());
    }
    @Test
    public void testReservation()
    {
        assertNull(this.animal.getReservedBy());
        assertTrue(this.animal.Reserve("John Doe"));
        assertNotNull(this.animal.getReservedBy());
        assertEquals("John Doe", this.animal.getReservedBy().getName());
        assertFalse(this.animal.Reserve("Jane Doe"));
    }
}