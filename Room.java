import java.util.Hashtable;

public class Room {

    protected String name;
    protected String address;
    public Hashtable<String, Boolean> collection;
    
    // constructor
    public Room(String name, String address) {
        // room name aka kitchen, bedroom, living room
        if (name != null) { this.name = name; }
        // location aka beside bathroom, behind kitchen
        if (address != null) { this.address = address; } 
        // a hashtable of all items in room - if true, item can be removed, if false, item must stay
        this.collection = new Hashtable<String, Boolean>();
    }

    // adds item to hashtable, idk about making it true/false so use checkOut method to make false
    public void addItem(String item){ 
        this.collection.put(item, true);
        System.out.println(item + " has been added to Hashtable");
    }

    // adds item to arraylist
/*     public void stockItem(Item b) {
        System.out.println("Adding item to ArrayList...");
        items.add(b);
        System.out.println("-->Successfully added " + b.getThing() + " to the collection.");
    } */

/*     public void addItem(String item, Item b){
        this.collection.put(item, true);
        System.out.println(item + " has been added to Hashtable aka it's in room");
        System.out.println("Adding item to ArrayList...");
        items.add(b);
        System.out.println("-->Successfully added " + b.getThing() + " to the list of items.");
    } */

    // makes item false (aka immovable)
    public void checkOut(String title){
        this.collection.replace(title,false);
        System.out.println(title + " has been checked out");
    }

    // removes item from room's hashtable
    public String removeItem(String item){
        this.collection.remove(item,true);
        System.out.println(item + " has been removed");
        return item;
    }

    // name of room
    public String getName() {
        return this.name;
    }

    // location of room
    public String getAddress() {
        return this.address;
    } // we can include "bathroom is in between living room and your bedroom"


    // enter room, not sure if we will incorporate
    public Room enter() {
        System.out.println("You are now inside " + this.name + " on the ground floor.");
        return this;
    }

    // exit room
    public Room exit() {
        System.out.println("You have left " + this.name + ".");
        return null; 
    }

    // show options
    public void showOptions() {
        System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n");
    }

}
