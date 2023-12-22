import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("temperature: ");
        float temp = Float.parseFloat(scanner.nextLine());

        boolean isHigh = temp > 38.0;
        boolean isLow = temp < 35.0;

        if (isHigh) {
            System.out.println("high body temperature");
        } else if (isLow) {
            System.out.println("low body temperature");
        } else {
            System.out.println("normal body temperature");
        }

        scanner.close();
    }
}