// Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 
// (включительно), если да – вернуть true, в противном случае – false.

import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {

        Scanner f = new Scanner(System.in);

        System.out.printf("Введите первое число: ");

        Integer number1 = f.nextInt();

        System.out.printf("Введите второе число: ");

        Integer number2 = f.nextInt();

        int SumResult = SumNumb(number1, number2);

        System.out.println("Сумма чисел равна " + SumResult);

        boolean result = Difference(SumResult);

        System.out.println(result);

        f.close();
    }

    private static int SumNumb(int number1, int number2) {

        int sum = number1 + number2;

        return sum;
    }

    private static boolean Difference(int sum) {

        boolean result = sum > 10 & sum <= 20;

        return result;
    }

}
