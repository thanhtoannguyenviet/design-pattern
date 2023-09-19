public class UserImpl extends User{


    public UserImpl(ChatMediator chatMediator, String user) {
        super(chatMediator,user);
    }

    @Override
    public void send(String msg) {
        System.out.println("---");
        System.out.println(this.name + "is send the msg: " + msg);
        mediator.sendMessage(msg,this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name+" received the msg: "+msg);
    }
}
