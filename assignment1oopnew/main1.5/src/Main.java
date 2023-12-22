import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("temperature: ");
        int input = Integer.parseInt(scanner.nextLine());
        if( input < 0 || input==0){
            System.out.println("it's cold outside ");
        }
        else{
            System.out.println("it's warm outside ");
        }
        scanner.close();
    }
}