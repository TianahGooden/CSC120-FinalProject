import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        House myHouse = new House();
        Player gamer = new Player(null, null);
        myHouse.addRoom(new Room("Kitchen","The Kitchen is besides x room"));
        Room myKitchen = new Room("Kitchen", null);
        Item cake = new Item("Chocolate Cake", "your roommate's desert (that your not supposed to eat)", "Kitchen (in fridge)");
        System.out.println(cake);
        //myKitchen.stockItem(cake);
        //myKitchen.addItem("Chocolate Cake");
        myKitchen.addItem("Chocolate Cake");
        gamer.recordItem(cake);


        

        myHouse.addRoom(new Room("Your bedroom","Your Bedroom is besides x room"));
        myHouse.addRoom(new Room("Roommate's bedroom","Your Roommate's Bedroom is besides x room"));
        myHouse.addRoom(new Room("Garden","The Garden is behind your Roommate's Bedroom"));
        myHouse.addRoom(new Room("Bathroom","The Bathroom is besides x room"));
        myHouse.addRoom(new Room("Hallway","The Hallway is besides x room"));
        myHouse.addRoom(new Room("Living Room","The Living Room is besides x room"));
        //System.out.println(myHouse); prevent player from printing a full map until house has been fully explored?

        System.out.println("Welcome Player! What's your name?");
        String s1 = input.nextLine();
        System.out.println("Hello " + s1 + "! This is a text-adventure game. \nReady to get started?");
        String s2 = input.nextLine();
        if (s2.equals("Yes")){
            System.out.println("Cool! Let's get started!");
        } else {
            System.out.println("We're going anyways!");
        } 
        System.out.println(s1+", you just got home from a party. You're super hungry so you head straight to the kitchen.");
        System.out.println("The kitchen has a refrigerator, toaster, and a small brown table. On the table is a bowl containing one rotten banana.");
        // String s3 = input.nextLine();
        // if (s3.equals("open refrigerator")){
        //     System.out.println("In the fridge is leftover chocolate cake, mushroom soup, and expired yogurt.");
        // } else if (s3.equals("eat banana")){
        //     System.out.println("Gross! Let's find something else!");
        // } else {
        //     System.out.println("I don't understand. Enter a different command");
        // }
        // String s4 = input.nextLine();
        // if (s4.equals("eat yogurt") || s4.equals("eat expired yogurt")) {
        //     System.out.println("It's expired! Choose something else");
        // } else if (s4.equals("eat soup") || s4.equals("eat mushroom soup")){
        //     System.out.println("You hate mushrooms! Eat something else");
        // } else if (s4.equals("eat cake") || s4.equals("eat chocolate cake")){
        //     System.out.println("You're about to eat the chocolate cake. There's a note from your roommate: 'Do not eat my chocolate cake.'\nBut, you're still hungry so you eat it anyways");
        // }

        // boolean win = false;
        // while (win == false){
        //     // set something to win, so when win becomes true while statement endsd
        //     System.out.println("Do something");
        //     String boo = input.nextLine();
        //     System.out.println("woohoo");

        //     if (boo.equals("I win")){
        //         win = true;
        //     }
        // }

        input.close();
    }
}
