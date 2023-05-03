package protectionproxy;

public class Main {
    public static void main(String[] args) {
        UserService admin = new UserServiceProxy("admin", "Toan");
        admin.insert();
        admin.load();

        UserService customer = new UserServiceProxy("customer", "guest");
        customer.insert();
        customer.load();
    }
}
