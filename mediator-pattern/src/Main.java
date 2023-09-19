public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl("Group1");
        User admin = new UserImpl(mediator,"Admin");
        User user1 = new UserImpl(mediator,"user 1");
        User user2 = new UserImpl(mediator, "user 2");
        User user3 = new UserImpl(mediator, "user 3");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(admin);

        admin.send("Hi all");
        user1.send("Hi Admin");


    }
}