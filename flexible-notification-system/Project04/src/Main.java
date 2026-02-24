/**
 * Entry point for the Flexible Notification System.
 *
 * Demonstrates switching notification mediums at runtime
 * and running the program from the command line.
 *
 * @author Tierra Green
 */
public class Main {

    public static void main(String[] args) {

        AlertSystem alertSystem = new AlertSystem();

        alertSystem.setMedium(new EmailService());
        alertSystem.notifyUser("Your assignment has been posted.");

        alertSystem.setMedium(new SMSService());
        alertSystem.notifyUser("Your assignment is due tonight.");

        alertSystem.displayLog();
    }
}
