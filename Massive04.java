import java.util.Scanner;
import java.util.Arrays;

// Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//  и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). 
// Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
public class Massive04 {
    public static void main(String[] args) {
        
        Scanner f =  new Scanner(System.in);

        System.out.printf("Введите размер массива: ");

        Integer size = f.nextInt();

        String array = Arrays.deepToString(Poms(size)).replace("], ", "]\n");
        
        array = array.replace("[[", "[");
        array = array.replace("]]", "]");

        System.out.println(array);

        f.close();

    }

    private static int[][] Poms(int size) {

        int[][] array = new int[size][size];

        int count = 0;

        for(int i = 0; i < size; i++)
            for(int j = 0; j < size; j++){
                count++;
                array[i][j] = count;
                if(i==j){
                    array[i][j] = 1;
                }
            }
        // System.out.println(Arrays.deepToString(array).replace("], ", "]\n"));
        return array;
    }
}
// с обратной диагональю сломался, хотел влепить второй пробег двух циклов, но передумал и решил, что это можно засунуть в основной цикл и скорее всего ошибся.