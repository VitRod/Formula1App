package com.fox;

public class Racer {

	private String name;
	private String teamName;
	private String abbreviation;

	public Racer(String name, String teamName, String abbreviation) {
		this.name = name;
		this.teamName = teamName;
		this.abbreviation = abbreviation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	@Override
	public String toString() {
		return "Racer [name=" + name + ", teamName=" + teamName + ", abbreviation=" + abbreviation + "]";
	}
}
