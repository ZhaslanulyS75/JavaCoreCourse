import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Write first number: ");
        int x = new Scanner(System.in).nextInt();

        System.out.print("Write second number: ");
        int y = new Scanner(System.in).nextInt();

        if (x > 5 && y > 5) {
            System.out.println("x and y are more than 5");
        } else if (x < 5 && y < 5) {
            System.out.println("x or y is less than 5");
        } else {
            System.out.println("Nothing");
        }

    }
}
