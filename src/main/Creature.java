package main;

import enums.ProfessionType;
import enums.RaceType;

public class Creature {
	private RaceType race;
	private ProfessionType profession;
	
	public Creature() {
		this.setRace(RaceType.HUMAN);
		this.setProfession(ProfessionType.FARMER);
	}
	
	public Creature(ProfessionType profession) {
		this.setRace(RaceType.HUMAN);
		this.setProfession(profession);
	}
	
	public RaceType getRace() {
		return race;
	}
	public void setRace(RaceType race) {
		this.race = race;
	}
	public ProfessionType getProfession() {
		return profession;
	}
	public void setProfession(ProfessionType profession) {
		this.profession = profession;
	}
}
