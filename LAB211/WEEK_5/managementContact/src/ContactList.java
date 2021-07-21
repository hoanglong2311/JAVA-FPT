import java.util.ArrayList;

public class ContactList {
    
    public static void createContact(ArrayList<Contact> lc){
        System.out.println("-------- Add a Contact --------");
        System.out.print("Enter First Name: ");
        String firstName = Validation.checkInputString();
        System.out.print("Enter Last Name: ");
        String lastName = Validation.checkInputString();
        System.out.print("Enter Group: ");
        String group = Validation.checkInputString();
        System.out.print("Enter Address: ");
        String address = Validation.checkInputString();
        System.out.print("Enter Phone: ");
        String phone = Validation.checkInputPhone();
        int id = lc.size();
        id++;
        lc.add(new Contact(id, firstName +" " + lastName, group, address,
        phone, firstName, lastName));
        System.out.println("Successful.");
    }

    public static void printAllContact(ArrayList<Contact> lc) {
        System.out.println("--------------------------------- Display all Contact ----------------------------");
        System.out.printf("%-5s%-25s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Name",
                                "First name", "Last name", "Group", "Address", "Phone");
        for (Contact contact : lc) {
            System.out.printf("%-5d%-25s%-20s%-20s%-20s%-20s%-20s\n",
                    contact.getContactId(), contact.getFullName(),
                    contact.getFirstName(), contact.getLastName(),
                    contact.getGroup(), contact.getAddress(), contact.getPhone());
        }
    }

    public static Contact getContactById(ArrayList<Contact> lc, int idDelete) {
        for (Contact contact : lc) {
            if (contact.getContactId() == idDelete) {
                return contact;
            }
        }
        return null;
    }

    public static void deleteContact(ArrayList<Contact> lc) {
        System.out.println("------- Delete a Contact -------");
        System.out.print("Enter ID: ");
        int idDelete = Validation.checkInputInt();
        Contact contactDelete = getContactById(lc, idDelete);
        if (contactDelete == null) {
            System.err.println("No found contact");
            return;
        } else {
            lc.remove(contactDelete);
            System.err.println("Delete successful.");
        }
    }

    
}
