public class Arrowhead {

    public static void main(String[] args) {

        Console.displayLine("Welcome to the Arrowhead Maker\n");

        String choice;

        do {
            Console.displayLine("How many rows would you like your arrow to have?");
            int size = Console.getInt("Enter a number from 3 to 10: ", 3, 10);
            Console.displayLine();

            size = Math.floorDiv(size, 2);
            size++;

            for (int i = 0; i < size; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(">");
                }
                Console.displayLine();
            }

            for (int i = size; i > 1; i--) {
                for (int j = i; j > 1; j--) {
                    System.out.print(">");
                }
                Console.displayLine();
            }

            Console.displayLine();
            choice = Console.getString("Would you like to make another arrowhead? (y/n): ", "y", "n");
            Console.displayLine();

        } while (choice.equalsIgnoreCase("y"));

        Console.displayLine("Bye");
    }
}
