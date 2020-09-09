/*
Реализуйте метод, проверяющий, является ли заданная строка палиндромом. Палиндромом называется строка, которая читается
 одинаково слева направо и справа налево (в том числе пустая). При определении "палиндромности" строки должны учитываться
 только буквы и цифры. А пробелы, знаки препинания, а также регистр символов должны игнорироваться. Гарантируется, что в
 метод попадают только строки, состоящие из символов ASCII (цифры, латинские буквы, знаки препинания). Т.е. русских, китайских
 и прочих экзотических символов в строке не будет.

Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
в

 */


public class Palindrome {
    public static void main(String[] args) {
        String name = "Madam, I'm Adam!";

        //убрать все знаки кроме a-z A-Z 0-9
        String[] one = name.split("[^a-zA-Z0-9]");

        //предложение наоборот
        String eman = new StringBuffer(name).reverse().toString();
        String[] two = eman.split("[^a-zA-Z0-9]");

        //Соединение всего массива one в одну строку
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < one.length; i++) {
            stringBuilder.append(one[i]);
        }
        String joinedString = stringBuilder.toString();

        //Соединение всего массива two в одну строку
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int i = 0; i < two.length; i++) {
            stringBuilder1.append(two[i]);
        }
        String joinedString1 = stringBuilder1.toString();

        //Перевод в нижний регистр
        String a = joinedString.toLowerCase();
        String b = joinedString1.toLowerCase();

        //Проверка на палиндром
        System.out.println(a.equals(b));


    }

}


