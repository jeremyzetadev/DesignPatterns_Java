package Behavioral.Command;

public class CommandInstance {
    public static void main(String[] args){
        // INIT AS ROOM
        Room livingRoom = new LivingRoom();
        livingRoom.setCommand(new SwitchLightsCommand(new Light()));
        livingRoom.executeCommand();

        // INIT AS LIVING ROOM -->> not USUAL, design patterns use the generalized form of object to transform data
//        LivingRoom livingRoom_ = new LivingRoom();
//        livingRoom_.setCommand(new SwitchLightsCommand(new Light()));
//        livingRoom_.executeCommand();
    }
}
