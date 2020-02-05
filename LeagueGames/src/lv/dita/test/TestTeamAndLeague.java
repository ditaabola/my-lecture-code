package lv.dita.test;

import java.util.ArrayList;

import lv.dita.modules.League;
import lv.dita.modules.Team;

public class TestTeamAndLeague {

	public static void main(String[] args) {

		League khl = new League("KHL");
		ArrayList<Team> arr = new ArrayList<>();
		Team ska = new Team("SKA");
		Team cska = new Team("CSKA");
		arr.add(ska);
		arr.add(cska);

		khl.setNameOfTeams(arr);
		ska.setWins(1);
		ska.setWins(1);
		System.out.println(khl.toString());
	}
}
