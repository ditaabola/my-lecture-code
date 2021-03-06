package lv.dita.modules;

import java.util.ArrayList;

public class League {
	private String nameLeague;
	private ArrayList<Team> nameOfTeam;

	public League(String nameOfLeague) {
		this.nameLeague = nameOfLeague;
		this.nameOfTeam = new ArrayList<>();
	}

	public String getNameLeague() {
		return nameLeague;
	}

	public void setNameLeague(String nameLeague) {
		this.nameLeague = nameLeague;
	}

	public void setNameOfTeams(ArrayList<Team> nameOfTeam) {
		this.nameOfTeam = nameOfTeam;

	}

	public ArrayList<Team> getNameOfTeam() {
		return nameOfTeam;
	}

	public void recordWinAndLoss(String winnerName, String loserName) {
		Team winner = this.teamWithName(winnerName);
		Team loser = this.teamWithName(loserName);
		
			
		winner.wins++;
		loser.losses++;
	}
	

	public void recordTies(String oneName, String twoName) {
		Team tiesOne = this.teamWithName(oneName);
		Team tiesTwo = this.teamWithName(twoName);
		tiesOne.ties++;
		tiesTwo.ties++;
	}

	public Team teamWithName(String nameToLookFor) {
		Team teamCreated = null;
		for (Team team : this.nameOfTeam) {
			if (team.name.equals(nameToLookFor)) {
				teamCreated = team;
			}
		}
		return teamCreated;
	}

	@Override
	public String toString() {
		return "League [nameLeague=" + nameLeague + ", nameOfTeam="
				+ nameOfTeam + "]";
	}

}
