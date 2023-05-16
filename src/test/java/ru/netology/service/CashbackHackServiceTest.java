package ru.netology.service;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldBuyMoreWhenAmountBelowBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldBuyMoreWhenAmountBelowBoundaryOnBoard() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldNotBuyMoreWhenAmountEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);
    }


    @org.junit.Test
    public void shouldNotBuyMoreWhenAmountAboveBoundaryOnBoard() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldNotBuyMoreWhenAmountAboveBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);
    }
}