// Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, 
// положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

import java.util.Scanner;

public class PlusMinus {
    
    public static void main(String[] args) {
        
        Scanner f = new Scanner(System.in);

        System.out.printf("Введите число: ");

        Integer number = f.nextInt();

        boolean result = CheckNumber(number);

        if (result == true){
            System.out.println("Число положительное.");
        } else {
            System.out.println("Число отрицательное.");
        }
        

        f.close();
    }

    private static boolean CheckNumber(int number) {
        
        boolean result = number >= 0;

        return result;
    }
}
