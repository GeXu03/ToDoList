import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Task> tasks;

    public ToDoList(){
        this.tasks=new ArrayList<>();
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    public void viewTasks(){
        for(Task task:tasks){
            System.out.println(task);
            System.out.println("---------------");
        }
    }

    public void markAsCompleted(int index){
        if(index>=0&&index< tasks.size()){
            Task task=tasks.get(index);
            task.setCompleted(true);
        }else{
            System.out.println("Invalid task index.");
        }
    }

    public void removeTask(int index){
        if(index>=0&&index<tasks.size()){
            tasks.remove(index);
        }else{
            System.out.println("Invalid task index.");
        }
    }
}
