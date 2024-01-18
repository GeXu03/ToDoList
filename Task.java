public class Task {
    private String taskName;
    private String taskDescription;
    private boolean isCompleted;
    private int id;

    public Task(String taskName,String taskDescription,int id){
        this.taskName=taskName;
        this.taskDescription=taskDescription;
        this.isCompleted=false;
        this.id=id;
    }

    public String getTaskName(){
        return taskName;
    }

    public void setTaskName(String taskName){
        this.taskName=taskName;
    }

    public String getTaskDescription(){
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription){
        this.taskDescription=taskDescription;
    }

    public boolean isCompleted(){
        return isCompleted;
    }

    public void setCompleted(boolean completed){
        isCompleted=completed;
    }

    public int getId(){
        return id;
    }

    public String toString(){
        return "ID: "+id+"\nTask: "+taskName+"\nDescription: "+taskDescription+"\nCompleted: "+isCompleted;
    }
}
