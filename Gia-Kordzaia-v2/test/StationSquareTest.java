import ge.edu.btu.Passenger;
import ge.edu.btu.Train;

import static org.junit.jupiter.api.Assertions.*;

class StationSquareTest {

    private Train train;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        train = new Train();
    }

    @Test
    void TestOnePassengerWithTicket() {
        Passenger p1 = new Passenger("p1", true);
        train.addPassenger(p1);
        assertEquals(1, train.getPassengerList().size());
    }

    @Test
    void TestOnePassengerWithoutTicket() {
        Passenger p1 = new Passenger("p1", false);
        train.addPassenger(p1);
        assertEquals(0, train.getPassengerList().size());
    }

    @Test
    void TestTwoPassengers() {
        Passenger p1 = new Passenger("p1", true);
        Passenger p2 = new Passenger("p2", false);
        train.addPassenger(p1);
        train.addPassenger(p2);
        assertEquals(1, train.getPassengerList().size());
    }

    @Test
    void TestMultiplePassengers() {
        String initName = "p";

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                train.addPassenger(new Passenger(initName + i, true));
            } else {
                train.addPassenger(new Passenger(initName + i, false));
            }
        }

        assertEquals(50, train.getPassengerList().size());
    }
}
