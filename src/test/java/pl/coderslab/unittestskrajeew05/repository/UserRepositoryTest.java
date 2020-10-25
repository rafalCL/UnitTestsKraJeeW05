package pl.coderslab.unittestskrajeew05.repository;

import org.junit.Test;
import pl.coderslab.unittestskrajeew05.model.User;

import static org.junit.Assert.*;

public class UserRepositoryTest {

    @Test
    public void create() {
        UserRepository ur = new UserRepository();
        User u = new User().setName("ala");

        ur.create(u);

        assertEquals(1L, ur.count());
        assertEquals(1L, u.getId());
        User user = ur.readById(1L);
        assertEquals(user, u);
    }

    @Test
    public void update() {
        // given
        UserRepository ur = new UserRepository();
        User u = new User().setName("ala");

        ur.create(u);

        // when
        u.setName("ola");
        ur.update(u);

        // then
        assertEquals("ola", u.getName());
        assertEquals(1L, ur.count());
        assertEquals(1L, u.getId());
        User user = ur.readById(1L);
        assertEquals(user, u);
    }

    @Test
    public void delete() {
        UserRepository ur = new UserRepository();
        User u = new User().setName("ala");

        ur.create(u);

        ur.delete(u);

        assertEquals(0L, ur.count());
        assertEquals(0L, u.getId());
    }
}