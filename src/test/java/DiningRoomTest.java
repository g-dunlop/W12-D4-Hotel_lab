import Guest.Guest;
import Room.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    private DiningRoom diningRoom;
    private Guest guest;

    @Before
    public void before(){
        guest = new Guest("Mike Ritchie");
        ArrayList<Guest> guests = new ArrayList<>();
        diningRoom = new DiningRoom("The Mike Ritchie Dining Room", 80, guests);
    }

    @Test
    public void hasName(){
        assertEquals("The Mike Ritchie Dining Room", diningRoom.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(80, diningRoom.getCapacity());
    }

    @Test
    public void hasGuests(){
        assertEquals(0, diningRoom.getNoOfGuests());
    }
}
