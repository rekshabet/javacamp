package day3Hw2;

public class StudentManager extends UserManager{
	@Override
	public void startLecture(User user) {
		System.out.println(user.getUserName()+" dersi izlemeye başladı. ");
	}

	@Override
	public void makeComment(User user) {
		System.out.println(user.getUserName()+" öğrencisinin yorumu.");
	}
	
}
