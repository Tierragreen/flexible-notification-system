/**
 * Defines a notification medium that can send messages.
 *
 * This interface allows the AlertSystem to delegate
 * message delivery without depending on a specific implementation.
 *
 * @author Tierra Green
 */
public interface NotificationMedium {

    /**
     * Sends a notification message.
     *
     * @param message the message to be sent
     */
    void send(String message);
}
