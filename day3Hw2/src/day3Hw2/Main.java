package day3Hw2;

public class Main {
/*t(int userID, String userName, String userPassword, String userStatus, int studentClass,
			String studentSchoolsName) */
	public static void main(String[] args) {
		Student student = new Student(111, "Cem G�m��", "password1", "��renci ",2, "IUC");
		new StudentManager().startLecture(student);
		new StudentManager().makeComment(student);
		Instructor instructor = new Instructor(123, "Bar�� Man�o","password2","E�itmen","M�zik");
		new InstructorManager().startLecture(instructor);
		new InstructorManager().makeComment(instructor);
		User user = new User(00, "Default", "default", "Kulllan�c�");
		new UserManager().startLecture(user);
		new UserManager().makeComment(user);
	}

}
