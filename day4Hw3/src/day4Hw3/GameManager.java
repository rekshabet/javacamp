package day4Hw3;

public class GameManager {
public void add(Game game) {
	System.out.println(game.getName()+ " isimli oyun eklendi");
}
public void update(Game game) {
	System.out.println(game.getName()+ " isimli oyun g�ncellendi");
}
public void delete(Game game) {
	System.out.println(game.getName()+ " isimli oyun silindi");
}
}
