
public class User {

	private int _id;
	private String _firstName;
	private String _lastName;
	private String _email;
	private String _password;
	private String _avatar;

	public User() {

	}

	public User(int id, String firstName, String lastName, String email, String password, String avatar) {
		this._id = id;
		this._firstName = firstName;
		this._lastName = lastName;
		this._email = email;
		this._password = password;
		this._avatar = avatar;
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getFirstName() {
		return _firstName;
	}

	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getPassword() {
		return _password;
	}

	public void setPassword(String password) {
		_password = password;
	}

	public String getAvatar() {
		return _avatar;
	}
	
	public void setAvatar(String avatar) {
		_avatar=avatar;
	}

}
