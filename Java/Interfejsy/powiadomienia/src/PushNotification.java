public class PushNotification implements Notification {
    private String recipient;
    private String message;

    public PushNotification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    @Override
    public void send() {
        System.out.println("Wysłano powiadomienie push do " + recipient + " : " + message);
    }
}
