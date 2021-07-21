import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
    
    
        ArrayList<Country> listCountry = new ArrayList<>();
        // listCountry.add(new EastAsiaCountries("VN", "Viet Nam", 331212, "Nice"));
        listCountry.add(new EastAsiaCountries("BRU", "Brunei", 5765, "Nice"));
        listCountry.add(new EastAsiaCountries("INDO", "Indonesia", 1860360, "Nice"));
        listCountry.add(new EastAsiaCountries("MYA", "Myanmar", 676578, "Nice"));
        listCountry.add(new EastAsiaCountries("THAI", "Thailand", 513120, "Nice"));
        listCountry.add(new EastAsiaCountries("MALAY", "Malaysia", 330803, "Nice"));

        while (true) {
            int choice = ManageEastAsiaCountries.menu();
            switch (choice) {
                case 1:
                    ManageEastAsiaCountries.inputCountry(listCountry);
                    break;
                case 2:
                    ManageEastAsiaCountries.displayCountry(listCountry);
                    break;
                case 3:
                    ManageEastAsiaCountries.searchByName(listCountry);
                    break;
                case 4:
                    ManageEastAsiaCountries.displayCountrySort(listCountry);
                    break;
                case 5:
                    System.exit(1);
                    return;    
            }
        }
    
    }

}
