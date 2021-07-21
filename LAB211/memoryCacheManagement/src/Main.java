public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        FuMemoryCached fuMemoryCached = new FuMemoryCached();
        fuMemoryCached.putObject("Hoang Long", "GoodJob", 1);
        fuMemoryCached.putObject("Nobita", "GoodJob", 999);
        fuMemoryCached.putObject("IronMan", "GoodJob", 11000);
        System.out.println(fuMemoryCached.getObject("Long"));
        System.out.println(fuMemoryCached.getObject("Nobita"));
        System.out.println(fuMemoryCached.getObject("Lien"));
        System.out.println(System.currentTimeMillis());

        System.err.println("error");
    }
}
