import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Worker> lw = new ArrayList<>();
        ArrayList<History> lh = new ArrayList<>();

        lw.add(new Worker("W 1", "Quang", 20, 1300, "Viet Nam"));
        lw.add(new Worker("W 2", "Hau", 20, 1300, "Viet Nam"));
        lw.add(new Worker("W 3", "Men", 20, 1300, "Viet Nam"));


        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    ManageWorker.addWorker(lw);
                    System.out.println();
                    break;
                case 2:
                    ManageWorker.changeSalary(lw, lh, 1);
                    System.out.println();
                    //1 là thể hiện cho việc tăng lương
                    break;
                case 3:
                    ManageWorker.changeSalary(lw, lh, 2);
                    System.out.println();
                    //2 ki hieu cho giam luong
                    break;
                case 4:
                    ManageWorker.printListHistory(lh);
                    System.out.println();
                    break;
                case 5:
                    return;
            }
        }
    }
}

