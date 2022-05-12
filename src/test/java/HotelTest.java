import Guest.Guest;
import Room.Bedroom;
import Room.ConferenceRoom;
import Room.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom;
    private Guest guest;
    private ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        hotel = new Hotel();
        ArrayList<Bedroom> bedrooms = new ArrayList<>();
        ArrayList<ConferenceRoom> conferenceRooms = new ArrayList<>();
        ArrayList<Guest> guests = new ArrayList<>();
        bedroom = new Bedroom(1, guests, 101, RoomType.SINGLE);
        conferenceRoom = new ConferenceRoom(2, guests, "The Mike Ritchie Conference Room");
        bedrooms.add(bedroom);
        conferenceRooms.add(conferenceRoom);
        guest = new Guest("Bob");
    }

    @Test
    public void hotelHasBedrooms(){
//        ArrayList<Guest> guests = new ArrayList<>();
//        Bedroom bedroom1 = new Bedroom(1, guests, 101, RoomType.SINGLE);
        hotel.addBedroomToHotel(bedroom);
        assertEquals(1, hotel.getNumberOfBedrooms());
    }

    @Test
    public void hotelHasConferenceRooms(){
        hotel.addConferenceRoomToHotel(conferenceRoom);
        assertEquals(1, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void canCheckInGuest(){
        hotel.checkInGuest(guest, bedroom);
        assertEquals(1, bedroom.getNumberOfGuests());
    }

    @Test
    public void canCheckOutGuest(){
        hotel.checkOutGuest(guest, bedroom);
        assertEquals(0, bedroom.getNumberOfGuests());
    }


}
