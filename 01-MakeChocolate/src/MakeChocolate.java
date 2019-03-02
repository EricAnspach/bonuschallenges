public class MakeChocolate {

    public static void main(String[] args) {
        Console.displayLine("Chocolate Maker\n");

        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {

            int small = Console.getInt("How many small chocolate bars are available? ");
            int big = Console.getInt("How many big chocolate bars are available? ");
            int goal = Console.getInt("How many kilograms of chocolate would you like in the package? ");
            Console.displayLine();

            int smallBarsUsed = makeChocolate(small, big, goal);
            int leftover = small - smallBarsUsed;

            if (smallBarsUsed == -1) {
                Console.displayLine("It is not possible to make " + goal +
                        " kilograms of chocolate with " + small + " small bars and " + big + " big bars.");
            } else {
                Console.displayLine("After making the package with " + goal +
                        " kilograms of chocolate there are " + leftover + " small bars left.\n" +
                        smallBarsUsed + " small bars were used in the package.");
            }

            Console.displayLine();
            choice = Console.getString("Would you like to make more chocolate? (y/n): ", "y", "n");
            Console.displayLine();
        }
        Console.displayLine("Goodbye");
    }

    public static int makeChocolate(int small, int big, int goal) {
        if (((5*big)+small) < goal) {
            return -1;
        } else {
            int bigBarsUsed;
            int smallBarsUsed = goal % 5;
            int bigBarsNeeded = Math.floorDiv(goal, 5);

            if (big < bigBarsNeeded) {
                smallBarsUsed += ((bigBarsNeeded - big) * 5);
            }

            return smallBarsUsed;
        }
    }
}
