package pl.coderslab.unittestskrajeew05.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void shouldSetUserId() {
        User u = new User();
        u.setId(1L);

        assertEquals(1L, u.getId());
    }

    @Test
    public void shouldSetUserName() {
        User u = new User();
        u.setName("ala");

        assertEquals("ala", u.getName());
    }
}