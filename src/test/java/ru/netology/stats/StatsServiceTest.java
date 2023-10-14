package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test //день минимальных продаж
    public void SearchForMinimumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedminMonth = 9;

        int actualminMonth = service.minSales(sales);
        Assertions.assertEquals(expectedminMonth, actualminMonth);
    }

    @Test //день максимальных продаж
    public void SearchForMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedmaxMonth = 8;

        int actualmaxMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedmaxMonth, actualmaxMonth);
    }

    @Test //сумма вех продаж
    public void SearchForAmountSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedamountSales = 180;

        long actualamountSales = service.amountSales(sales);
        Assertions.assertEquals(expectedamountSales, actualamountSales);
    }

    @Test // средняя сумма продаж в месяц
    public void SearchForAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedaverageSales = 15;

        long actualaverageSales = service.averageSales(sales);
        Assertions.assertEquals(expectedaverageSales, actualaverageSales);
    }

    @Test // число месяцев с продажами выше среднего
    public void SearchForAboveAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedaboveaverageSales = 5;

        long actualaboveaverageSales = service.aboveaverageSales(sales);
        Assertions.assertEquals(expectedaboveaverageSales, actualaboveaverageSales);
    }

    @Test // число месяцев с продажами ниже среднего
    public void SearchForBelowAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedbelowaverageSales = 5;

        long actualbelowaverageSales = service.belowaverageSales(sales);
        Assertions.assertEquals(expectedbelowaverageSales, actualbelowaverageSales);
    }

}
