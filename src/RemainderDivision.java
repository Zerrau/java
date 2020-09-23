// Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
// Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.

public class RemainderDivision {
    public static void main(String[] args) {
        int a = 100;
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}