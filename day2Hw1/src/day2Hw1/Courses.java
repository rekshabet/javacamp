package day2Hw1;

public class Courses {
	int courseId;
	String courseName;
	String instructorsName;
	String courseStatus;
	boolean isOpen;
	int countLectures;
	int countHomeworks;
	public Courses(int courseId, String courseName, String instructorsName, String courseStatus, boolean isOpen,
			int countLectures, int countHomeworks) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.instructorsName = instructorsName;
		this.courseStatus = courseStatus;
		this.isOpen = isOpen;
		this.countLectures = countLectures;
		this.countHomeworks = countHomeworks;
	}
	
	
}
