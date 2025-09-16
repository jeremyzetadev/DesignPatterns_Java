package Behavioral.ChainResponsibility;

public class RoleCheckHandler extends Handler{
    private Database database;
    public RoleCheckHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password){
        if("admin_username".equals(username)){
            System.out.println("Loading Admin Page...");
            return true;
        }
        System.out.println("Loading Default PAge...");
        return handleNext(username, password);
    }
}
