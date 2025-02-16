import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        это
        пример
        многострочного
        комментария
        */

        // Эта строчка кода печатает в консоль фразу "Hello, Java!"
        // System.out.println("Hello, Java!");

        /*
        System.out.println(23);
        System.out.println(2 + 3);
        System.out.println(9 - 3);
        System.out.println(2 * 3);
        System.out.println(7 / 2);
        System.out.println(7 / 2.0);
        System.out.println((3 + 5) * 2);
        System.out.println("3" + 1);
        */

        /*
        System.out.println("Конвертер ГБ в МБ");
        System.out.print("Введите ГБ: ");
        int gb = new Scanner(System.in).nextInt();
        int mb = gb * 1024;
        System.out.println("В " + gb + " ГБ: " + mb + " МБ");
        */

        System.out.println("Программма для подсчета BMI");

        System.out.print("Введите вес (кг): ");
        double weight = new Scanner(System.in).nextDouble();

        System.out.print("Введите рост (м): ");
        double height = new Scanner(System.in).nextDouble();

        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);
    }
}
