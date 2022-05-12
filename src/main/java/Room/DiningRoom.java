package Room;

import Guest.Guest;

import java.util.ArrayList;

public class DiningRoom {

    private String name;
    private int capacity;
    private ArrayList<Guest> guests;



    public DiningRoom(String name, int capacity, ArrayList allGuests){
        this.name = name;
        this.capacity = capacity;
        this.guests = allGuests;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNoOfGuests(){
        return this.guests.size();
    }


}
