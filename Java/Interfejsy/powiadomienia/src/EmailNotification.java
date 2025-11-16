public class EmailNotification implements Notification {
    private String recipient;
    private String message;

    public EmailNotification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    @Override
    public void send() {
        System.out.println("Wysłano e-mail do " + recipient + " : " + message);
    }
}
