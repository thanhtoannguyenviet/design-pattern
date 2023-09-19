import java.util.function.Function;


public class TaskService {
    private State state;
    public void setState(State state){
        this.state = state;
    }
    public void handleRequest(){
       state.handleRequest();
    }
}
