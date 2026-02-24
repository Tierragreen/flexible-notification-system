/**
 * Represents a WhatsApp-based notification service.
 *
 * This class extends the system functionality by implementing
 * the existing NotificationMedium interface without modifying
 * any core system components.
 *
 * @author Tierra Green
 */
public class WhatsAppService implements NotificationMedium {

    /**
     * Sends a message via WhatsApp.
     *
     * @param message the message to be sent
     */
    @Override
    public void send(String message) {
        System.out.println("[WhatsApp] Sending message: " + message);
    }
}
