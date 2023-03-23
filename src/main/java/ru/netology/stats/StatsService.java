package ru.netology.stats;

public class StatsService {

    public int sumSales(int[] sales) {
        int sum = 0;
        for (int x : sales) {
            sum += x;
        }
        return sum;
    }

    public int averageAmount(int[] sales) {
        int av = 0;
        for (int x : sales) {
            av += x;
        }
        return av / 12;
    }

    public int monthMaxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int monthMinSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int monthBelowAverage(int[] sales) {
        int average = averageAmount(sales);
        int monthBelow = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                monthBelow++;
            }
        }
        return monthBelow;
    }

    public int monthOverAverage(int[] sales) {
        int average = averageAmount(sales);
        int monthOver = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                monthOver++;
            }
        }
        return monthOver;
    }
}

