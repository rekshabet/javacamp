package day4Hw3;

public class Main {

	public static void main(String[] args) {
Game game=new Game(1, "dota");
Gamer gamer=new Gamer(1, "sait", "cnky", "1999");
Campaign campaign=new Campaign(1, "sale sale sale...");

Sale sale=new Sale(1,1,1,1);
SaleManager manager=new SaleManager();
manager.add(sale);
	}

}
