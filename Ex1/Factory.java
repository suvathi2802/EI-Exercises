interface Task {
 void execute();
}

//Concrete Product: ExerciseTask
class ExerciseTask implements Task {
 @Override
 public void execute() {
     System.out.println("Executing Exercise Task");
 }
}

//Concrete Product: MeetingTask
class MeetingTask implements Task {
 @Override
 public void execute() {
     System.out.println("Executing Meeting Task");
 }
}

//Factory Class
class TaskFactory {
 public Task createTask(String type) {
     switch (type) {
         case "exercise": return new ExerciseTask();
         case "meeting": return new MeetingTask();
         default: throw new IllegalArgumentException("Unknown task type");
     }
 }
}

//Main Class
public class Factory {
 public static void main(String[] args) {
     TaskFactory factory = new TaskFactory();
     Task task = factory.createTask("exercise");
     task.execute();
 }
}
