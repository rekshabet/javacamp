package day3Hw2;

public class InstructorManager extends UserManager{

	@Override
	public void startLecture(User user) {
		System.out.println(user.getUserName()+" Hocam�z ders �ekimine ba�lad�. ");
	}

	@Override
	public void makeComment(User user) {
		System.out.println(user.getUserName()+" Hocan�n yorumu.");
	}
	
}
