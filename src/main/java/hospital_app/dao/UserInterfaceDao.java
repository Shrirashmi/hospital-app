package hospital_app.dao;

import java.util.List;

import hospital_app.dto.User;

public interface UserInterfaceDao {
	public abstract User saveUser(User user);
	public abstract User getUserById(int userId);
	public abstract User getUserByPhone(String phone);
	public abstract List<User> getUserByRole(String role);
	public abstract User updateUserById(int userId, User user);
	public abstract boolean deleteUserById(int userId);
	public abstract List<User> getAllUsers();
	public abstract User validateUser(String email, String password);
}
