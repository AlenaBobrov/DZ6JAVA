package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestStatsService {

    @Test
    public void shouldFindSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualS = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualS);

    }

    @Test
    public void shouldFindAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAv = 15;
        int actualA = service.averageAmount(sales);

        Assertions.assertEquals(expectedAv, actualA);

    }

    @Test
    public void shouldFindMonthMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualM = service.monthMaxSales(sales);

        Assertions.assertEquals(expectedMonth, actualM);

    }

    @Test
    public void shouldFindMonthMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthMin = 9;
        int actualMon = service.monthMinSales(sales);

        Assertions.assertEquals(expectedMonthMin, actualMon);

    }

    @Test
    public void shouldFindMonthsBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonths = 5;
        int actualMonths = service.monthBelowAverage(sales);

        Assertions.assertEquals(expectedMonths, actualMonths);

    }

    @Test
    public void shouldFindMonthsOverAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonths = 5;
        int actualMonths = service.monthOverAverage(sales);

        Assertions.assertEquals(expectedMonths, actualMonths);

    }
}
