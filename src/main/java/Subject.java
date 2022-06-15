import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observerList = new ArrayList<>();
    public void attach(Observer observer) {
        observerList.add(observer);
    }
    public void detach(Observer observer) {
        observerList.remove(observer);
    }
    public void notifyChange(String message) {
        for(Observer observer : observerList) {
            observer.update(message);
        }
    }
}
