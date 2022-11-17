import java.util.Random;
import java.util.Scanner;

// Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

public class Massive01 {
    
    public static void main(String[] args) {
        
        Scanner f = new Scanner(System.in);

        System.out.printf("Введите размер массива: ");

        Integer size = f.nextInt();
        
        int[] result = Massive(size);

        for(int i = 0; i <result.length; i++){
            System.out.print(result[i] + " ");
        }

        f.close();
    }

    private static int[] Massive(int size) {

        int[] arr = new int[size];

        Random rnd = new Random(2);

        for(int i = 0; i < size; i++ ){

            int number = 0 + rnd.nextInt(0, 2);

            if(number == 0){
                number = 1;
            }else{
                number = 0;
            }
            arr[i] = number;
        }
        return arr;
    }
}
