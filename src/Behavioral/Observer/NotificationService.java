package Behavioral.Observer;

import java.util.*;

// normal with generic
public class NotificationService {
    private final List<EventListener> customers;

    public NotificationService(){
        customers = new ArrayList<>();
    }

    public void subscribe(EventListener listener){
        customers.add(listener);
    }

    public void unsubscribe(EventListener listener){
        customers.remove(listener);
    }

    public void Notify() {
        customers.forEach(listener -> listener.update());
    }
}

// map with generic
//public class NotificationServiceTest {
//    private Map<Event, EventListener> customers;
//
//    public void NotificationService(){
//        customers = new HashMap<Event, EventListener>();
//        Arrays.stream(Event.values()).forEach(event->customers.put(event, (EventListener) new ArrayList<EventListener>()));
//    }
//
//    public void subscribe(Event eventType, EventListener listener){
//        customers.get(eventType).add(listener);
//    }
//
//    public void unsubscribe(Event eventType, EventListener listener){
//        customers.get(eventType).remove(listener);
//    }
//
//    public void Notify(Event eventType) {
//        customers.get(eventType).forEach(listener->listener.update(eventType));
//    }
//}

// no generic listener
//public class NotificationService {
//    private final List<EmailMsgListener> customers;
//
//    public NotificationService(){
//        customers = new ArrayList<>();
//    }
//
//    public void subscribe(EmailMsgListener listener){
//        customers.add(listener);
//    }
//
//    public void unsubscribe(EmailMsgListener listener){
//        customers.remove(listener);
//    }
//
//    public void Notify() {
//        customers.forEach(listener -> listener.update());
//    }
//}
