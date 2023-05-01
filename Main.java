import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        House apartment = new House();
        Player gamer = new Player(null, null);
        apartment.addRoom(new Room("Kitchen","The Kitchen is besides x room"));
        Room kitchen = new Room("Kitchen", "The kitchen has a refridgerator, toaster, and a small brown table. On the table is a bowl containing one rotten banana. A passage to the left leads to the living room.");

        Item cake = new Item("Chocolate Cake", "your roommate's desert (that your not supposed to eat)", "Kitchen (in fridge)");
        System.out.println(cake);
        kitchen.addItem("Chocolate Cake");
        gamer.recordItem(cake);

        apartment.addRoom(new Room("Your bedroom","Your Bedroom is besides x room"));
        apartment.addRoom(new Room("Roommate's bedroom","Your Roommate's Bedroom is besides x room"));
        apartment.addRoom(new Room("Garden","The Garden is behind your Roommate's Bedroom"));
        apartment.addRoom(new Room("Bathroom","The Bathroom is besides x room"));
        apartment.addRoom(new Room("Hallway","The Hallway is besides x room"));
        apartment.addRoom(new Room("Living Room","The Living Room is besides x room"));
        //System.out.println(myHouse); prevent player from printing a full map until house has been fully explored?

        System.out.println("Welcome Player! What's your name?");
        String s1 = input.nextLine();
        System.out.println(s1+"! Welcome home! You just got back from a party. You live in an apartment with your roommate.\nIt has a small kitchen, a living room, two bedrooms, and an adjoining bathroom between the two bedrooms.\nRight now, you're super hungry so you head straight to the kitchen.");
        System.out.println("The kitchen has a refridgerator, toaster, and a small brown table. On the table is a bowl containing one rotten banana.\nObjective: Find something to eat!");

        boolean fridge = false;
        while (fridge == false){
            // set something to win, so when win becomes true while statement endsd
            String userInput = input.nextLine();
            String line = userInput.toLowerCase();
            if (line.equals ("open refrigerator") || line.equals ("open fridge") || line.equals("use fridge") || line.equals ("use refrigerator")){
                System.out.println("In the refrigerator is leftover mushroom soup and your roommate's chocolate cake that has a 'DO NOT EAT' post it on top.");
                fridge = true;
            } else if (line.equals("eat banana") || line.equals("eat rotten banana")){
                System.out.println("Gross! Let's find something else!");
            } else if (line.equals("use toaster")){
                System.out.println("There's no bread. Do something else.");
            } else if (line.equals("show options")){
                System.out.println("Available options are: 'eat', 'open', 'use', and 'look around'. Additional options will be available later.");
            } else if (line.equals("look around")){
                System.out.println(kitchen.getInformation());
            } else {
                System.out.println("I don't understand. Try a different command. If you're enter type 'show options'.");
            }
        }

        boolean shrink = false;
        while (shrink == false){
            String userInput = input.nextLine();
            String line = userInput.toLowerCase();
            if (line.equals("eat cake") || line.equals("eat chocolate cake") || line.equals("eat roommates cake") || line.equals("eat roommate's cake") || line.equals("eat roommate's chocolate cake") || line.equals("eat roommates chocolate cake")){
                System.out.println("This is the best cake of your life! Your halfway done when you suddenly begin to feel dizzy.\nYou blackout!\nWhen you wake up you realize everything is giant! The cake shrunk you!");
                System.out.println("Your new objective: Unshrink yourself!");
                shrink = true;
            } else if (line.equals ("eat soup") || line.equals ("eat mushroom soup") || line.equals("eat leftover soup")){
                System.out.println("You hate mushrooms! Do something else.");
            } else if (line.equals("close fridge") || line.equals("close refridgerator") || line.equals("exit kitchen")) {
                System.out.println("You're hungry! You should eat first!");
            } else if (line.equals("look around")){
                System.out.println(kitchen.getInformation());
                System.out.println("In the refrigerator is leftover mushroom soup and your roommate's chocolate cake that has a 'DO NOT EAT' post it on top.");
            } else if (line.equals("show options")){
                System.out.println("Available options are: 'eat', 'open', 'use', and 'look around'. Additional options will be available later.");
            } else {
                System.out.println("I don't understand. Try a different command. If you're stuck enter 'show options'.");
            }
        }
        input.close();
    }
}
