/**
 * Represents an email-based notification service.
 *
 * Implements the NotificationMedium interface.
 *
 * @author Tierra Green
 */
public class EmailService implements NotificationMedium {

    /**
     * Sends a message via email.
     *
     * @param message the message to be sent
     */
    @Override
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}
