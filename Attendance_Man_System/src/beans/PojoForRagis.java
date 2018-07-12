package beans;

public class PojoForRagis {
	
	private int id;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private String cpassword;
	private String gender;
    

	public PojoForRagis( String fname, String lname, String email, String password, String cpassword,
			String gender) {
		super();
		
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.cpassword = cpassword;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
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

	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public PojoForRagis() {
		// TODO Auto-generated constructor stub
	}

}
