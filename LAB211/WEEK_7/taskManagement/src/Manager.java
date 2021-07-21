import java.util.ArrayList;

public class Manager {
    public static void addTask(ArrayList<Task> lt, int id) {
        System.out.println("\n------------Add Task---------------");
        System.out.print("Enter Requirement Name: ");
        String requirementName = Validate.checkInputString();
        System.out.print("Enter Task Type: ");
        String taskTypeId = Validate.checkInputTaskTypeId();
        System.out.print("Enter Date: ");
        String date = Validate.checkInputDate();
        System.out.print("Enter From: ");
        String planFrom = Validate.checkInputPlan();
        System.out.print("Enter To: ");
        String planTo = Validate.checkInputPlan();
        System.out.print("Enter Assignee: ");
        String assign = Validate.checkInputString();
        System.out.print("Enter Reviewer: ");
        String reviewer =Validate.checkInputString();
        lt.add(new Task(id, taskTypeId, requirementName, date, planFrom, planTo, assign, reviewer));
        System.out.println("Add Task Success.");
    }

    private static int findTaskExist(ArrayList<Task> lt) {
        System.out.print("ID: ");
        int id = Validate.checkInputInt();
        for (int i = 0; i < lt.size(); i++) {
            if (lt.get(i).getId() == id) {
                return i;
            }
        }
        System.err.println("Not found.");
        return -1;
    }

    public static void deleteTask(ArrayList<Task> lt, int id) {
        System.out.println("\n---------Del Task------");
        if (lt.isEmpty()) {
            System.err.println("List is empty");
            return;
        }
        int findId = findTaskExist(lt);
        if (findId != -1) {
            lt.remove(findId);
            for (int i = findId; i < lt.size(); i++) {
                lt.get(i).setId(lt.get(i).getId() - 1);
            }
            System.err.println("Delete success.");
        }
    }


    public static void print(ArrayList<Task> lt) {
        System.out.println("\n----------------------------------------- Task ---------------------------------------");
        if (lt.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        System.out.printf("%-5s%-15s%-15s%-15s%-15s%-15s%-15s\n",
                "ID", "Name", "Task Type", "Date", "Time", "Assign", "Reviewer");
        for (int i = 0; i < lt.size(); i++) {
            System.out.printf("%-5d%-15s%-15s%-15s%-15.1f%-15s%-15s\n",
                    lt.get(i).getId(),
                    lt.get(i).getRequirementName(),
                    lt.get(i).getTaskTypeId(),
                    lt.get(i).getDate(),
                    Double.parseDouble(lt.get(i).getPlanTo()) - Double.parseDouble(lt.get(i).getPlanFrom()),
                    lt.get(i).getAssign(),
                    lt.get(i).getReviewer()
            );

        }
    }
}
