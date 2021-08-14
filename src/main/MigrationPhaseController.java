package main;

import java.util.List;

import enums.ProductType;
import enums.ProfessionType;

public class MigrationPhaseController {
	private final CreatureService creatureService = new CreatureService();
	private final KeyboardCommandListener keyboardCommandListener = new KeyboardCommandListener();
	
	public void startMigrationPhase(List<Creature> creatures, Field field, Warehouse warehouse) {
		System.out.println("migration phase starting...");
		while(true) {
			long farmersAmount = creatureService.getCreatureProfessionAmount(creatures, ProfessionType.FARMER);
			System.out.flush(); 

			System.out.println("you have " + farmersAmount + " idle farmers: choose how many farmers to harvest");
			try {
				long input = keyboardCommandListener.listenCommand(farmersAmount);
				field.harvestField(input, warehouse, ProductType.WHEAT);
				System.out.println("total sown fields: " + field.getSownSize());
				System.out.println("you have a total amount of: " + warehouse.getWheatAmountStored() + " wheat");
				break;
			} catch (NumberFormatException ex) {
				System.err.println("insert a number");
			}
		}
	}
}
