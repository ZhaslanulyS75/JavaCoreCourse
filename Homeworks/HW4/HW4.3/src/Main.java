import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Калькулятор для вычисления суммы, разности и частного двух чисел");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double secondNumber = scanner.nextDouble();

        System.out.print("Введите число. Сложение (1), вычитание (2) либо деление (3): ");
        int operator = scanner.nextInt();

        double result = 0;

        if (operator == 1) {
            result = firstNumber + secondNumber;
        } else if (operator == 2) {
            result = firstNumber - secondNumber;
        } else if (operator == 3) {
            result = firstNumber / secondNumber;
        }

        System.out.println("Результат: " + result);
    }
}
