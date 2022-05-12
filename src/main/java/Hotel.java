import Guest.Guest;
import Room.Bedroom;
import Room.ConferenceRoom;
import Room.DiningRoom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Booking> bookings;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.bookings = new ArrayList<>();
        this.diningRooms = new HashMap<>();
    }


//    public void addToGenreHashmap(Book book){
//        String genre = book.getGenre();

    public Set getDiningRoomKey(HashMap diningRooms) {
        Set<String>keys = diningRooms.keySet();
        return(keys);
    }

    public void addToDiningRoomHashmap(DiningRoom diningRoom){
        String name = diningRoom.getName();
        diningRooms.put(name, diningRoom);
    }

    public DiningRoom getDiningRoomFromHashMap(String name){
        return this.diningRooms.get(name);
    }

    public ArrayList<Bedroom> getBedrooms() {
//        System.out.println(bedrooms);
        return bedrooms;
    }

    public int getNumberOfBedrooms(){
        return this.bedrooms.size();
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public void addBedroomToHotel(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoomToHotel(ConferenceRoom conferenceRoom){
        this.conferenceRooms.add(conferenceRoom);
    }

    public int getNumberOfConferenceRooms(){
        return this.conferenceRooms.size();
    }

    public void checkInGuest(Guest guest, Bedroom bedroom){
        bedroom.addGuestToRoom(guest);
    }

    public void checkOutGuest(Guest guest, Bedroom bedroom){
        bedroom.removeGuestFromRoom(guest);
    }

    public int getNumberOfBookings(){
       return this.bookings.size();
    }

    public void bookRoom(Bedroom bedroom, int nights){
        bookings.add(new Booking(bedroom, nights));
    }

//    public ArrayList<Bedroom> getEmptyRooms(){
//        ArrayList bedrms = this.getBedrooms();
//        for (int i=0; i<bedrms.size(); i++){
//            Bedroom bedroom = bedrms.get(i)
//                    .getNumberOfGuests();
//        }
//    }
}
