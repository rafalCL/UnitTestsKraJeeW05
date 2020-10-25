package pl.coderslab.unittestskrajeew05.model;

import java.util.Objects;

public class User {
    private long id;
    private String name;

    public User(){
    }

    public User(User other){
        this.id = other.id;
        this.name = other.name;
    }

    public long getId() {
        return id;
    }

    public User setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(name, user.name);
    }
}
