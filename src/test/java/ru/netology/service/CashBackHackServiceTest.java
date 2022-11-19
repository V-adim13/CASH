package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashBackHackServiceTest {
    @org.testng.annotations.Test

    public void shouldCashBack() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 900;
        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test

    public void shouldCashBackService() {
        CashbackHackService CashBackService = new CashbackHackService();

        int amount = 0;
        int actual = CashBackService.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);


    }

    @org.testng.annotations.Test

    public void shouldCash() {
        CashbackHackService CashBackService = new CashbackHackService();

        int amount = 2000;
        int actual = CashBackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

}
