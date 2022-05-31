package hospital_app.service;

import java.util.List;

import hospital_app.dao.UserDaoImpl;
import hospital_app.dto.User;

public class UserService {
	public User saveUser(User user) {
		UserDaoImpl dao = new UserDaoImpl();
		return dao.saveUser(user);
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
