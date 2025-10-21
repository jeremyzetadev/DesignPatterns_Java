package Behavioral.Observer;

public class EmailMsgListener implements EventListener {
    private final String email;

    public EmailMsgListener(String email){
        this.email = email;
    }

    @Override
    public void update(){

    }

    @Override
    public void update(Event eventType) {

    }
}

// no generic listener
//public class EmailMsgListener {
//    private final String email;
//
//    public EmailMsgListener(String email){
//        this.email = email;
//    }
//
//    public void update(){
//
//    }
//}
