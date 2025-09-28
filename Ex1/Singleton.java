class ScheduleManager {
 private static ScheduleManager instance;

 private ScheduleManager() {}

 public static ScheduleManager getInstance() {
     if (instance == null) {
         instance = new ScheduleManager();
     }
     return instance;
 }

 public void addTask(String task) {
     System.out.println("Task added: " + task);
 }
}

//Main Class
public class Singleton {
 public static void main(String[] args) {
     ScheduleManager manager = ScheduleManager.getInstance();
     manager.addTask("Morning Exercise");
 }
}