package Room;
import Guest.Guest;

import java.util.ArrayList;

public abstract class Room {
    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity, ArrayList allGuests) {
        this.capacity = capacity;
        this.guests = allGuests;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public int getNumberOfGuests(){
        return this.guests.size();
    }

//    public void setGuests(ArrayList<Guest> guests) {
//        this.guests = guests;
//    }

    public void addGuestToRoom(Guest guest){
        this.guests.add(guest);
    }

    public void removeGuestFromRoom(Guest guest){
        this.guests.remove(guest);
    }
}
