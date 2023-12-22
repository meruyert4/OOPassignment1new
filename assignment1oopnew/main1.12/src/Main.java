public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number <= 100){
            if(number%3!=0){
                number++;
                continue;
            }
            else {
                sum += number;
            }
            number++;
        }
        System.out.println(sum);
    }
}