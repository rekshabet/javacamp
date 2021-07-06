package day4Hw3;

public class Gamer {
	
private int id;
private String name;
private String surname;
private String birthYear;

public Gamer(int id, String name, String surname, String birthYear) {
	super();
	this.id = id;
	this.name = name;
	this.surname = surname;
	this.birthYear = birthYear;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public String getBirthYear() {
	return birthYear;
}
public void setBirthYear(String birthYear) {
	this.birthYear = birthYear;
}


}
