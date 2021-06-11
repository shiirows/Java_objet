package javaObjet;

public class Main {

	public static void main(String[] args) {
		Player player1 = new Player("Alexandre", 30.0, 50.0);
		player1.force(5);
		System.out.println(player1.getHealth());
		
		Player player2 = new Player("Rachid", 30.0, 54.0);
		System.out.println(player2.getHealth());
		
		if(player2.getAttack() == player1.getAttack() ) {
			System.out.println("il on la même force");
		}else {System.out.println("un des joueur es plus fore " );
			
		}
	}
	

}
