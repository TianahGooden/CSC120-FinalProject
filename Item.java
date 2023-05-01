public class Item {

    //limit items in backpack?
    //fix items class 1) cannot pick up fridge 2) if item value false, cannot pick up item - add boolean 3) can examine
  public String thing;
  public String description;
  public String location;
  //public Hashtable<String, String> inventory;

  public Item(String thing, String description, String location) {
    if (thing != null) { this.thing = thing; }
    if (description != null) { this.description = description; } 
    if (location != null) { this.location = location;}
    //this.inventory = new Hashtable<String, String>();
  }

  // name
  public String getThing() {
    return this.thing;
  }

  // description
  // will we change descriptions?
  public String getDescription() {
    return this.description;
  }

  // need a change location function (player picks up item in kitchen, drops it in bedroom)
  public String getLocation() {
    return this.location;
  }

  public String toString() {
    return this.thing + " is a " + this.description + ".";
}

}
