public class Hello {

    public static int counter = 0;

    public static void world() {
        System.out.println("Hello World!!!");
    }

    public static void evgeniy() {
        System.out.println("Привет Женя!");
    }

    public static void alex() {
        counter++;
        System.out.println("Привет Саша " + counter + " !");
    }
}
