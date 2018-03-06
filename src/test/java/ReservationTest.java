import junit.extensions.TestSetup;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReservationTest {
    private Reservation reservation;
    @Before
    public void setup(){
        reservation = new Reservation();
    }
    @Test
    public void TestNewCat(){
        assertEquals(0, this.reservation.Animals.size());
        this.reservation.NewCat("Ms. Meow", Gender.Female, "Scratches couch");
        assertEquals(1, this.reservation.Animals.size());
    }
    @Test
    public void TestNewDog()
    {
        assertEquals(0, this.reservation.Animals.size());
        this.reservation.NewDog("Sgt. Woof", Gender.Male);
        assertEquals(1, this.reservation.Animals.size());
    }
}