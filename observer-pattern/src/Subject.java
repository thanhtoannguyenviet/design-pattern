import java.util.*;

public class Subject {
    private String notifyInformation;
    private List<Observer> observerList = new ArrayList<>();
    public void attach(Observer observer){
        observerList.add(observer);
    }
    public void detach(Observer observer){
        observerList.remove(observer);
    }
    public void notifyChange(){
        for(Observer obs : observerList){
            obs.update(notifyInformation);
        }
    }

    public String getNotifyInformation() {
        return notifyInformation;
    }

    public void setNotifyInformation(String notifyInformation) {
        this.notifyInformation = notifyInformation;
    }
}
