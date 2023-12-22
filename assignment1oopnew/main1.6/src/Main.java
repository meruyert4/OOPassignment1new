import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = scanner.nextLine();

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Your age: ");
        int age = Integer.parseInt(scanner.nextLine());

        if(age >= 18 && age <= 28){
            System.out.println(name + ", come to the military registration and enlistment office");
        }

        scanner.close();
    }
}