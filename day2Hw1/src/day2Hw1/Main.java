package day2Hw1;

public class Main {
/*int courseId, String courseName, String instructorsName, String courseStatus, boolean isOpen,
			int countLectures, int countHomeworks*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Courses course1 = new Courses(1, "Java&React", "Engin Demiroð", "Ücretiz", true, 16, 27);
		Courses course2 = new Courses(2, "C#&Angular", "Engin Demiroð", "Ücretiz", true, 20, 40);
		Courses course3 = new Courses(3, "Boþ Kurs", "Someone Else", "Ücretiz", false, 0, 0);
		Courses[] courseArray = {
				course1, course2, course3
		};
		Courses[] courseArray1 = {
				course1, course2
		};
		Courses[] courseArray2 = {
				course3
		};
		System.out.println("Kurslarýmýz:");
		for(Courses course: courseArray) {
			System.out.println(course.courseName);
		}
		System.out.println();
		Instructor ins1 = new Instructor(11, "Engin Demiroð", courseArray1);
		Instructor ins2 = new Instructor(22, "Someone Else", courseArray2);
		Instructor[] instArray = {ins1, ins2};
		System.out.println("Eðitmenlerimiz:");
		for(Instructor instructor: instArray) {
			System.out.println(instructor.instructorName);
		}
		System.out.println();
		new CourseManager().startToCourse(course1);
		System.out.println();
		new CourseManager().startToCourse(course2);
		System.out.println();
		new CourseManager().viewTheCoursesFutures(course1);
		System.out.println();
		new CourseManager().viewTheCoursesFutures(course2);
		
	}

}
