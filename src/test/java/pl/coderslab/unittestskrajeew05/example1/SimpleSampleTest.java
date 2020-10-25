package pl.coderslab.unittestskrajeew05.example1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleSampleTest {
    @Test
    public void firstTest(){
        // given
        final int firstNum = 2;
        final int secondNum = 2;
        // when
        final int sum = firstNum + secondNum;
        // then
        assertEquals(4, sum);
    }

    @Test
    public void secondTest(){
        assertEquals(5, 2+3);
    }
}