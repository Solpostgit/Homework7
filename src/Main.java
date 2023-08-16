public class Main {
    public static void main(String[] args) {
        task1();/*
        task2();
        task3();
        task4();
        task5();
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
}