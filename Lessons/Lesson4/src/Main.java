import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        byte myByte = 123;
//        short myShort = 12345;
//        int myInt = 4336543;
//        long myLong = 3487537L;

//        char myChar = 'A';
//
//        float myFloat = 32.45435F;
//        double myDouble = 344.645646;

//        boolean myBoolean = true;

//        *********************************************************

        System.out.println("Программма для подсчета BMI");

        System.out.print("Введите вес (кг): ");
        double weight = new Scanner(System.in).nextDouble();

        System.out.print("Введите рост (м): ");
        double height = new Scanner(System.in).nextDouble();

        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);

//        *********************************************************

        System.out.println("Калькулятор умножения чисел");

        System.out.println("Введите первое число: ");
        double firstNumber = new Scanner(System.in).nextDouble();

        System.out.println("Введите второе число: ");
        double secondNumber = new Scanner(System.in).nextDouble();

        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));

    }
}
