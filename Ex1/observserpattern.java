import java.util.ArrayList;
import java.util.List;

// Subject
class TaskManager {
    private List<Observer> observers = new ArrayList<>();
    private String state;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}
public interface Observer {
	void update(String state);
}

// Concrete Observer
class TaskLogger implements Observer {
    @Override
    public void update(String state) {
        System.out.println("Task state changed: " + state);
    }
}

// Main Class
public class ObserverPattern {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.addObserver(new TaskLogger());
        taskManager.setState("Task added");
    }
}