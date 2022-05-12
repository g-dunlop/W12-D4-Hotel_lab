import Guest.Guest;
import Room.Bedroom;
import Room.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom;
    private Bedroom bedroom1;
    private Booking booking1;

    @Before
    public void before(){
        ArrayList<Guest> guests = new ArrayList<>();
        bedroom = new Bedroom(1, guests, 101, RoomType.SINGLE);
        bedroom1 = new Bedroom(2, guests, 102, RoomType.DOUBLE);
        booking = new Booking(bedroom, 4);
        booking1 = new Booking(bedroom1, 2);
    }

    @Test
    public void hasBedroom(){
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void hasNumberOfNights(){
        assertEquals(4, booking.getNumberOfNights());
    }

    @Test
    public void canGetTotalPriceOfBooking(){

        assertEquals(159.96,booking.returnBookingTotalPrice() ,0.0 );
    }
}
