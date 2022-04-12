import java.util.Scanner;

public class GlobalVariable {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        echoSomeInput();
    }

    public static void echoSomeInput() {
        echoInteger();
        echoString();
    }

    public static void echoInteger() {
        int input = scanner.nextInt();
        System.out.println(input);
    }

    public static void echoString() {
        String input = scanner.nextLine();
        System.out.println(input);
    }
}
