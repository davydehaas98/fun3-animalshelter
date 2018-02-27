import java.util.ArrayList;

public class Reservation {
    public ArrayList<Animal> Animals = new ArrayList<Animal>();

    public ArrayList<Animal> getAnimals() {
        return Animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        Animals = animals;
    }

    public void NewCat(String name, Gender gender, String badHabits){
        Animals.add(new Cat(name, gender, badHabits));
    }
    public void NewDog(String name, Gender gender){
        Animals.add(new Dog(name, gender));
    }
}
