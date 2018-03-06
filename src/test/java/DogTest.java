import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class DogTest {
    private Dog dog;
    @Before
    public void setup(){
        dog = new Dog("Sgt. Woof", Gender.Male);
    }
    @Test
    public void testConstructor(){
        assertEquals("Sgt. Woof", this.dog.Name);
        assertEquals(Gender.Male, this.dog.Gender);
        assertNull(this.dog.ReservedBy);
        assertEquals(LocalDate.now().atStartOfDay(), this.dog.LastWalk.atStartOfDay());
        assertFalse(this.dog.getNeedsWalk());
    }
    @Test
    public void testReservation()
    {
        assertNull(this.dog.ReservedBy);
        assertTrue(this.dog.Reserve("John Doe"));
        assertNotNull(this.dog.ReservedBy);
        assertEquals("John Doe", this.dog.ReservedBy.Name);
        assertFalse(this.dog.Reserve("Jane Doe"));
    }
}