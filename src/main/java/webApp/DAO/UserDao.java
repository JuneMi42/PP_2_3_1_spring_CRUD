package webApp.DAO;

import org.springframework.stereotype.Repository;
import webApp.model.User;

import java.util.List;

@Repository
public interface UserDao {
    List<User> getUsers();

    User getUserById(int id);

    void save(User user);

    void update(int id, User updateUser);

    void delete(User user);

}
