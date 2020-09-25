//Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива (пропусков быть не должно).


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class delArr {
    public static void main(String[] args) {
        //целое число
        int a = 4;

        //Создание массива
        Integer[] arr = new Integer[]{4, 2, 3, 4, 5, 6, 4};
        List<Integer> list = new ArrayList(Arrays.asList(arr));

        //Вывод
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == a) {
                list.remove(i);
            }
        }
        //Вывод
        System.out.println("-------");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
