package lv.dita.modules;

import java.util.ArrayList;

public class League {
	private String nameLeague;
	private ArrayList<Team> nameOfTeam;
	
	public League (String nameOfLeague){
	this.nameLeague = nameOfLeague;
	this.nameOfTeam = new ArrayList<>();
	}

	public String getNameLeague() {
		return nameLeague;
	}

	public void setNameLeague(String nameLeague) {
		this.nameLeague = nameLeague;
	}

	public void setNameOfTeams(ArrayList<Team> nameOfTeam){
		this.nameOfTeam = nameOfTeam;
		
	}
	public ArrayList<Team> getNameOfTeam() {
		return nameOfTeam;
	}

	public void recordWinAndLoss(Team winner, Team loser){
		int i = 0;
		winner.setWins(1);
		++i;
		
		
	}
	
	@Override
	public String toString() {
		return "League [nameLeague=" + nameLeague + ", nameOfTeam="
				+ nameOfTeam + "]";
	}

}
