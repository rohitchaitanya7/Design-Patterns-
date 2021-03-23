package Observation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Observer p=new Admin("rohit");
		Observer d = new Admin("Pavan");
		Observer rahul=new Admin("Rahul");
		
		INotificationService notificationService = new NotificationService();
		
		notificationService.addSubscriber(p);
		notificationService.addSubscriber(d);
		notificationService.addSubscriber(rahul);
		
		notificationService.notifySubscriber();
		notificationService.removeSubscriber(rahul);
		
		

	}

}
