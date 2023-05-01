import java.util.ArrayList;

public class House {

    ArrayList<Room> rooms;

    public House() {
        rooms = new ArrayList<Room>();
    }

    public void addRoom(Room b) {
        System.out.println("Adding room...");
        rooms.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    public String toString() {
        String mapString = "DIRECTORY of ROOMS";

        for (int i = 0; i < this.rooms.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.rooms.get(i).getName() + " (" + this.rooms.get(i).getInformation() + ")";
        }
        return mapString;
    }

}
