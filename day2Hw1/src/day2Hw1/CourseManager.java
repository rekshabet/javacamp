package day2Hw1;

public class CourseManager {
	public void startToCourse(Courses course) {
		if(course.isOpen) {
			System.out.println(course.courseName+" adlı kursa başladınız");
		}
	}
	public void viewTheCoursesFutures(Courses course) {
		System.out.println("Kursun id'si: "+ course.courseId);
		System.out.println("Kursun adı: "+ course.courseName);
		System.out.println("Kursun eğitmeni: "+ course.instructorsName);
		System.out.println("Kursun durumu: "+ course.courseName);
		System.out.println("Kursun alınabilirliği: "+ (course.isOpen ? "Açık": "Kapalı"));
		System.out.println("Kursun ders sayısı: "+ course.countLectures);
		System.out.println("Kursun ödev sayısı: "+ course.countHomeworks);
	}
	
}
