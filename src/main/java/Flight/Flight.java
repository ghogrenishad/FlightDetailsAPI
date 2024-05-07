package Flight;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Flight {

    @Id
    private String Id;
    private String name;
    private int price;
    private String source;
    private String destination;
    private LocalDate date;
    private LocalTime deptTime;
    private LocalTime arrivalTime;

    @Override
    public String toString(){
        return "Flight [Id = " + Id + ", Name = " + name +", price = " + price + ", Source = " + source
                + ", Destination = " + destination + ", Date = " + date + ", Departure Time = " + deptTime
                + ", Arrival Time = " + arrivalTime + "]";
    }
}
