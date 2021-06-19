package entity;

public class Users {
	private int user_id;
	private String first_name;
	private String last_name;
	private String email;
	private String username;
	private String user_bio;
	private String password;

	public Users(int user_id, String first_name, String last_name, String email, String username, String user_bio, String password) {
		this.user_id = user_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.username = username;
		this.user_bio = user_bio;
		this.password = password;
	}

	public int getUser_id() {
		return user_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public String getEmail() {
		return email;
	}
	public String getUsername() {
		return username;
	}
	public String getUser_bio() {
		return user_bio;
	}
	public String getPassword() {
		return password;
	}

	
}
