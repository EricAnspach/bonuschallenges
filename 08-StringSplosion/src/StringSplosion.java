public class StringSplosion {

    public static void main(String[] args) {

        Console.displayLine("Welcome to the StringSplosion App\n");

        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {

            String text = Console.getString("Enter a string of text: ");

            Console.displayLine(stringSplosion(text));

            Console.displayLine();
            choice = Console.getString("Would you like to run the app again with another string?", "y", "n");
            Console.displayLine();
        }
        Console.displayLine("Bye!");
    }

    public static String stringSplosion(String str) {

        StringBuilder newStrBldr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            newStrBldr.append(str.substring(0, i+1));
        }
        String newStr = newStrBldr.toString();
        return newStr;
    }
}
