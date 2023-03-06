public class Main {
    static int hw = 7 ;
    public static void main(String[] args) {
        HWtitle();
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

        HWbackCover() ;
    }

    public static void HWtitle() {
        System.out.println("ДОМАШНЕЕ ЗАДАНИЕ №" + hw);
        System.out.println(" ");
    }

    /**
     * Задача 1
     * Продолжите работать с кодом, который вы написали в предыдущем уроке — в задачах с накоплениями.
     *
     * С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии,
     * что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
     * Результат программы должен быть выведен в консоль с тем количеством месяцев, которое необходимо для
     * накопления данной суммы. Формат сообщения: «Месяц …, сумма накоплений равна … рублей» .

     * Критерии проверки
     * Применили цикл while для решения задания.
     * В консоль вывели по порядку суммы накоплений за каждый месяц
     * Инициализировали переменную для обозначения вклада.
     * Инициализировали переменную для суммы накоплений.
     *
     */
    public static void task1 () {
        System.out.println("Задача 1");
        int goal =2_459_000 ;
        int monthlyFee = 15000 ;
        int monthsToGoal = 0 ;
        int balance = 0 ;
        while (balance < goal) {
            balance += monthlyFee;
            monthsToGoal += 1;
        }
        System.out.println("Месяц "+monthsToGoal+". Сумма накоплений равна " + balance + " рублей");
        System.out.println("\nТребуется "+monthsToGoal+" месяцев для накопления суммы "+goal+
                " рублей, если откладывать по "+monthlyFee+" рублей ежемесячно\n");
    }
    public static void HWbackCover() {
        System.out.println("Домашнее задание " + hw + " выполнено\n");
    }

        public static void task2() {
        System.out.println("Задача 2");
        int i = 0 ;
        while (i<10)
        {
            i++ ;
            System.out.print(i+" ");
        }
        System.out.println("");
        for(;i>0;i--) {
            System.out.print(i+" ");
        }
        System.out.println("\n");
    }

        public static void task3() {
            System.out.println("Задача 3");
            double population = 12_000_000.00 ;
            double birthRate = 17.0 , deathRate = 8.0 ; // rates per 1K people within 1 year
            int year = 1 ;
                    for (;year <= 10; year++ ){
                    population += population * (birthRate - deathRate) * 0.001;
                System.out.println("Год " + year + "\tЧисленность населения составляет " + (int) population + " человек");
            }
        System.out.println("");
        }

public static void task4 () {
    System.out.println("Задача 4");
    double deposit = 15000 ;
    double rate = 7 ; // percent per month
    double goal =12_000_000 ;
    int month = 0 ;
    int printsPerLine = 4 ;
    int printsCount = 0 ;
    while (deposit < goal) {
        deposit += deposit * rate * 0.01 ;
        month++ ;
        System.out.print("Месяц: " + month + " Накоплено: " + (int)deposit + " руб\t");
        printsCount++ ;
        if (printsCount == printsPerLine) {
            System.out.println();
            printsCount = 0 ;
        }
    }
    System.out.println("\n=================================\nВасилию потребуется "
            + month + " месяцев, чтобы накопить " + (int) goal + " рублей");
    System.out.println(" ");
}
    public static void task5 () {
        System.out.println("Задача 5");
        double deposit = 15000 ;
        double rate = 7 ; // percent per month
        double goal =12_000_000 ;
        int month = 0, check = 6 ;
        int printsPerLine = 4 ;
        int printsCount = 0 ;
        while (deposit < goal) {
            deposit += deposit * rate * 0.01 ;
            month++ ;
            if (month % check == 0 ){
                System.out.print("Месяц: " + month + " Накоплено: " + (int)deposit + " руб\t");
                printsCount++ ;
                if (printsCount == printsPerLine) {
                    System.out.println();
                    printsCount = 0 ;
                }
            }
        }
        System.out.print("Месяц: " + month + " Накоплено: " + (int)deposit + " руб");
        System.out.println("\n=================================\nВасилию потребуется "
                + month + " месяцев, чтобы накопить " + (int) goal + " рублей");
        System.out.println(" ");
    }

    public static void task6 () {
        System.out.println("Задача 6");
        double deposit = 15000 ;
        double rate = 7 ; // percent per month
 //       double goal =12_000_000 ;
        int years = 9,
                month = 0, periodInMonths = 9*12 ,
                    check = 6 ;
        int printsPerLine = 4 ,
                printsCount = 0 ;
        while (month < periodInMonths ) {
            deposit += deposit * rate * 0.01 ;
            month++ ;
            if (month % check == 0 ){
                System.out.print("Месяц: " + month + " Накоплено: " + (int)deposit + " руб\t");
                printsCount++ ;
                if (printsCount == printsPerLine) {
                    System.out.println();
                    printsCount = 0 ;
                }
            }
        }
        System.out.print("Месяц: " + month + " Накоплено: " + (int)deposit + " руб");
        System.out.println("\n=================================\nВасилий накопит "
                + (int)deposit + " рублей за " + years + " лет");
        System.out.println("");
    }

    public static void task7() {
        System.out.println("Задача №7");
        int firstFriday = 3 ,
                daysInMonth =31 ,
                    today = 1 ;
        for(;today<=daysInMonth; today++) {
            if ((today-firstFriday)%7==0) {
                System.out.println("Сегодня "+today+" число, пятница. \tПора сдавать отчет!");
            }
        }

        System.out.println("");
    }

    public static void task8() {
        System.out.println("Задача 8");
        int
                thisYear = 2023 ,
                cometPeriod = 79 ,
                year = 0 ,
                back = 200 ,
                forward = 100 ;
            while (year < thisYear + forward) {
                if (year >= thisYear - back && year % cometPeriod == 0) {
                    System.out.println("Год "+year + ". В небе видна комета");
                    }
                year++ ;
                }

        System.out.println("");
    }
}


