package domain;

public class User extends Person {
	private String loginName;
	private String password;
	private int status;
	private int role;

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginname) {
		this.loginName = loginname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

}
