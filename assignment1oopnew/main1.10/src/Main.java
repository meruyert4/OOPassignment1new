import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter integers ");
        int counter = 0;
        while (true) {
            String input = scanner.next();
            if (input.equals("ENTER")) {
                break;
            }
            else {
                int number = Integer.parseInt(input);
                counter += number;
            }
        }
        System.out.println(counter);
    }
}