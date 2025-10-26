import java.util.*;
public class todolist
{
    private List<String> tasks;
    public todolist() {
        tasks = new ArrayList<>();
    }
    public void addTask(String task) {
        tasks.add(task);
    }
    public void removeTask(String task) {
        tasks.remove(task);
    }
    public List<String> getTasks() {
        return tasks;
    }
    public static void main(String[] args) {
       todolist mylist=new todolist();
       Scanner scanner=new Scanner(System.in);
         while(true) {
              System.out.println("1. Add Task");
              System.out.println("2. Remove Task");
              System.out.println("3. View Tasks");
              System.out.println("4. Exit");
              System.out.print("Choose an option: ");
              int choice = scanner.nextInt();
              scanner.nextLine(); // Consume newline
              switch(choice) {
                case 1:
                     System.out.print("Enter task to add: ");
                     String taskToAdd = scanner.nextLine();
                     mylist.addTask(taskToAdd);
                     break;
                case 2:
                     System.out.print("Enter task to remove: ");
                     String taskToRemove = scanner.nextLine();
                     mylist.removeTask(taskToRemove);
                     break;
                case 3:
                     System.out.println("Tasks:");
                     for(String task : mylist.getTasks()) {
                          System.out.println("- " + task);
                     }
                     break;
                case 4:
                     System.out.println("Exiting...");
                     scanner.close();
                     return;
                default:
                     System.out.println("Invalid option. Please try again.");
              }
         }
    }
}