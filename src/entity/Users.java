package entity;

public class Users {
	private int userId;
	private String firstName;
	private String lastName;
	private String email;
	private String userName;
	private String userBio;
	private String password;
	
	public Users (int userId, String firstName, String lastName, String email, 
			String userName, String userBio, String password) {
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userName = userName;
		this.userBio = userBio;
		this.password = password;
	}
	
	public int getUserId() {
		return userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserBio() {
		return userBio;
	}

	public String getPassword() {
		return password;
	}

}