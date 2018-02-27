public class Cat extends Animal{
    public String BadHabits;

    public String getBadHabits() {
        return BadHabits;
    }

    private void setBadHabits(String badHabits) {
        BadHabits = badHabits;
    }

    public Cat(String name, Gender gender, String badHabits) {
        super(name, gender);
        BadHabits = badHabits;
    }

    @Override
    public String toString() {
        return super.toString() + ", bad habits: " + BadHabits.toLowerCase();
    }
}
