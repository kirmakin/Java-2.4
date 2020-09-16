package ru.netology.statistics;

public class StatisticService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverage(int[] sales) {
        int sum = calculateSum(sales);
        int average = sum / sales.length;
        return average;
    }


    public int findMax(int[] sales) {
        int numberMaxMonth = 0;
        int maxSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (maxSale <= sales[i]) {
                maxSale = sales[i];
                numberMaxMonth = i + 1;
            }
        }
        return numberMaxMonth;
    }

    public int findMin(int[] sales) {
        int numberMinMonth = 0;
        int minSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (minSale >= sales[i]) {
                minSale = sales[i];
                numberMinMonth = i + 1;
            }
        }
        return numberMinMonth;
    }

    public int moreAverage(int[] sales) {
        int average = calculateAverage(sales);
        int summore = 0;
        for (int sale : sales) {
            if (sale > average) {
                summore++;
            }
        }
        return summore;
    }


    public int lessAverage(int[] sales) {
        int average = calculateAverage(sales);
        int sumless = 0;
        for (int sale : sales) {
            if (sale < average) {
                sumless++;
            }
        }
        return sumless;
    }
}
