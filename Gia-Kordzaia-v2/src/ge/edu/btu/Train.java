package ge.edu.btu;

import java.util.ArrayList;
import java.util.List;

public class Train {

    private List<Passenger> passengerList;

    public Train() {
        this.passengerList = new ArrayList<>();
    }

    public void addPassenger(Passenger passenger) {
        if (passenger != null && passenger.haveTicket()) {
            this.passengerList.add(passenger);
        }
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }
}
