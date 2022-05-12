package Room;

import java.util.ArrayList;

public class Bedroom extends Room {

    private int roomNo;
    private RoomType roomType;

    public Bedroom(int capacity, ArrayList guests, int roomNo, RoomType roomType) {
        super(capacity, new ArrayList(guests));
        this.roomNo = roomNo;
        this.roomType = roomType;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public RoomType getRoomType() {
        return roomType;
    }
}
