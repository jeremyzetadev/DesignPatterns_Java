package Behavioral.ChainResponsibility;

import java.io.IOException;

public class ChainResponsibilityInstance {

    public static void main(String[]  args) throws IOException{
        Database database = new Database();
        Handler handler = new UserExistHandler(database)
                .setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler(database));
        AuthService service = new AuthService(handler);
        service.logIn("username", "password");
    }
}
