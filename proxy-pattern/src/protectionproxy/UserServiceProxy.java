package protectionproxy;

public class UserServiceProxy implements UserService{
    private String role;
    private UserService userService;

    public UserServiceProxy(String role, String name) {
        this.role = role;
        userService = new UserServiceImpl(name);
    }

    @Override
    public void load() {
        userService.load();
    }

    @Override
    public void insert() {
        if(isAdmin()){
            userService.insert();
        }else {
            System.out.println("ERROR: Access Denied");
        }
    }
    private boolean isAdmin(){
        return "admin".equalsIgnoreCase(this.role);
    }
}
