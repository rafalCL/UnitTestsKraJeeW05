package pl.coderslab.unittestskrajeew05.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorsTest {

    @Test
    public void generatePrimeFactors6() {
        final int[] expected = {1,2,3,6};
        final int[] actual = Factors.generatePrimeFactors(6);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void generatePrimeFactors13() {
        final int[] expected = {1,13};
        final int[] actual = Factors.generatePrimeFactors(13);

        assertArrayEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void generatePrimeFactors0() {
        final int[] actual = Factors.generatePrimeFactors(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void generatePrimeFactorsNegativeNumber() {
        final int[] actual = Factors.generatePrimeFactors(-5);
    }
}