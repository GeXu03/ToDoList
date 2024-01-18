import java.io.*;
import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Task> tasks;
    private int count=0;
    public ToDoList(){
        this.tasks=new ArrayList<>();
    }

    public void addTask(Task task){
        task.setId(count++);
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

    public void saveToFile(String fileName){
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fileName))){
            oos.writeObject(tasks);
            System.out.println("ToDoList saved to file: "+fileName);
        }catch (IOException e){
            System.out.println("Error saving ToDoList to file: "+e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public void loadFromFile(String fileName){
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fileName))){
            tasks=(ArrayList<Task>)ois.readObject();
            System.out.println("ToDoList loaded from file: "+fileName);
        }catch (IOException|ClassNotFoundException e){
            System.out.println("Error loading ToDoList from file: "+e.getMessage());
        }
    }
}
