public class Main {
    public static void main(String[] args) {
        int height = 5;
        int width = 10;

        while (height > 0){
            while (width > 0){
                System.out.print("Q");
                width--;
            }
            System.out.println("Q");
            height--;
            width = 10;
        }
    }
}