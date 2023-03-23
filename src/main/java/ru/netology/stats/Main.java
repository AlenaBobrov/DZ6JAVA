package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int summary = service.sumSales(sales);
        System.out.print("Сумма продаж" + ' ' + summary + ".");

        int averAmount = service.averageAmount(sales);
        System.out.print("Средняя сумма продаж в месяц" + ' ' + averAmount + ".");

        int monthMax = service.monthMaxSales(sales);
        System.out.print("Номер месяца c максимальными продажами" + ' ' + monthMax + ".");

        int monthMin = service.monthMinSales(sales);
        System.out.print("Номер месяца c минимальными продажами" + ' ' + monthMin + ".");

        int monthBelow = service.monthBelowAverage(sales);
        System.out.print("Количество месяцев c продажами ниже среднего" + ' ' + monthBelow + ".");

        int monthOver = service.monthOverAverage(sales);
        System.out.print("Количество месяцев c продажами выше среднего" + ' ' + monthOver + ".");
    }
}

