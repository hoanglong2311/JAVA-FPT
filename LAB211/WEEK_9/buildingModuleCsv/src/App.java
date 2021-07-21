import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<CSV> ls = new ArrayList<>();
        ls.add(new CSV(1, "Nguyen Hoang Long", "hoanglong@gmail.com", "'0123456789", "Quang Ning-  QUang binh"));
        ls.add(new CSV(2, "nguyen    HoAng      LONG", "   hoanglong@gmail.com", "'0123456789", "QuAng    NIng   -  QUang    BiNh"));
        ls.add(new CSV(3, "nguyen    HoAng      LONG", "   hoanglong@gmail.com    ", "0123456789", "      QuAng    NIng   -  QUANG    BiNh"));
        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    Processing.importFile(ls);
                    Processing.print(ls);
                    break;
                case 2:
                    Processing.formatAddresses(ls);;
                    Processing.print(ls);
                    break;
                case 3:
                    Processing.formatName(ls);
                    Processing.print(ls);
                    break;
                case 4:
                    Processing.exportFile(ls);
                    break;
                case 5:
                    return;
                default:
                    break;
            }
        }
    }
}
