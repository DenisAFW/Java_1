// Написать метод, которому в качестве параметра передается целое число. 
// Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

import java.util.Scanner;

public class InvertComparison {
    
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

        number *= -1;
        
        boolean result = number >= 0;

        return result;
    }
}