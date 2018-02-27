import java.time.LocalDate;

public class Reservor {
    public String Name;
    public LocalDate ReservedAt;
    public String getName() {
        return Name;
    }
    private void setName(String name) {
        Name = name;
    }
    public LocalDate getReservedAt() {
        return ReservedAt;
    }
    private void setReservedAt(LocalDate reservedAt) {
        ReservedAt = reservedAt;
    }
    public Reservor(String name, LocalDate reservedAt){
        Name = name;
        ReservedAt = reservedAt;
    }
}
