package com.powermilk;

import org.junit.jupiter.api.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JUnitPlatform.class)
@DisplayName("Testing Prime class")
@SelectPackages("com.powermilk")
class PrimeUnitTest {
    private static final Logger log = LoggerFactory.getLogger(PrimeUnitTest.class);

    @BeforeAll
    static void setup() {
        log.info("--- Test suite for Prime started! ---");
    }

    @BeforeEach
    void init() {
        log.info("Test started!");
    }

    @AfterAll
    static void finish() {
        log.info("--- Test suite for Prime finished! ---");
    }

    @AfterEach
    void tearDown() {
        log.info("Test finished!");
    }

    @Test
    @DisplayName("Test should pass (returns true) for basic method (small number as input)")
    public void shouldBasicReturnsTrueForSmallNumber() {
        boolean actual = Prime.isPrime(5);
        assertEquals(true, actual);
        log.info("Test passed!");
    }

    @Test
    @DisplayName("Test should pass (returns true) for quick method (small number as input)")
    public void shouldQuickReturnsTrueForSmallNumber() {
        boolean actual = Prime.isPrimeQuick(5);
        assertEquals(true, actual);
        log.info("Test passed!");
    }

    @Test
    @DisplayName("Test should pass (returns true) for quicker method (small number as input)")
    public void shouldQuickerReturnsTrueForSmallNumber() {
        boolean actual = Prime.isPrimeQuicker(5);
        assertEquals(true, actual);
        log.info("Test passed!");
    }

    @Test
    @DisplayName("Test should pass (returns true) for array method (small number as input)")
    public void shouldArrayReturnsTrueForSmallNumber() {
        boolean actual = Prime.isPrimeByArray(5);
        assertEquals(true, actual);
        log.info("Test passed!");
    }

    @Test
    @DisplayName("Test should pass (returns false) for basic method (small number as input)")
    public void shouldBasicReturnsFalseForSmallNumber() {
        boolean actual = Prime.isPrime(4);
        assertEquals(false, actual);
        log.info("Test passed!");
    }

    @Test
    @DisplayName("Test should pass (returns false) for quick method (small number as input)")
    public void shouldQuickReturnsFalseForSmallNumber() {
        boolean actual = Prime.isPrimeQuick(4);
        assertEquals(false, actual);
        log.info("Test passed!");
    }

    @Test
    @DisplayName("Test should pass (returns false) for quicker method (small number as input)")
    public void shouldQuickerReturnsFalseForSmallNumber() {
        boolean actual = Prime.isPrimeQuicker(4);
        assertEquals(false, actual);
        log.info("Test passed!");
    }

    @Test
    @DisplayName("Test should pass (returns false) for array method (small number as input)")
    public void shouldArrayReturnsFalseForSmallNumber() {
        boolean actual = Prime.isPrimeByArray(4);
        assertEquals(false, actual);
        log.info("Test passed!");
    }

    @Test
    @DisplayName("Test should pass (returns true) for basic method (minimal number as input)")
    public void shouldBasicReturnsTrueForMinimalNumber() {
        boolean actual = Prime.isPrime(2);
        assertEquals(true, actual);
        log.info("Test passed!");
    }

    @Test
    @DisplayName("Test should pass (returns true) for quick method (minimal number as input)")
    public void shouldQuickReturnsTrueForMinimalNumber() {
        boolean actual = Prime.isPrimeQuick(2);
        assertEquals(true, actual);
        log.info("Test passed!");
    }

    @Test
    @DisplayName("Test should pass (returns true) for quicker method (minimal number as input)")
    public void shouldQuickerReturnsTrueForMinimalNumber() {
        boolean actual = Prime.isPrimeQuicker(2);
        assertEquals(true, actual);
        log.info("Test passed!");
    }

    @Test
    @DisplayName("Test should pass (returns true) for array method (minimal number as input)")
    public void shouldArrayReturnsTrueForMinimalNumber() {
        boolean actual = Prime.isPrimeByArray(2);
        assertEquals(true, actual);
        log.info("Test passed!");
    }

    @Test
    @DisplayName("Test should pass (returns false) for basic method (minimal number as input)")
    public void shouldBasicReturnsFalseForMinimalNumber() {
        boolean actual = Prime.isPrime(0);
        assertEquals(false, actual);
        log.info("Test passed!");
    }

    @Test
    @DisplayName("Test should pass (returns false) for quick method (minimal number as input)")
    public void shouldQuickReturnsFalseForMinimalNumber() {
        boolean actual = Prime.isPrimeQuick(0);
        assertEquals(false, actual);
        log.info("Test passed!");
    }

    @Test
    @DisplayName("Test should pass (returns false) for quicker method (minimal number as input)")
    public void shouldQuickerReturnsFalseForMinimalNumber() {
        boolean actual = Prime.isPrimeQuicker(0);
        assertEquals(false, actual);
        log.info("Test passed!");
    }

    @Test
    @DisplayName("Test should pass (returns false) for array method (minimal number as input)")
    public void shouldArrayReturnsFalseForMinimalNumber() {
        boolean actual = Prime.isPrimeByArray(0);
        assertEquals(false, actual);
        log.info("Test passed!");
    }

    @Test
    @DisplayName("Test should pass (returns true) for basic method (big number as input)")
    public void shouldBasicReturnsTrueForBigNumber() {
        boolean actual = Prime.isPrime(1300843);
        assertEquals(true, actual);
        log.info("Test passed!");
    }

    @Test
    @DisplayName("Test should pass (returns true) for quick method (big number as input)")
    public void shouldQuickReturnsTrueForBigNumber() {
        boolean actual = Prime.isPrimeQuick(1300843);
        assertEquals(true, actual);
        log.info("Test passed!");
    }

    @Test
    @DisplayName("Test should pass (returns true) for quicker method (big number as input)")
    public void shouldQuickerReturnsTrueForBigNumber() {
        boolean actual = Prime.isPrimeQuicker(1300843);
        assertEquals(true, actual);
        log.info("Test passed!");
    }

    @Test
    @DisplayName("Test should pass (returns true) for array method (big number as input)")
    public void shouldArrayReturnsTrueForBigNumber() {
        boolean actual = Prime.isPrimeByArray(1300843);
        assertEquals(true, actual);
        log.info("Test passed!");
    }

    @Test
    @DisplayName("Test should pass (returns false) for basic method (big number as input)")
    public void shouldBasicReturnsFalseForBigNumber() {
        boolean actual = Prime.isPrime(1300844);
        assertEquals(false, actual);
        log.info("Test passed!");
    }

    @Test
    @DisplayName("Test should pass (returns false) for quick method (big number as input)")
    public void shouldQuickReturnsFalseForBigNumber() {
        boolean actual = Prime.isPrimeQuick(1300844);
        assertEquals(false, actual);
        log.info("Test passed!");
    }

    @Test
    @DisplayName("Test should pass (returns false) for quicker method (big number as input)")
    public void shouldQuickerReturnsFalseForBigNumber() {
        boolean actual = Prime.isPrimeQuicker(1300844);
        assertEquals(false, actual);
        log.info("Test passed!");
    }

    @Test
    @DisplayName("Test should pass (returns false) for array method (big number as input)")
    public void shouldArrayReturnsFalseForBigNumber() {
        boolean actual = Prime.isPrimeByArray(1300844);
        assertEquals(false, actual);
        log.info("Test passed!");
    }
}