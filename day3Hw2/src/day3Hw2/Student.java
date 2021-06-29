package day3Hw2;

public class Student extends User{
	private int studentClass;
	private String studentSchoolsName;
	public Student(int userID, String userName, String userPassword, String userStatus, int studentClass,
			String studentSchoolsName) {
		super(userID, userName, userPassword, userStatus);
		this.studentClass = studentClass;
		this.studentSchoolsName = studentSchoolsName;
	}
	public int getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(int studentClass) {
		this.studentClass = studentClass;
	}
	public String getStudentSchoolsName() {
		return studentSchoolsName;
	}
	public void setStudentSchoolsName(String studentSchoolsName) {
		this.studentSchoolsName = studentSchoolsName;
	}
	
}
