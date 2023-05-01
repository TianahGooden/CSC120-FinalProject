import java.util.ArrayList;
import java.util.Hashtable;

public class Player {
    
  public String username;
  public String position;
  public int size;
  public Hashtable<String, Boolean> backpack;
  ArrayList<Item> items;

  public Player(String username, String position) {
    // is username a good idea?
    this.username = username;
    if (position != null) { this.position = position; } 
    this.size = 20;
    // an inventory of items - for player to access
    this.backpack = new Hashtable<String, Boolean>();
    // a list of items - for building purposes (keeping track of items, locations, etc.)
    items = new ArrayList<Item>();
  }

  public String getName() {
    return this.username;
  }

  public String getPosition() {
    return this.position;
  }

  // for game-building purposes
  public void recordItem(Item b) {
    System.out.println("Adding item to ArrayList...");
    items.add(b);
    System.out.println("-->Successfully added " + b.getThing() + " to the collection.");
  }

  //for game-building purposes
  public String toString() {
    String itemList = "RECORD of ITEMS";

    for (int i = 0; i < this.items.size(); i ++) {
        itemList += "\n  " + (i+1) + ". "+ this.items.get(i).getThing() + " (" + this.items.get(i).getDescription() + ")";
    }
    return itemList;
  }

  // if player and item are not in same location, user cannot grab item
  // need to figure out what to do if item is not grabbable
  public void grab(String object, Item b){
    if (this.getPosition() == b.getLocation()){
      this.backpack.put(object,true);
      System.out.println(object + " has been grabbed");
    } else {
      System.out.println("Item is not in your location");
    }
  } 
  
  // need to make sure player has object before dropping it
  // need to change location of object
  public String drop(String object){
    this.backpack.remove(object,true);
    System.out.println(object + " has been dropped");
    return object;
  }

  public void examine(String object, Item b){
    if (this.getPosition() == b.getLocation()){
      System.out.println("examining " + object);
      System.out.println(object + b.getDescription());
    } else {
      System.out.println("The " + object + "is not in your location. Go to " + b.getLocation() + " to examine " + object);
    }

  }

  // i dont know what's going on with boolean check
  // how does "use" work compared to "eat"?
  public void use(String object){
    boolean check;
    if (this.backpack.containsKey(object)){
      check = true;
      System.out.println("using " + object);
    } else {
      check = false;
      System.out.println(object + " is not in inventory. Grab it to use it.");
    }
  }

  // what should i do with walk? Only walk left to right? North, south, east, and west?
  public boolean walk(String direction){
    //System.out.println("Walking . . . Walking . . . Walking . . .");
    System.out.println(this.username + " has walked to " + direction + "!");
    return true;
  }

// I don't think we will incorporate fly
    // public boolean fly(int x, int y){
    //     if (this.x>100 || this.y>100){
    //       throw new RuntimeException("Yikes! You've wandered too far. Stay within the map");
    //     } else {
    //       System.out.println("New Location is (" + x + ", " + y + ")");
    //     return true;
    //     }
    // }

//I don't think we will incorporate shrink or fly, we only shrink/grow once
  // public Number shrink(){
  //   if (this.size<5){
  //     System.out.println("Can't get any smaller.");
  //   } else {
  //     this.size = this.size - 5;
  //   }
  //   return this.size;
  // }

  // public Number grow(){
  //   if (this.size>50){
  //     System.out.println("Can't get any bigger");
  //   } else {
  //     this.size = this.size + 5;
  //   }
  //   return this.size;
  // }
    
}
