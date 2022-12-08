public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ. Циклы. Часть 1");


        // Задача 1
        System.out.println("Задача 1");

        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println("Итерация цикла" + i);
        }

        // Задача 2
        System.out.println("Задача 2 ");

        for (int b = 10; b >= 1; b = b - 1) {
            System.out.println("Итерация цикла" + b);
        }

        // задача 3
        System.out.println("задача 3 ");

        for (int d = 0; d <= 17; d = d + 2) {
            System.out.println("Итерация цикла" + d);
        }

        // Задача 4
        System.out.println("Задача 4");

        for (int a = 10; a >= -10; a = a - 1) {
            System.out.println("Итерация цикла" + a);
        }

        // Задача 5
        System.out.println("Задача 5");

        for (int f = 1904; f < 2096; f = f + 4) {
            System.out.println(" год является високосным" + f);
        }

        // Задача 6
        System.out.println("Задача 6");

        for (int g = 7; g <= 98; g = g + 7) {
            System.out.println(g);
        }

        // Задача 7
        System.out.println("Задача 7");

        for (int k = 1; k <= 512; k = k * 2) {
            System.out.println(k);
        }

        // задача 8
        System.out.println("задача 8");

        int monthlyContribution = 29000;
        int total = 1;
        for (int l = 1; l <= 12; l = l + 1) {
            total = total + monthlyContribution;
            System.out.println(total);
        }
        System.out.println("накопиться в банке за 12 месяцев" + total + "руб");

        // Задача 9
        System.out.println("Задача 9");

        int month = 1;
        int bankbDeposit = 29000;
        int total1 = 1;
         for (int t = 1; t <= 12; t = t + 1) {
            }
            for (month = 1; month <= 12; month = month + 1) {
                bankbDeposit = bankbDeposit + bankbDeposit / 100;
                total1 = total1 + bankbDeposit;
                System.out.println("Месяц" + month + "сума накоплений равна" + total1 + "руб");
                }

            // задача 10
            System.out.println("Задача 10");

          int N = 2;
        for (int x = 1; x <= 10; x++) {

            System.out.println(N + " * " + x + " = "
                    + N * x);
        }





    }
}