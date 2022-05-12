import Guest.Guest;
import Room.Bedroom;
import Room.ConferenceRoom;
import Room.DiningRoom;
import Room.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom;
    private Bedroom bedroom1;
    private Guest guest;
    private ConferenceRoom conferenceRoom;
    private DiningRoom diningRoom;

    @Before
    public void before(){
        hotel = new Hotel();
        ArrayList<Bedroom> bedrooms = new ArrayList<>();
        ArrayList<ConferenceRoom> conferenceRooms = new ArrayList<>();
        ArrayList<Guest> guests = new ArrayList<>();
        bedroom = new Bedroom(1, guests, 101, RoomType.SINGLE);
        bedroom1 = new Bedroom(2, guests, 102, RoomType.DOUBLE);
        conferenceRoom = new ConferenceRoom(2, guests, "The Mike Ritchie Conference Room");
        bedrooms.add(bedroom);
        conferenceRooms.add(conferenceRoom);
        guest = new Guest("Bob");
        diningRoom = new DiningRoom("The Mike Ritchie Dining Room", 80, guests);
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
    public void canGetBedrooms(){
        hotel.addBedroomToHotel(bedroom);
        hotel.addBedroomToHotel(bedroom1);
        assertEquals(4,hotel.getBedrooms());
    }

    @Test
    public void canCheckOutGuest(){
        hotel.checkOutGuest(guest, bedroom);
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void canCreateBooking(){
        hotel.bookRoom(bedroom, 3);
        assertEquals(1, hotel.getNumberOfBookings());
    }

    @Test
    public void canAddToHashMap(){
        hotel.addToDiningRoomHashmap(diningRoom);
        assertEquals(diningRoom, hotel.getDiningRoomFromHashMap("The Mike Ritchie Dining Room"));
    }

//    @Test
//    public void canReturnEmptyRooms(){
//        hotel.addBedroomToHotel(bedroom);
//        hotel.addBedroomToHotel(bedroom1);
//        hotel.checkInGuest(guest, bedroom);
//
//        assertEquals(bedroom1, hotel.getEmptyRooms());
//    }

}
