import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ArrayList<Task> lt = new ArrayList<>();
        // int id =1;
        // int choice = Menu.menu();
        int id = 1;
        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    Manager.addTask(lt, id);
                    id++;
                    break;
                case 2:
                    Manager.deleteTask(lt, id);
                    id--;
                    break;
                case 3:
                    Manager.print(lt);
                    break;
                case 4:
                    return;
    
            }
        }
        
    }
}
