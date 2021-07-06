package day4Hw3;

public class GamerManager {
ValidationService service;

public GamerManager(ValidationService service) {
	this.service = service;
}
public void add(Gamer gamer) {
	System.out.println(gamer.getName()+" isimli kullanýcý kaydedildi");
}
public void update(Gamer gamer) {
	System.out.println(gamer.getName()+" isimli kullanýcý güncellendi");
}
public void delete(Gamer gamer) {
	System.out.println(gamer.getName()+" isimli kullanýcý kaydedildi");
}
}
