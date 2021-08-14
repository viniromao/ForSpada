package main;

import java.util.List;

import enums.ProfessionType;
import enums.RaceType;

public class CreatureService {
	
	public long getCreatureProfessionAmount(List<Creature> creatures, ProfessionType profession) {
		return creatures.stream()
				.filter(creature -> creature.getProfession().equals(profession))
				.count();
	}
	
	public long getCreatureRaceAmount(List<Creature> creatures, RaceType race) {
		return creatures.stream()
				.filter(creature -> creature.getProfession().equals(race))
				.count();
	}
	
}
