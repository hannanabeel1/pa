import java.util.*;

public class MovieTickets {
    public static String[][] create_movies() {
        String[][] Movies = {
                { "Avatar2", "A1", "9" },
                { "The Good Doctor", "A2", "8" },
                { "Den Of Thieves", "A3", "7" },
                { "Wednesday", "A4", "5" },
                { "Money Heist", "A5", "10" },
                { "San Andreas", "B1", "13" },
                { "Passengers", "B2", "12" },
                { "G.I.Joe", "B3", "15" },
                { "Red Notice", "B4", "11" },
                { "Peaky Blinders", "B5", "18" },
        };
        return Movies;
    }

    public static String[][] create_snacks_drinks() {
        String[][] snacks_drinks = {
                { "Popcorn", "5" },
                { "Soda", "3" },
                { "Candy", "2" },
                { "Nachos", "4" }
        };
        return snacks_drinks;
    }

public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    String[][] Movies = create_movies();
    String[][] snacks_drinks = create_snacks_drinks();
    // Start interaction
    System.out.println("Welcome To The AUM Cinema");
    System.out.println("Do you have an account? (yes/no)");
    String account = input.nextLine();
    if (account.equalsIgnoreCase("yes")) {
        System.out.println("Enter your User name:");
        String userName = input.nextLine();
        System.out.println("Enter your Password:");
        String enteredPassword = input.nextLine();
        String expectedPassword = "0000";
        if (enteredPassword.equals(expectedPassword)) {
            System.out.println("Sign in successful!");
        } else {
            System.out.println("Invalid username or password.");
            return;
        }
    } else {
        System.out.println("Sign up");
        System.out.println("Enter your First name:");
        String firstName = input.nextLine();
        System.out.println("Enter your Last name: ");
        String lastName = input.nextLine();
        System.out.println("Enter your Gender: (Male/Female)");
        String gender = input.nextLine();
        if (gender.equalsIgnoreCase("male")) {
            System.out.println("Hello Mr. " + firstName);
        } else if (gender.equalsIgnoreCase("female")) {
            System.out.println("Hello Mis. " + firstName);
        } else {
            System.out.println("Something went wrong, please try again in a few minutes.");
            return;
        }
        System.out.println("Enter your Contact Number:");
        int contactNumber = input.nextInt();
        input.nextLine();
        System.out.println("Enter Your Email:");
        String Email = input.nextLine();
        System.out.println("Enter your Password:");
        String password = input.nextLine();
        System.out.println("Confirm your Password:");
String confirmPassword = input.nextLine();
while (!password.equals(confirmPassword)) {
System.out.println("Passwords do not match. Please try again.");
System.out.println("Enter your Password:");
password = input.nextLine();
System.out.println("Confirm your Password:");
confirmPassword = input.nextLine();
}
System.out.println("Account created successfully!");
System.out.println("Enter your User name:");
String userName1 = input.nextLine();
System.out.println("Enter your Password:");
String enteredPassword1 = input.nextLine();
confirmPassword = enteredPassword1;
if (!enteredPassword1.equals(password)) {
System.out.println("Invalid username or password.");
return;
}
System.out.println("Sign in successful!");
}
System.out.println("--------------");
// Get number of tickets
System.out.print("How many people are going to watch the movie? ");
int NumOfTickets = input.nextInt();
input.nextLine();
// Display available movies and prices
System.out.println("Available movies and prices:");
for (String[] movie : Movies) {
System.out.println(movie[0] + " - " + movie[2] + "$ (Room " + movie[1] + ")");
}
// Get movie selection
System.out.print("Which movie would you like to watch? ");
String movieSelection = input.nextLine();
// Get room selection
// System.out.print("Which room would you like to watch the movie in? ");
// String roomSelection = input.nextLine();
// Search for selected movie and room
String selectedMovie = "";
String room = "";
for (String[] movie : Movies) {
if (movie[0].equalsIgnoreCase(movieSelection) && movie[1].equalsIgnoreCase(roomSelection)) {
selectedMovie = movie[0];
room = movie[1];
break;
}
}
// Calculate ticket price
// if (selectedMovie.equals(movie[1])) {
// System.out.println("Invalid movie or room selection. Please try again.");
// return;
// }
for (int i = 0; i < Movies.length; i++) {
if (Movies[i][0].equalsIgnoreCase(movieSelection) && Movies[i][1].equalsIgnoreCase(roomSelection)) {
int ticketPrice = Integer.parseInt(Movies[i][2]) * NumOfTickets;
selectedMovie = Movies[i][0];
room = Movies[i][1];
break;
}
}
int ticketPrice =0;
// System.out.println("Your selected movie is " + selectedMovie + " in room " + room);
System.out.println("Total ticket price is " + ticketPrice + "$ for " + NumOfTickets + " tickets.");
// Display available snacks and drinks
System.out.println("Available snacks and drinks:");
for (String[] snack_drink : snacks_drinks) {
System.out.println(snack_drink[0] + " - " + snack_drink[1] + "$");
}
// Get snack and drink selection
System.out.print("Which snack or drink would you like to add to your order? (Enter 'none' if none) ");
String snackSelection = input.nextLine();
if (!snackSelection.equalsIgnoreCase("none")) {
    boolean found = false;
    int snackPrice = 0;
    for (String[] snack_drink : snacks_drinks) {
        if (snack_drink[0].equalsIgnoreCase(snackSelection)) {
            snackPrice = Integer.parseInt(snack_drink[1]);
            found = true;
            break;
        }
    }
    if(!found)
        System.out.println("Sorry, we don't have this snack or drink");
    else{
        System.out.println("Snack/Drink: " + snackSelection);
        System.out.println("Price: " + snackPrice);
    }
}
if (snackPrice == 0) {
System.out.println("Invalid snack or drink selection. Please try again.");
return;
int totalPrice = ticketPrice + snackPrice;
System.out.println("Your selected snack is " + snackSelection + " for " + snackPrice + "$.");
System.out.println("Total order price is " + totalPrice + "$.");
 else {
System.out.println("No snacks or drinks selected.");
System.out.println("Total order price is " + ticketPrice + "$.");
}
}
System.out.println("Thank you for your purchase! Enjoy the movie.");
}
}