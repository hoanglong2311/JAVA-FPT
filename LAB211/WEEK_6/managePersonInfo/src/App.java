public class App {
    public static void main(String[] args) throws Exception {
        int n = Validate.checkInputNumberPerson();
        Person[] persons = new Person[n];
        PersonWrapper[] listPersonWrapper = new PersonWrapper[persons.length];

        while (true) {
            int menu = Menu.menu();
            switch (menu) {
                case 1:
                    for (int i = 0; i < persons.length; i++) {
                        persons[i] = Manage.inputPersonInfo();
                    }
                    break;
                case 2:
                    System.out.println();
                    Manage.sortBySalary(persons, listPersonWrapper);
                    for (int i = 0; i < persons.length; i++) {
                        listPersonWrapper[i].p.displayPersonInfo();;
                    }
                    break;
                case 3:
                    return;
            }
        }
        
    }
}
