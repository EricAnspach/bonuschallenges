public class ReplaceVowels {

    public static void main(String[] args) {

        System.out.println("Vowel replacer\n");
        System.out.println("This app will remove the vowels from any sentence.\n");

        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {

            String sentence = Console.getString("Type in any sentence: ");


            sentence = sentence.replace("a", "_").replace("A", "_")
                    .replace("e","_").replace("E", "_")
                    .replace("i", "_").replace("I", "_")
                    .replace("o", "_").replace("O", "_")
                    .replace("u", "_").replace("U", "_");

            Console.displayLine("\n" + sentence + "\n");

            choice = Console.getString("Would you like to enter another sentence? (y/n): ", "y", "n");
        }

        Console.displayLine("Goodbye");
    }
}
