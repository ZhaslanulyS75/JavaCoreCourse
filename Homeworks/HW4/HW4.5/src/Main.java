import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Конвертер валют");

        System.out.println("Введите рубли: ");
        int rubles = new Scanner(System.in).nextInt();

        System.out.println("Введите курс доллара: ");
        double dollarRate = new Scanner(System.in).nextDouble();

        System.out.println("Введите курс евро: ");
        double euroRate = new Scanner(System.in).nextDouble();

        double dollars = rubles / dollarRate;
        double euros = rubles / euroRate;

        System.out.println("Значение в долларах: " + dollars);
        System.out.println("Значение в евро: " + euros);
    }
}
