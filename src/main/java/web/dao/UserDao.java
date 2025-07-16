package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;
import java.util.List;

@Repository
public interface UserDao {
    List<User> getAllUsers();
    void saveUser(User user);
    User getUserById(Long id);
    void updateUser(User user);
    void deleteUser(Long id);
}