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
        assertEquals("Sgt. Woof", this.dog.getName());
        assertEquals(Gender.Male, this.dog.getGender());
        assertNull(this.dog.getReservedBy());
        assertEquals(LocalDate.now().atStartOfDay(), this.dog.getLastWalk().atStartOfDay());
        assertFalse(this.dog.getNeedsWalk());
    }
    @Test
    public void testReservation()
    {
        assertNull(this.dog.getReservedBy());
        assertTrue(this.dog.Reserve("John Doe"));
        assertNotNull(this.dog.getReservedBy());
        assertEquals("John Doe", this.dog.getReservedBy().getName());
        assertFalse(this.dog.Reserve("Jane Doe"));
    }
}