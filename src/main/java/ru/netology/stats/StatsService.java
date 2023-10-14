package ru.netology.stats;

import java.util.Arrays;

public class StatsService {

    public int minSales(long[] sales) { //день минимальных продвж

        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) { //день максимальных продаж
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж ,больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public long amountSales(long[] sales) { // сумма всех продаж
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public long averageSales(long[] sales) { // среднее арифметическое
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum / sales.length;
    }

    public long aboveaverageSales(long[] sales) { // выше среднего
        long sum = 0;
        long aboveAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        long average = sum / sales.length;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }

    public long belowaverageSales(long[] sales) { // ниже среднего
        long sum = 0;
        long belowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        long average = sum / sales.length;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                belowAverage++;
            }
        }
        return belowAverage;
    }
}
