import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ManageEastAsiaCountries {
    private final static Scanner input = new Scanner(System.in);

    public static int menu() {
        // 1. Input the information of 11 countries in East Asia
        // 2. Display the information of country you've just input
        // 3. Search the information of country by user-entered name
        // 4. Display the information of countries sorted name in ascending order
        // 5. Exit 
        System.out.println("                                    MENU                                  ");
        System.out.println("==========================================================================");
        System.out.println("1. Input the information of 11 countries in East Asia");
        System.out.println("2. Display the information of country you've just input");
        System.out.println("3. Search the information of country by user-entered name");
        System.out.println("4. Display the information of countries sorted name in ascending order ");
        System.out.println("5. Exit ");
        System.out.println("==========================================================================");

        System.out.print("Enter your choice: ");
        int choice = checkInputLimit(1,5);
        return choice;
    }


    //check kiem tra so nhap vao co dat yeu cau hay khong
    public static int checkInputLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(input.nextLine().trim());
                if (result < min || result > max) {
                     throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                //TODO: handle exception
                System.err.println("Enter number in range [ " + min + ", " + + max +"]");
                System.out.print("Enter your choice again: ");
            }
        }
    }


    //check đầu vào của string
    public static String checkInputString() {
        while (true) {
            String result = input.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Is Empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }


    //Kiem tra đầu vào của float xem có đung hay khổng
    public static float checkInputFloat(float min) {
        while (true) {
            try {
                float result = Float.parseFloat(input.nextLine().trim());
                if (result <= min) {
                    throw new NumberFormatException();
               }
                return result;
            } catch (Exception e) {
                //TODO: handle exception
                System.err.println("Area of country must be > 0 (float) !!!");
                System.out.print("Enter again: ");
            }
        }
    }
    

    //kiêm tra xem countryCode đã tồn tại ay chưa trong listCountry
    public static boolean checkCountryExists(ArrayList<Country> listCountry, String countryCode) {
        
        for (Country country : listCountry) {
            if (country.getCountryCode().equalsIgnoreCase(countryCode)) {
                return false;
            }
        }
        return true;
    }



    public static void inputCountry(ArrayList<Country> listCountry) {
        System.out.println("Enter code of country: ");
        String countryCode = checkInputString();
        if (!checkCountryExists(listCountry, countryCode)) {
            System.err.println("Country exist.");
            return;
        }

        System.out.println("Enter name of country: ");
        String countryName = checkInputString();

        System.out.println("Enter total Area: ");
        float countryArea = checkInputFloat(0);


        System.out.println("Enter terrain of country: ");
        String countryTerrain = checkInputString();
        listCountry.add(new EastAsiaCountries(countryCode, countryName, countryArea, countryTerrain));
        
        //thêm dữ liệu có sẵn
        

        System.out.println("Successfully!!");
    }


    //hiển thị ra thông tin của country
    public static void displayCountry(ArrayList<Country> listCountry) {
        //
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
        "Terrain");
        // for (Country country : listCountry) {
            // country.display();
        // }
        // for (int i = 0; i < listCountry.size(); i++)  {
        //     listCountry.get(listCountry.size() - 1).display();
        //     return;
        // }
        listCountry.get(listCountry.size() - 1).display();
        // Iterator<Country> iterator = listCountry.iterator();

        // System.out.println((String) iterator.next());
    }


    public static void displayCountrySort(ArrayList<Country> listCountry) {
        // Collections.sort(listCountry, Comparator.comparing(Country::getCountryName) );
        Collections.sort(listCountry);

        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        for (Country country : listCountry) {
            country.display();
        }

    }


    public static void searchByName(ArrayList<Country> listCountry) {
        System.out.print("Enter the name you want to search for: ");
        String countryName = checkInputString();
        ArrayList<Country> searchList = new ArrayList<>();
        for (Country country : listCountry) {
            // if (country.getCountryName().equalsIgnoreCase(countryName)) {
            //     country.display();
            // }
            if(country.getCountryName().toLowerCase().contains(countryName.toLowerCase())){
                searchList.add(country);
            }
        }
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        for (Country country : searchList) {
            country.display();
        }





    }






}
