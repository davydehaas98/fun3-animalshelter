import java.time.LocalDate;

public class Animal {
    public String Name;
    public Gender Gender;
    public Reservor ReservedBy;
    public Animal(String name, Gender gender){
        Name = name;
        Gender = gender;
    }
    public boolean Reserve(String reservedBy){
        if(this.ReservedBy == null){
            this.ReservedBy = new Reservor(reservedBy, LocalDate.now());
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        String reserved = "not reserved";
        if(ReservedBy != null){
            reserved = String.format("reserved by %s", ReservedBy.Name);
        }
        return String.format("%s, %s, %s",Name, Gender, reserved);
    }
}