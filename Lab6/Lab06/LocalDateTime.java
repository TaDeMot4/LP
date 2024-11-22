import java.time.LocalDate;

public class LocalDateTime {
    private java.time.LocalDateTime currentDate;

    public LocalDateTime(){
        currentDate = null;
    }
  
    public static LocalDateTime getLocalDateTime(){
        LocalDateTime customDateTime = new LocalDateTime();
        customDateTime.currentDate = java.time.LocalDateTime.now();
        return customDateTime;
    }
}