// Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). 
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
import java.util.Scanner;

public class LeapYear {
    
    public static void main(String[] args) {
        
        Scanner f = new Scanner(System.in);

        System.out.printf("Рассчет високосного года");

        System.out.printf("Введите год: ");

        int year = f.nextInt();

        boolean result = Leap(year);
        
        if (result == true){
            System.out.println("Введенный год високосный.");
        }else{
            System.out.println("Введенный год не високосный.");
        }

        f.close();
    }

    private static boolean Leap(int year) {

        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        return isLeapYear;
    }
}
