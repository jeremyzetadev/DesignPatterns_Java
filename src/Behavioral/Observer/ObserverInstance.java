package Behavioral.Observer;

public class ObserverInstance {
    void Main(){
        Store store = new Store();
        store.getNotificationService().subscribe(new EmailMsgListener("geekific@like.com"));
        store.getNotificationService().subscribe(new EmailMsgListener("geekific@subs.com"));
        store.getNotificationService().subscribe(new MobileAppListener("GeekificLnS"));
        store.newItemPromotion();
    }
}
