import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {


        ArrayList<Contact> lc= new ArrayList<Contact>();
        lc.add(new Contact(1, "Iker Casillas", "Star", "Spain", "1234567890", "Iker", "Casillas"));
        lc.add(new Contact(2, "John Terry", "Star", "England", "1234567890", "John", "Terry"));
        lc.add(new Contact(3, "Raul Gonzalez", "Star", "Spain", "1234567890", "Raul", "Gonzalez"));
        while (true) {
            int choice = Menu.menu();

            switch (choice) {
                case 1:
                    ContactList.createContact(lc);
                    System.out.println();
                    break;
                case 2:
                    ContactList.printAllContact(lc);
                    System.out.println();
                    break;
                case 3:
                    ContactList.deleteContact(lc);
                    System.out.println();
                    break;
                case 4:
                    return;    
            }

        }


    }
}
