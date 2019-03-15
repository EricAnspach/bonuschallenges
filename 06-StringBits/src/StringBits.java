public class StringBits {

    public static void main(String[] args) {

        Console.displayLine("Welcome to the String reducer\n");
        Console.displayLine("This app will delete every other letter of any word or sentence that you enter.\n");

        String choice;

        do {
            String s = Console.getString("Enter a word or sentence: ");
            Console.displayLine();

            Console.displayLine(stringBits(s));
            Console.displayLine();

            choice = Console.getString("Do you want to reduce another string? (y/n): ", "y", "n");
            Console.displayLine();

        } while (choice.equalsIgnoreCase("y"));
        Console.displayLine("Now leaving the String reducer.");
    }

    public static String stringBits(String str) {

        StringBuilder sb = new StringBuilder(str);
        String s = "";
        int sbLength = sb.length();

        if (sbLength == 1) {
            s = "For the string reducer to work, more than one character must be entered.";
        } else {
            for (int i = 0; i < sbLength-1; i++) {
                sb.deleteCharAt(i+1);
                sbLength--;
            }
            s = sb.toString();
        }
        return s;
    }
}
