import Guest.Guest;
import Room.Bedroom;
import Room.ConferenceRoom;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
    }

    public ArrayList<Bedroom> getBedrooms() {
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
}
