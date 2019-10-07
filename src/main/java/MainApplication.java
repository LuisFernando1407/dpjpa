import entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainApplication {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
        EntityManager em = entityManagerFactory.createEntityManager();

        User user = em.find(User.class, 1);

        System.out.println("-----------------------");

        System.out.println(user.toString());
    }
}