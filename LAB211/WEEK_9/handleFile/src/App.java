public class App {
    public static void main(String[] args) throws Exception {
        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    Processing.checkPath();
                    break;
                case 2:
                    Processing.getAllFileNameJavaInDirectory();;
                    break;
                case 3:
                    Processing.getFilewithSizeGreaterThanInput();;
                    break;
                case 4:
                    Processing.writeMoreContentToFile();;
                    break;
                case 5:
                    Processing.countCharacters();
                    break;
                case 6:
                    return;
                default:
                    break;
            }
        }
    }
}
