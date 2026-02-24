import java.util.ArrayList;

/**
 * Manages alert notifications using composition.
 *
 * The notification medium can be swapped at runtime,
 * making the system easy to extend and maintain.
 *
 * @author Tierra Green
 */
public class AlertSystem {

    private NotificationMedium medium;
    private ArrayList<String> log;

    /**
     * Constructs an AlertSystem with an empty message log.
     */
    public AlertSystem() {
        log = new ArrayList<>();
    }

    /**
     * Sets the current notification medium.
     *
     * @param medium the notification medium to use
     */
    public void setMedium(NotificationMedium medium) {
        this.medium = medium;
    }

    /**
     * Sends a notification and records it in the log.
     *
     * @param message the message to notify the user with
     */
    public void notifyUser(String message) {
        if (medium != null) {
            medium.send(message);
            log.add(message);
        } else {
            System.out.println("No notification medium set.");
        }
    }

    /**
     * Displays all messages sent during the session.
     */
    public void displayLog() {
        System.out.println("Message Log:");
        for (String msg : log) {
            System.out.println("- " + msg);
        }
    }
}
