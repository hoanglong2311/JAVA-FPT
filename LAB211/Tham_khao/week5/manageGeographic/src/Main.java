
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<Country> lc = new ArrayList<>();
        // lc.add(new Country("Nice", "VN", "Viet Nam" , 331212));
        lc.add(new Country("Nice", "BRU", "Brunei" , 5765));
        lc.add(new Country("Nice", "INDO", "Indonesia" , 1860360));
        lc.add(new Country("Nice", "MYA", "Myanmar" , 676578));
        lc.add(new Country("Nice", "THAI", "Thailand" , 513120));
        lc.add(new Country("Nice", "MALAY", "Malaysia" , 330803));
        //loop until user want to exist
        while (true) {
            int choice = ManageEastAsiaCountries.menu();
            switch (choice) {
                case 1:
                    ManageEastAsiaCountries.inputCountry(lc);
                    break;
                case 2:
                    ManageEastAsiaCountries.printCountry(lc);
                    break;
                case 3:
                    ManageEastAsiaCountries.searchByName(lc);
                    break;
                case 4:
                    ManageEastAsiaCountries.printCountrySorted(lc);
                    break;
                case 5:
                    return;
            }
        }
    }
}
