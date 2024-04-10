// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }

        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println("Чётные числа " + i);
        }

        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным.");
        }

        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        System.out.println("Задача 8");
        int savings = 29000;
        int sum = 0;
        for (int month = 1; month <= 12; month++) {
            sum = sum + savings;
            System.out.println("Месяц " + month + " сумма накоплений равна " + sum + " рублей." );
        }

        System.out.println("Задача 9");
        int saving = 29000;
        float sums = 0;
        for (int month = 0; month <= 12; month++) {
            sums = sums + sums/100;
            sums = sums + saving;
            System.out.println("Месяц " + month + " сумма накоплений равна " + sums + " рублей.");
        }

        System.out.println("Задача 10");
        int number = 2;
        for (int t = 1; t <= 10; t++) {
            System.out.println(number + "*" + t + "=" + number * t);
        }






    }
}