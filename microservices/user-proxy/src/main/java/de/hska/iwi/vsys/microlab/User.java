package de.hska.iwi.vsys.microlab;

public class User {

	private Long id;
	private String name;
	private String passwd;

	public User(){}
			
	public User(Long id, String name, String pwd) {
		this.id = id;
		this.name = name;
		this.passwd = pwd;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", passwd=" + passwd + "]";
	}

}
