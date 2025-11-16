public class Main {
    public static void main(String[] args) {

        Notification[] notifications = {
            new EmailNotification("alice@example.com", "Masz nowe powiadomienie."),
            new SMSNotification("123456789", "Twoja paczka została wysłana."),
            new PushNotification("BobAppUser", "Nowa wiadomość w aplikacji.")
        };

        for (Notification n : notifications) {
            n.send();
        }
    }
}
