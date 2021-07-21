

class PersonWrapper {

    Person p;

    public PersonWrapper() {
    }

    public PersonWrapper(Person p) {
        this.p = p;
    }
}




public class Manage {
    
    public static Person inputPersonInfo() {
        System.out.println("Input Information of Person");
        System.out.print("Please input name: ");
        String name = Validate.checkInputString();
        System.out.print("Please input address: ");
        String address = Validate.checkInputString();
        System.out.print("Please input salary: ");
        double salary = Validate.checkInputSalary();
        return new Person(name, address, salary);
    }

    public static void swap(PersonWrapper person1,PersonWrapper person2) {
        Person temp= person1.p;
        person1.p = person2.p;
        person2.p = temp;
    }

    public static void sortBySalary(Person[] persons, PersonWrapper[] listPersonWrapper) {
        int n = persons.length;
        for (int i = 0; i < persons.length; i++) {
            listPersonWrapper[i] = new PersonWrapper(persons[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (listPersonWrapper[i].p.getSalary() > listPersonWrapper[j].p.getSalary()) {
                    swap(listPersonWrapper[i], listPersonWrapper[j]);
                }
            }
        }
        return;
    }


}
