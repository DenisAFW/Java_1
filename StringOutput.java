// Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;

import java.util.Scanner;

public class StringOutput {

    public static void main(String[] args) {
        
        Scanner f = new Scanner(System.in, "ibm866");

        System.out.printf("Введите строку: ");

        String word = f.nextLine();

        System.out.printf("Введите кол-во повторений строки: ");

        Integer times = f.nextInt();
        
        String result = Text(word, times);

        System.out.println(result);

        f.close();
    }

    private static String Text(String word, int times) {
        
        String result = " ";

        for(int i = 0; i < times; i++){
            result += word + "\n";;
        }
        return result;
        
    }
}