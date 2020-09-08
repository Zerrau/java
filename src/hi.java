
/*
first
Заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.

Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
*/


import java.lang.reflect.Array;
import java.util.Arrays;

public class hi {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.println(arr[i]);
        }
        var min = Arrays.stream(arr).min();
        var max = Arrays.stream(arr).max();
        System.out.println("Min " + min);
        System.out.println("Max " + max);

        double sum = 0;
        for (int num : arr) {
            // суммирование каждого элемента массива
            sum = sum + num;
        }
        double Len = arr.length;
        System.out.println("среднее значение " + sum / Len);

    }
}

