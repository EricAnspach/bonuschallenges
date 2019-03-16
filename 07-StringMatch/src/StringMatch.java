public class StringMatch {

    public static void main(String[] args) {

        String choice;

        Console.displayLine("Welcome to the String Match App\n");
        Console.displayLine("Enter two strings, and the app will tell you how often" +
                "a matching two character substring occurs.\n");

        do {
            String a = Console.getString("Enter the first string: ");
            String b = Console.getString("Enter the second string: ");

            int matches = stringMatch(a,b);

            if (matches == -1) {
                Console.displayLine("\nThe strings must both consist of at least two characters" +
                        " in order for the String Match App to work.\n");
            } else {
                Console.displayLine("\nThe two strings that you entered have " + matches
                        + " matching two character substrings.\n");
            }

            choice = Console.getString("Would you like to run the app again? (y/n): ");
            Console.displayLine();
        } while (choice.equalsIgnoreCase("y"));

        Console.displayLine("\nGoodbye!");
    }

    public static int stringMatch(String a, String b) {

        if (a.length() == 1 || b.length() == 1) {
            return -1;
        } else {
            int count = 0;
            for(int i = 0; i < a.length()-1; i++) {
                String sub1 = a.substring(i, i+2);
                for (int j = 0; j < b.length()-1; j++) {
                    String sub2 = b.substring(j, j+2);
                    if(sub1.equalsIgnoreCase(sub2)) {
                        count++;
                    }
                }
            }
            return count;
        }
    }
}
