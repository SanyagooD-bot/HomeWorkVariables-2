public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа №2 Переменные");

        System.out.println("____________________Задача 1____________________");

        int Int = 27897;
        byte B = 67;
        short S = 569;
        long l = 987678965549L;
        float F = 2.786f;
        double D = 27.12;
        System.out.println("Значение переменной I с типом int равно " + Int);
        System.out.println("Значение переменной B с типом byte равно " + B);
        System.out.println("Значение переменной S с типом short равно " + S);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной F с типом float равно " + F);
        System.out.println("Значение переменной D с типом double равно " + D);

        System.out.println("_________________________________________________");

        System.out.println("___________________Задача 2______________________");

        float F1 = 27.12f;
        long L1 = 987678965549L;
        double D1 = 2.786;
        short S1 = 569;
        short S2 = -159;
        short S3 = 27897;
        byte B1 = 67;
        System.out.println("Значение переменной F1 с типом float равно " + F1);
        System.out.println("Значение переменной L1 с типом long равно " + L1);
        System.out.println("Значение переменной D1 с типом double равно " + D1);
        System.out.println("Значение переменной S1 с типом short равно " + S1);
        System.out.println("Значение переменной S2 с типом short равно " + S2);
        System.out.println("Значение переменной S3 с типом short равно " + S3);
        System.out.println("Значение переменной B1 с типом byte равно " + B1);

        System.out.println("_________________________________________________");

        System.out.println("____________________Задача 3_____________________");

        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short total = 480;
        byte learners = (byte) (teacher1 + teacher2 + teacher3);
        byte paper = (byte) (total / learners);

        System.out.println("У Людмилы Павловны " + teacher1 + " ученика");
        System.out.println("У Анны Сергеевны " + teacher2 + " учеников");
        System.out.println("У Екатерины Андреевны " + teacher3 + " учеников");
        System.out.println("Всего листов бумаги купили " + total);
        System.out.println("Всего учеников " + teacher1 + "+" + teacher2 + "+" + teacher3 + "=" + learners);
        System.out.println("На каждого ученика рассчитано " + total + "/" + learners + "=" + paper + " листов бумаги");
        System.out.println("Ответ: " + paper);

        System.out.println("__________________________________________________");

        System.out.println("__________________________Задача 4____________________________");

        byte performance2Min = 16;
        byte min = 20; // 20 минут;
        //byte hour = 60; // 1 час;
        byte day = 24; // 1 сутки;
        byte day3 = 3; // 3 дня;
        byte month = 30; // 1 месяц;
        byte perf1min = (byte)(performance2Min / 2);
        int perf20min = perf1min * min;
        int perf1hour = perf1min * 60;
        int perf24hour = perf1hour * 24;
        int perf3day = perf24hour * 3;
        int perf1month = perf24hour * 30;
        System.out.println("Станок производит за " + min +" минут - " + perf20min + " бутылок");
        System.out.println("Станок производит за "+ day +" часа(сутки) - " + perf24hour + " бутылок");
        System.out.println("Станок производит за "+ day3 +" дня - " + perf3day + " бутылок");
        System.out.println("Станок производит за "+ month +" месяц - " + perf1month + " бутылок");

        System.out.println("________________________________________________________________________");

        System.out.println("______________________________Задача 5______________________________");

        byte paint = 120;
        byte whiteColor = 2;
        byte brownColor = 4;
        int class1 = whiteColor + brownColor;
        int classes = paint / class1;
        int white1 = classes * whiteColor;
        int brown1 = classes * brownColor;
        System.out.println("Всего банок на 1 класс потребуется " + class1 + " шт");
        System.out.println("Всего в школе " + classes + " классов");
        System.out.println("Белой краски потребуется " + white1 + " шт");
        System.out.println("Коричневой краски потребуется " + brown1 + " шт");
        System.out.println("В школе, где " + classes + " классов, нужно " + white1 + " банок белой краски и " + brown1 + " банок коричневой краски");
        System.out.println("____________________________________________________________________________");

        System.out.println("______________________________________Задача 6______________________________________");

        int bananas = 80 * 5;
        int milk = 105 * 2;
        int ice = 100 * 2;
        int eggs = 70 * 4;
        int weight = bananas + milk + ice + eggs;
        float kg = weight / 1000f;
        System.out.println("Вес бананов составляет " + bananas + " гр.");
        System.out.println("Вес молока составляет " + milk + " гр.");
        System.out.println("Вес мороженного составляет " + ice + " гр.");
        System.out.println("Вес яиц составляет " + eggs + " гр.");
        System.out.println("Общий вес продуктов составляет " + weight + " гр.");
        System.out.println("Или " + kg + " кг.");

        System.out.println("_______________________________________________________________________________________");

        System.out.println("_____________________________________Задача 7__________________________________________");

        int gr = 7 * 1000;
        int minGr = gr / 250;
        int maxGr = gr / 500;
        int averageValue = (minGr + maxGr) / 2;
        System.out.println("7 киллограмм = " + gr + " граммов");
        System.out.println("Похудеет спортсмен за " + minGr + " дней при потере 250гр.");
        System.out.println("Похудеет спортсмен за " + maxGr + " дней при потрере 500гр.");
        System.out.println("Может потребоваться " + averageValue + " день в среднем, чтобы добиться результата похудения");

        System.out.println("_______________________________________________________________________________________");

        System.out.println("________________________________________Задача 8________________________________________");

        System.out.println(".........................................................................................");
        int salaryMasha = 67760;
        int yearSalaryMasha = salaryMasha * 12;
        int premiumMasha = salaryMasha / 100 * 10;
        int salarySupplement = salaryMasha + premiumMasha;
        int yearSalarySupplement = salarySupplement * 12;
        int salaryDifference = yearSalarySupplement - yearSalaryMasha;
        System.out.println("Мария получит без надбавок " + yearSalaryMasha + " рублей за год");
        System.out.println("10% от зарплаты Марии составляет " + premiumMasha);
        System.out.println("Зарплата Марии с надбавкой составляет " + salarySupplement);
        System.out.println("Зарплата Марии с надбавкой за год составит " + yearSalarySupplement);
        System.out.println("Мария теперь получает " + salarySupplement + " рублей. Её годовой доход вырос на " + salaryDifference + " рублей");

        System.out.println(".........................................................................................");

        int salaryDenis = 83690;
        int yearSalaryDenis = salaryDenis * 12;
        int premiumDenis = salaryDenis / 100 * 10;
        int salarySupplement1 = salaryDenis + premiumDenis;
        int yearSalarySupplement1 = salarySupplement1 * 12;
        int salaryDifference1 = yearSalarySupplement1 - yearSalaryDenis;
        System.out.println("Получит Денис без надбавок " + yearSalaryDenis + " рублей за год");
        System.out.println("10% от зарплаты Дениса составляет " + premiumDenis);
        System.out.println("Зарплата Дениса с надбавкой составит " + salarySupplement1);
        System.out.println("Зарплата Дениса с надбавкой за год составляет " + yearSalarySupplement1);
        System.out.println("Денис теперь получает " + salarySupplement1 + " рублей. Годовой доход вырос на " + salaryDifference1 + " рублей");

        System.out.println(".........................................................................................");

        int salaryChristina = 76230;
        int yearSalaryChristina = salaryChristina * 12;
        int premiumKris = salaryChristina / 100 * 10;
        int salarySupplement2 = salaryChristina + premiumKris;
        int yearSalarySupplement2 = salarySupplement2 * 12;
        int salaryDifference2 = yearSalarySupplement2 - yearSalaryChristina;
        System.out.println("Получит Кристина без надбавок " + yearSalaryChristina + " рублей за год");
        System.out.println("10% от зарлаты Кристины составляет " + premiumKris);
        System.out.println("Зарплата Кристины с надбавкой составляет " + salarySupplement2);
        System.out.println("Зарплата Кристины с надбавкой за год составляет " + yearSalarySupplement2);
        System.out.println("Кристина теперь получает " + salarySupplement2 + " рублей.Её годовой доход вырос на " + salaryDifference2 + " рублей");

        System.out.println("________________________________________________________________________________________________________________________");


    }
}