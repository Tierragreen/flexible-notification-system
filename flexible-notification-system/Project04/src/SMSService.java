/**
 * Represents an SMS-based notification service.
 *
 * Implements the NotificationMedium interface.
 *
 * @author Tierra Green
 */
public class SMSService implements NotificationMedium {

    /**
     * Sends a message via SMS.
     *
     * @param message the message to be sent
     */
    @Override
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}
