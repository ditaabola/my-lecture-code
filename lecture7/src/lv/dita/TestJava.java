package lv.dita;

import lv.dita.geometricfigures.Circle;
import lv.dita.player.FootballPlayer; //lai importetu visu konkreta folderi, var izmantot lv.dita.player*

public class TestJava {

	public static void main(String[] args) {
	//  klases nos. mainigais = new klases nosaukums ("veertiibas");
		FootballPlayer player = new FootballPlayer("Ronaldo", "Forward", 7, true, 184, 76); // definee veertibas
		
	
		System.out.println(player.getName());
		System.out.println(player.getPosition());
		System.out.println(player.getShirtNumber());
		System.out.println(player.isBuild());
		System.out.println(player.getHeight());
		System.out.println(player.getWeight());
		
		player.setShirtNumber(10); // maina veertiibu;
		System.out.println("---------------------------");
		System.out.println(player.getName());
		System.out.println(player.getPosition());
		System.out.println(player.getShirtNumber());
		System.out.println(player.isBuild());
		System.out.println(player.getHeight());
		System.out.println(player.getWeight());
		
		
	}

}
