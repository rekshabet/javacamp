package day3Hw2;

public class UserManager {
	public void startLecture(User user) {
		System.out.println(user.getUserName()+" derse başladı");
	}
	public void makeComment(User user) {
		System.out.println(user.getUserName()+" kullanıcısının yorumu.");
	}
}
