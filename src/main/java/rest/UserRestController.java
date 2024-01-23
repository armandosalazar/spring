package rest;

import jakarta.annotation.PostConstruct;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
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
        if (id < 0 || id >= users.size()) {
            throw new UserNotFoundException("User id(" + id + ") not found!");
        }

        return users.get(id);
    }

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleException(UserNotFoundException e) {
        ErrorResponse errorResponse = new ErrorResponse(e.getMessage(), 404, System.currentTimeMillis());
        // ErrorResponse errorResponse = new ErrorResponse(e.getMessage(), HttpStatus.NOT_FOUND, System.currentTimeMillis());
        return ResponseEntity.status(404).body(errorResponse);
    }

    @ExceptionHandler // This annotation is used to handle all exceptions
    public ErrorResponse handleException(Exception e) {
        return new ErrorResponse(e.getMessage(), 400, System.currentTimeMillis());
    }
}
