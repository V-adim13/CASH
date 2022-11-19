package ru.netology.service;

//import static org.testng.Assert.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;
//import org.junit.jupiter.api.Test;

public class CashBackHackServiceTest {
    @Test

    public void shouldCashBack() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 900;
        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        Assertions.assertEquals(actual, expected);

    }

    @Test

    public void shouldCashBackService() {
        CashbackHackService CashBackService = new CashbackHackService();

        int amount = 0;
        int actual = CashBackService.remain(amount);
        int expected = 1000;

        Assertions.assertEquals(actual, expected);


    }

    @Test

    public void shouldCash() {
        CashbackHackService CashBackService = new CashbackHackService();

        int amount = 2000;
        int actual = CashBackService.remain(amount);
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

}
