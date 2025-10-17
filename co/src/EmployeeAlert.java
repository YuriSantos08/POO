public class EmployeeAlert {
    private NotificationService notifier;

    public EmployeeAlert(NotificationService notifier) {
        this.notifier = notifier;
    }
    public void alert(String msg) {
        notifier.send(msg);
    }
}