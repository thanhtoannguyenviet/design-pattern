import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Originator.Memento> savedStates = new ArrayList<>(); // caretaker

        Originator originator = new Originator();
        originator.set("State #1");
        originator.set("State #2");
        savedStates.add(originator.saveToMemento());
        originator.set("State #3");
        savedStates.add(originator.saveToMemento());
        originator.set("State #4");

        originator.restoreFromMemento(savedStates.get(1)); // This point need roll back
    }
}