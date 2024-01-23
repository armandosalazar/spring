package rest;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.entities.User;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserRestController {
    private List<User> users;

    @PostConstruct // This annotation is used to execute the method after the bean is initialized
    public void init() {
        users = new ArrayList<>();
        users.add(new User("armando@user", "123456"));
        users.add(new User("jose@user", "123456"));
        users.add(new User("maria@user", "123456"));
    }

    @GetMapping
    public List<User> getUsers() {
        return users;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") int id) {
        return users.get(--id);
    }
}
