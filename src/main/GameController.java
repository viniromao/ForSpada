package main;

import java.util.Arrays;
import java.util.List;

import enums.ProductType;
import enums.ProfessionType;
import enums.Season;

public class GameController {
	private ProductionPhaseController productionPhaseController = new ProductionPhaseController();
	private HarvestPhaseController harvestPhaseController = new HarvestPhaseController();

	public void startGame() {
		int seasonIndex = 0;
		Warehouse warehouse = new Warehouse();
		Field field = new Field();
		Creature creature = new Creature();
		Creature creature2 = new Creature(ProfessionType.MINER);
		Creature creature3 = new Creature();
		List<Creature> creatures = Arrays.asList(creature, creature2, creature3);
    
		field.setProductType(ProductType.WHEAT);
		field.setTotalSize(10);
		while (true) {
			
			System.out.println(Season.values()[seasonIndex % 4]);
			productionPhaseController.startProductionPhase(creatures, field);
			harvestPhaseController.startHaverstPhase(creatures, field, warehouse);
			
			seasonIndex++;
		}
	}
}
