package Room;

import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private String name;


    public ConferenceRoom(int capacity, ArrayList guests, String name){
        super(capacity, new ArrayList(guests));
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
