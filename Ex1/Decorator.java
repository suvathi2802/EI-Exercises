interface Notifier {
 void send(String message);
}

//Concrete Component
class BasicNotifier implements Notifier {
 @Override
 public void send(String message) {
     System.out.println("Basic Notification: " + message);
 }
}

//Base Decorator
class NotifierDecorator implements Notifier {
 protected Notifier notifier;

 public NotifierDecorator(Notifier notifier) {
     this.notifier = notifier;
 }

 @Override
 public void send(String message) {
     notifier.send(message);
 }
}

//Concrete Decorator
class EmailNotifier extends NotifierDecorator {
 public EmailNotifier(Notifier notifier) {
     super(notifier);
 }

 @Override
 public void send(String message) {
     super.send(message);
     System.out.println("Email Notification: " + message);
 }
}

//Main Class
public class Decorator {
 public static void main(String[] args) {
     Notifier notifier = new EmailNotifier(new BasicNotifier());
     notifier.send("Meeting at 10 AM");
 }
}
