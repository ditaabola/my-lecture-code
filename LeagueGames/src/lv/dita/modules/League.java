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

	public ArrayList<Team> getNameOfTeam() {
		return nameOfTeam;
	}

	@Override
	public String toString() {
		return "League [nameLeague=" + nameLeague + ", nameOfTeam="
				+ nameOfTeam + "]";
	}

}