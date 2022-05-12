package Room;

import Guest.Guest;
import Room.Bedroom;
import Room.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;

    @Before
    public void before() {
        ArrayList<Guest> guests = new ArrayList<>();

        Guest guest2 = new Guest("Bill");
        bedroom = new Bedroom(2, guests, 5, RoomType.DOUBLE);
    }

        @Test
        public void hasCapacity () {
            assertEquals(2, bedroom.getCapacity());
        }

        @Test
        public void hasNoGuests () {
            assertEquals(0, bedroom.getNumberOfGuests());
        }

        @Test
        public void getRoomNo () {
            assertEquals(5, bedroom.getRoomNo());
        }

        @Test
        public void getRoomType () {
            assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
        }

        @Test
        public void canAddGuestToRoom () {
            Guest guest1 = new Guest("Bob");
            bedroom.addGuestToRoom(guest1);
            assertEquals(1, bedroom.getNumberOfGuests());
        }

        @Test
        public void canRemoveGuestFromRoom (){
            Guest guest1 = new Guest("Bob");
            bedroom.addGuestToRoom(guest1);
            bedroom.removeGuestFromRoom(guest1);
            assertEquals(0, bedroom.getNumberOfGuests());
        }

        @Test
        public void hasRoomRate (){
        double cost = bedroom.getRoomRate();
        assertEquals(59.99, cost, 0.0);
        }

}
