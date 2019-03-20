import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Stopwatch {

    public static void main(String[] args) {

        Console.displayLine("Stopwatch Application\n");
        String choice;

        do {

            LocalTime startTime = LocalTime.now();
            LocalTime stopTime = LocalTime.now();

            String userStart = Console.getEntry("Enter the word 'start' to start the timer: ", "start");
            Console.displayLine();

            if (userStart.equalsIgnoreCase("start")) {
                startTime = LocalTime.now();
                Console.displayLine("Timer has started.\n");
            }

            String userStop = Console.getEntry("Enter the word 'stop' to start the timer: ", "stop");
            Console.displayLine();

            if (userStop.equalsIgnoreCase("stop")) {
                stopTime = LocalTime.now();
                Console.displayLine("Timer has stopped.\n");
            }

            long numSeconds = ChronoUnit.SECONDS.between(startTime, stopTime);

            Console.displayLine("That took " + numSeconds + " seconds!\n");

            choice = Console.getString("Would you like to run the stopwatch again? (y/n): ", "y", "n");
            Console.displayLine();
        } while (choice.equalsIgnoreCase("y"));

        Console.displayLine("Exiting the stopwatch application");
    }
}
