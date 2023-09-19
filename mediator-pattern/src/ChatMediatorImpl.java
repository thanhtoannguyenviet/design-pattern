import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{
    public ChatMediatorImpl(String groupName) {
        System.out.println(groupName + "is created");
    }

    List<User> userList = new ArrayList<>();
    @Override
    public void sendMessage(String msg, User user) {
        for(User u : userList){
            if(!u.equals(user)){
                u.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        System.out.println(user.name + "joined the group");
        userList.add(user);
    }
}
