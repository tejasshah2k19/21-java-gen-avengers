package amazon;

//bean is POJO class ==> plain old java object 

public class UserBean {

	private int userId;
	private String firstName, email, password;
	private boolean admin = false;

	public UserBean() {
		// TODO Auto-generated constructor stub
	}

	public UserBean(String fn, String em, String pwd) {
		this.userId = (int) (Math.random() * 100000);
		this.firstName = fn;
		this.email = em;
		this.password = pwd;

	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

}
