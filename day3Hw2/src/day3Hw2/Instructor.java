package day3Hw2;

public class Instructor extends User{
	private String insDepartment;

	public Instructor(int userID, String userName, String userPassword, String userStatus, String insDepartment) {
		super(userID, userName, userPassword, userStatus);
		this.insDepartment = insDepartment;
	}

	public String getInsDepartment() {
		return insDepartment;
	}

	public void setInsDepartment(String insDepartment) {
		this.insDepartment = insDepartment;
	}
	

}
