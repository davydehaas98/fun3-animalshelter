import java.time.Duration;
import java.time.LocalDate;

public class Dog extends Animal {
    public LocalDate LastWalk;

    public LocalDate getLastWalk() {
        return LastWalk;
    }

    private void setLastWalk(LocalDate lastWalk) {
        LastWalk = lastWalk;
    }

    public boolean getNeedsWalk() {
        return Math.abs(Duration.between(LocalDate.now(), LastWalk).toDays()) > 0;
    }

    public Dog(String name, Gender gender) {
        super(name, gender);
        LastWalk = LocalDate.now();
    }

    @Override
    public String toString() {
        return super.toString() + ", last walk: " + LastWalk;
    }
}
