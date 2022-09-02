package webApp.DAO;
import org.springframework.stereotype.Repository;
import webApp.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao{

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<User> getUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public User getUserById(int id) {
        return entityManager.createQuery("from User user WHERE user.id = :id", User.class).setParameter("id", id).getSingleResult();
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public void update(int id, User user) {
        entityManager.merge(user);
    }

    @Override
    public void delete(User user) {
        entityManager.remove(user);
    }
}
