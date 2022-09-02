package webApp.Service;

import webApp.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User getUserById(int id);
    void save(User user);
    void update(int id, User updateUser);
    void deleteById(int id);
}
