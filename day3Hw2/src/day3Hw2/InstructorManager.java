package day3Hw2;

public class InstructorManager extends UserManager{

	@Override
	public void startLecture(User user) {
		System.out.println(user.getUserName()+" Hocamýz ders çekimine baþladý. ");
	}

	@Override
	public void makeComment(User user) {
		System.out.println(user.getUserName()+" Hocanýn yorumu.");
	}
	
}
