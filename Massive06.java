// Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

import java.util.Arrays;

public class Massive06 {
    public static void main(String[] args) {
        
        int[] array = new int[] {1,5,4,6,8,9,2,4,85,2,588,4,82};

        var min = Arrays.stream(array).min();

        var max = Arrays.stream(array).max();

        System.out.println("Минимальное значение массива - " + (min.isPresent() ? min.getAsInt():" ")  + 
        ", максимальное значение массива - " + (max.isPresent() ? max.getAsInt():" "));
    }
}
