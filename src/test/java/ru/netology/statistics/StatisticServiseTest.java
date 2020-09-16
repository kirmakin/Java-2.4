package ru.netology.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {
    @Test
    void shouldCalculateSum() {
        StatisticService service = new StatisticService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverage() {
        StatisticService service = new StatisticService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.calculateAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMax() {
        StatisticService service = new StatisticService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.findMax(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMin() {
        StatisticService service = new StatisticService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findMin(sales);
        assertEquals(expected, actual);
    }


    @Test
    void shouldCalculateMAverage() {
        StatisticService service = new StatisticService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.moreAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateLAverage() {
        StatisticService service = new StatisticService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.lessAverage(sales);
        assertEquals(expected, actual);
    }
}
