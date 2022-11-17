// Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

public class Massive02 {
    
    public static void main(String[] args) {
        
        int[] array = new int[101];

        for(int i = 1; i < array.length; i++){
            System.out.print((array[i] = i) + " ");
        }
    }
}
