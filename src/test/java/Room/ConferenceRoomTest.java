package Room;

import Guest.Guest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        ArrayList<Guest> guests = new ArrayList<>();

        Guest guest2 = new Guest("Bill");
        conferenceRoom = new ConferenceRoom(2, guests, "The Mike Ritchie Conference Room");
    }

    @Test
    public void hasCapacity () {
        assertEquals(2, conferenceRoom.getCapacity());
    }

    @Test
    public void hasNoGuests () {
        assertEquals(0, conferenceRoom.getNumberOfGuests());
    }

    @Test
    public void hasName(){
        assertEquals("The Mike Ritchie Conference Room", conferenceRoom.getName());
    }

}
