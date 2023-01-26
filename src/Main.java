public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int age = 25;
        byte numberOfStudents = 100;
        short distanceToSchool = 500;
        long population = 100000000;
        float averageScore = 89.5f;
        double temperature = 72.4;

        System.out.println("Возраст в int " + age);
        System.out.println("Кол-во студентов в byte " + numberOfStudents);
        System.out.println("Дистанция до школы в short " + distanceToSchool);
        System.out.println("Кол-во населения в long " + population);
        System.out.println("Средняя оценка в классе в float " + averageScore);
        System.out.println("Температура в double " + temperature);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        double decimalValue = 27.12;
        long largeNumber = 987678965349L;
        int numberWithComma = 2786;
        short smallNumber = 569;
        short negativeNumber = 159;
        int anotherNumber = 27897;
        byte lastNumber = 67;

        System.out.println(decimalValue);
        System.out.println(largeNumber);
        System.out.println(numberWithComma);
        System.out.println(smallNumber);
        System.out.println(negativeNumber);
        System.out.println(anotherNumber);
        System.out.println(lastNumber);

    }
    public static void task3 () {
        System.out.println("Задача 3");
        int numberOfStudents1 = 23;
        int numberOfStudents2 = 27;
        int numberOfStudents3 = 30;
        int totalNumberOfStudents = numberOfStudents1 + numberOfStudents2 + numberOfStudents3;
        int totalNumberOfSheets = 480;
        int sheetsPerStudent = totalNumberOfSheets / totalNumberOfStudents;
        System.out.println("Каждому ученику достанется " + sheetsPerStudent + " листов бумаги.");


    }
    public static void task4 () {
        System.out.println("Задача 4");
        int bottlesPerTwoMinutes = 16;
        double bottlesPerMinute = bottlesPerTwoMinutes/2.0;
        int bottlesPer20Minutes = (int)(bottlesPerMinute*20);
        System.out.println("За 20 минут машина сделает " + bottlesPer20Minutes + " бутылок.");
        int bottlesPerDay = (int)(bottlesPerMinute * 60 * 24);
        System.out.println("За день, машина сделает " + bottlesPerDay + " бутылок.");
        int bottlesPer3Days = bottlesPerDay * 3;
        System.out.println("За 3 дня, машина сделает " + bottlesPer3Days + " бутылок.");
        int bottlesPerMonth = bottlesPerDay * 30;
        System.out.println("За месяц, если в нем 30 дней, машина сделает " + bottlesPerMonth + " бутылок.");


    }
    public static void task5 () {
        System.out.println("Задача 5");
        int totalNumberOfPaintNeeded = 120;
        int whitePaintPerClass = 2;
        int brownPaintPerClass = 4;
        int totalPaintPerClass = whitePaintPerClass + brownPaintPerClass;
        int numberOfClassrooms = totalNumberOfPaintNeeded / totalPaintPerClass;
        int totalWhitePaintPerClass = 2 * numberOfClassrooms;
        int totalBrownPaintPerClass = 4 * numberOfClassrooms;
        System.out.println("В школе, где " + numberOfClassrooms + " классов, нужно " + totalWhitePaintPerClass + " банок белой краски и " + totalBrownPaintPerClass + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        // Вес каждого продукта
        int bananaWeight = 80;
        int milkWeight = 105;
        int iceCreamWeight = 100;
        int eggWeight = 70;

        // Сколько продуктов надо
        int bananaCount = 5;
        int milkCount = 200;
        int iceCreamCount = 2;
        int eggCount = 4;

        // Посчитать в граммах всё
        int totalWeightGrams = (bananaWeight * bananaCount) + (milkWeight * (milkCount / 100)) + (iceCreamWeight * iceCreamCount) + (eggWeight * eggCount);

        // Посчитать всё в кг
        double totalWeightKilograms = totalWeightGrams / 1000.0;

        // Результат
        System.out.println("Вес завтрака " + totalWeightGrams + " грамм (" + totalWeightKilograms + " кг).");

    }
    public static void task7 () {
        System.out.println("Задача 7");
        int weightToLose = 7000;
        int dailyLossMin = 250;
        int dailyLossMax = 500;

        int daysToLoseMin = weightToLose / dailyLossMin;
        int daysToLoseMax = weightToLose / dailyLossMax;
        int daysToLoseAvg = weightToLose / ((dailyLossMin+dailyLossMax)/2);



        System.out.println("Это займет " + daysToLoseMin + " дней чтобы потерять вес если терять " + dailyLossMin + " граммов в день.");
        System.out.println("Это займет " + daysToLoseMax + " дней чтобы потерять вес если терять " + dailyLossMax + " граммов в день.");
        System.out.println("В среднем это займет " + daysToLoseAvg + " дней чтобы потерять вес.");


    }
    public static void task8 () {
        System.out.println("Задача 8");
        double IncreaseSalary = 1.1;
        int MashaSalaryMonth = 67760;
        int DenisSalaryMonth = 83690;
        int KristinaSalaryMonth = 76230;
        double newMashaSalary = MashaSalaryMonth * IncreaseSalary;
        double newDenisSalary = DenisSalaryMonth * IncreaseSalary;
        double newKristinaSalary= KristinaSalaryMonth * IncreaseSalary;
        System.out.println("Маша теперь получает " + newMashaSalary + " рублей." + " Годовой доход вырос на " + (newMashaSalary-MashaSalaryMonth)*12 + " рублей");
        System.out.println("Денис теперь получает " + newDenisSalary + " рублей." + " Годовой доход вырос на " + (newDenisSalary-DenisSalaryMonth)*12 + " рублей");
        System.out.println("Кристина теперь получает " + newKristinaSalary + " рублей." + " Годовой доход вырос на " + (newKristinaSalary-KristinaSalaryMonth)*12 + " рублей");


    }
}