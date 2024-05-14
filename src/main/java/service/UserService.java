package service;

import org.apache.catalina.User;

import java.util.List;

public interface UserService {
    User getUserById(Integer id);
    List<User> getAllUsers();
    void saveUser(User user);
    void deleteUserById(Integer id);
}
