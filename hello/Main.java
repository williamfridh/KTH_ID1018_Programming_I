import java.util.Scanner;

/**
 * Abstracts
 */
abstract class MainAbstract {
    public static String text(String name) {
        return "Hello " + name + "!";
    }
}

/**
 * Interfaces
 */
interface MainInterface {
    public static void Main(){};
}

public class Main extends MainAbstract implements MainInterface {
    public static void main(String[] args) {
        try (Scanner myObhj = new Scanner(System.in)) {
            System.out.println("What's your name?");
            String name = myObhj.nextLine();
            String str = text(name);
            System.out.println(str);
        }
    }
}

