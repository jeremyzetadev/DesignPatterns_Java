package Behavioral.ChainResponsibility;

public class UserExistHandler extends Handler{
    private Database database;
    public UserExistHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password){
        if(!database.isValidUser(username)){
            System.out.println("This username is not registered");
            System.out.println("Sing up to our app now!");
            return false;
        }
        return handleNext(username, password);
    }
}
