package springfive.airline.airlinefare.domain;

import java.util.Set;
import lombok.Data;

@Data
public class Booking {

  String id;

  Set<Seat> passengers;

  Flight flight;

  public Long reservationsOfClass(String classId){
    return this.passengers.stream().filter(seat -> seat.getCategory().getId().equalsIgnoreCase(classId)).count();
  }



}