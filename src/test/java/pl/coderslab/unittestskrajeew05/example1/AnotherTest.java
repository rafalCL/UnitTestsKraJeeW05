package pl.coderslab.unittestskrajeew05.example1;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnotherTest {
    @Test
    public void firstTest(){
        assertFalse(3>4);
    }

    @Ignore
    @Test
    public void secondTest(){
        fail("not implemented");
    }
}