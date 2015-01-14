
public interface MailistNotificationSubject {
	
	public void addObserver(MailistNotificationObserver mailistNotificationObserver);
	public void removeObserver(MailistNotificationObserver mailistNotificationObserver);
	public void doNotify();
}
