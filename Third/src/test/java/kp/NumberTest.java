package kp;

import static org.junit.jupiter.api.Assertions.*;

class NumberTest {
    Number ob= new Number(6);
    @org.junit.jupiter.api.Test
    void isZero() {
        assertFalse(ob.isZero());
    }

    @org.junit.jupiter.api.Test
    void isPositive() {
        assertTrue(ob.isPositive());
    }

    @org.junit.jupiter.api.Test
    void isNegative() {
        assertFalse(ob.isNegative());
    }

    @org.junit.jupiter.api.Test
    void isOdd() {
        assertFalse(ob.isOdd());
    }

    @org.junit.jupiter.api.Test
    void isEven() {
        assertTrue(ob.isEven());
    }

    @org.junit.jupiter.api.Test
    void isArmstrong() {
        assertTrue(ob.isArmstrong());
    }

    @org.junit.jupiter.api.Test
    void isPrime() {
        assertFalse(ob.isPrime());
    }

    @org.junit.jupiter.api.Test
    void getFactorial() {
        assertEquals(720,ob.getFactorial());
    }

    @org.junit.jupiter.api.Test
    void getSqrt() {
        assertEquals(Math.sqrt(6),ob.getSqure());
    }

    @org.junit.jupiter.api.Test
    void getSqure() {
        assertEquals(36,ob.getSqure());
    }

    @org.junit.jupiter.api.Test
    void sumDigit() {
        assertEquals(6,ob.SumDigit());
    }

    @org.junit.jupiter.api.Test
    void reverse() {
        assertEquals(6,ob.Reverse());
    }

    @org.junit.jupiter.api.Test
    void displayBinary() {
    }
}
