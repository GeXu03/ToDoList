import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ToDoList toDoList=new ToDoList();
        Scanner scanner=new Scanner(System.in);

        toDoList.loadFromFile("todolist.dat");

        while(true){
            System.out.println("To-Do List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Remove Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice= scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Enter task name: ");
                    String taskName= scanner.nextLine();
                    System.out.println("Enter task description: ");
                    String taskDescription=scanner.nextLine();
                    Task newTask=new Task(taskName,taskDescription);
                    toDoList.addTask(newTask);
                    break;
                case 2:
                    System.out.println("Current Tasks:");
                    toDoList.viewTasks();
                    break;
                case 3:
                    System.out.println("Enter the index of the task to mark as completed:");
                    toDoList.markAsCompleted(scanner.nextInt());
                    break;
                case 4:
                    System.out.println("Enter the index of the task to remove:");
                    toDoList.removeTask(scanner.nextInt());
                    break;
                case 5:
                    toDoList.saveToFile("todolist.dat");
                    System.out.println("Exiting To-Do List. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}
