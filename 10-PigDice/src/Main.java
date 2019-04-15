public class Main {

    public static void main(String[] args) {

        Console.displayLine("Welcome to the Pig Dice Game\n");

        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {

            int numberOfGames = Console.getInt("How many times would you like to play? ", 1, 10);
            int highestScore = 0;
            int totalScore = 0;
            int totalRolls = 0;
            int mostRolls = 0;

            Console.displayLine();

            for (int i = 0; i < numberOfGames; i++) {
                int numberRolled;
                Console.display("Game " + (i+1) + ": ");
                int gameTotal = 0;
                int gameRolls = 0;

                do {
                    numberRolled = (int)(Math.random() * 6) + 1;
                    gameTotal += numberRolled;
                    Console.display(numberRolled + "  ");
                    totalRolls++;
                    gameRolls++;

                } while (numberRolled != 1);

                if (gameTotal > highestScore) {
                    highestScore = gameTotal;
                }

                if (gameRolls > mostRolls) {
                    mostRolls = gameRolls;
                }

                totalScore += gameTotal;

                Console.display("  Game total: " + gameTotal + "\n\n");

            }

            Console.displayLine("Played " + numberOfGames + " games");
            Console.displayLine("Highest score is " + highestScore);
            Console.displayLine("Total number of rolls is " + totalRolls);
            Console.displayLine("The highest number of rolls in a game is " + mostRolls);
            Console.displayLine("The average number of rolls per game is " + ((double)totalRolls/(double)numberOfGames));
            Console.displayLine("The average score per game is " + (totalScore/numberOfGames));
            Console.displayLine();
            choice = Console.getString("Would you like to play again? (y/n): ", "y", "n");
            Console.displayLine();
        }

        Console.display("Goodbye!");

    }
}
