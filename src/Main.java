public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();/*
        task6();
        task7();
        task8();*/
    }

    public static void task1() {
        System.out.println("Task 1");
        int month = 0;
        int salary = 0;
        while (salary < 2_459_000) {
            salary = salary + 15_000;
            month++;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей \n", month, salary);
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Task 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println();
        System.out.println("Task 3");
        int population = 12000000;
        int fertility = 17;
        int mortality = 8;
        for (int i = 1; i <= 10; i++) {
            population = ((population / 1000 * (fertility - mortality)) + population);
            System.out.printf("Год %d, численность населения составляет %d\n", i, population);
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Task 4");
        int month = 0;
        float salary = 15000f;
        while (salary < 12000000) {
            salary = (salary + ((salary / 100) * 7));
            month++;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей \n", month, salary); // вывод накоплений каждый месяц
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("Task 5");
        int month = 0;
        float salary = 15000f;
        while (salary < 12000000) {
            salary = (salary + ((salary / 100) * 7));
            month++;
            if (month % 6 == 0) { //вывод накоплений каждый 6-й месяц
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей \n", month, salary);
            }
        }
        System.out.println();
    }
}