package day2Hw1;

public class CourseManager {
	public void startToCourse(Courses course) {
		if(course.isOpen) {
			System.out.println(course.courseName+" adl� kursa ba�lad�n�z");
		}
	}
	public void viewTheCoursesFutures(Courses course) {
		System.out.println("Kursun id'si: "+ course.courseId);
		System.out.println("Kursun ad�: "+ course.courseName);
		System.out.println("Kursun e�itmeni: "+ course.instructorsName);
		System.out.println("Kursun durumu: "+ course.courseName);
		System.out.println("Kursun al�nabilirli�i: "+ (course.isOpen ? "A��k": "Kapal�"));
		System.out.println("Kursun ders say�s�: "+ course.countLectures);
		System.out.println("Kursun �dev say�s�: "+ course.countHomeworks);
	}
	
}
