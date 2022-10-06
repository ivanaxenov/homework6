public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println(" Задание 1 ");
        for (int i = 0; i <= 10; i++) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println(" Задание 2");
        for (int i = 10; i >= 0; i--) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println(" Задание 3 ");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0 && i != 0) {
                System.out.print(i);
            }
        }
        System.out.println();
        System.out.println(" Задание 4 ");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i);
        }
        System.out.println();

    }

    public static void task2() {
        System.out.println("Задание 1");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.printf("Год %s является високосным", i);
            System.out.println();
        }
        System.out.println();
        System.out.println("Задание 2");
        for (int i = 7; i < 98; i = i + 7) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("Задание 3");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i);
        }
        System.out.println();


    }

    public static void task3() {
        System.out.println("Задание 1");
        int save = 0;
        for (int i = 1; i <= 12; i++) {
            save += 29000;
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей %n", i, save);
        }
        System.out.println("Задание 2");
        int save1 = 0;
        int s = 1;
        for (int i = 1; i <= 12; i++) {
            save1 += 29000;
            save1 = save1 + s * save1 / 100;
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей %n", i, save1);
        }

    }
}