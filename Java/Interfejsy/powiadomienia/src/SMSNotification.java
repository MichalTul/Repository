public class SMSNotification implements Notification {
    private String recipient;
    private String message;

    public SMSNotification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    @Override
    public void send() {
        System.out.println("Wysłano SMS do " + recipient + " : " + message);
    }
}
