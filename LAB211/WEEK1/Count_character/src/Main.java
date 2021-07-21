import java.util.Scanner;


    public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Counter counter = new Counter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your content: ");
        String content = scanner.nextLine();
        // counter.input();
        counter.analyze(content);
        counter.display();
        scanner.close();
    }
}
