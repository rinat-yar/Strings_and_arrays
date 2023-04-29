package ru.netology.stats;

public class StatsService {

// сумма всех продаж;

    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

// средняя сумма продаж в месяц;

    public long average(long[] sales) {
        if (sales.length == 0) {
            return 0;
        }
        return sum(sales) / sales.length;
    }

// номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму


    public int monthMaxSales(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }

// номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму


    public int monthMinSales(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }

    // количество месяцев, в которых продажи были ниже среднего
    public int monthsBelowAverage(long[] sales) {

        int count = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                count++;
            }
        }
        return count;
    }

    // количество месяцев, в которых продажи были выше среднего
    public int monthsMoreAverage(long[] sales) {

        int count = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                count++;
            }
        }
        return count;
    }
}