package hospital_app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hospital_app.dto.User;

public class UserDaoImpl implements UserInterfaceDao{

	public User saveUser(User user) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shri");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		User user2 = entityManager.find(User.class, user.getUserId());
		return user2;
	}

	public User getUserById(int userId) {
		return null;
	}

	public User getUserByPhone(String phone) {
		return null;
	}

	public List<User> getUserByRole(String role) {
		return null;
	}

	public User updateUserById(int userId, User user) {
		return null;
	}

	public boolean deleteUserById(int userId) {
		return false;
	}

	public List<User> getAllUsers() {
		return null;
	}

	public User validateUser(String email, String password) {
		return null;
	}

}
