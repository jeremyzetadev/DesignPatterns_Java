package Behavioral.Observer;

import lombok.Data;

@Data
public class Store {
    private final NotificationService notificationService;

    public Store(){
        notificationService = new NotificationService();
    }

    public void newItemPromotion(){
       notificationService.Notify();
    }

    public NotificationService getService(){
        return notificationService;
    }
}
