package main;

import java.util.List;

import enums.ProfessionType;

public class ProductionPhaseController {
	
	private final CreatureService creatureService = new CreatureService();
	private final KeyboardCommandListener keyboardCommandListener = new KeyboardCommandListener();
	
	public void startProductionPhase(List<Creature> creatures, Field field) {

		
		System.out.println("production phase starting...");

		while(true) {
			long farmersAmount = creatureService.getCreatureProfessionAmount(creatures, ProfessionType.FARMER);
			
			System.out.flush(); 

			System.out.println("you have " + farmersAmount + " farmers to sow fields. Choose how many fields to be sown: ");
			try {
				long input = keyboardCommandListener.listenCommand(farmersAmount);
				field.sowField(input);
				System.out.println("total sown fields: " + field.getSownSize());
				break;
			} catch (NumberFormatException ex) {
				System.err.println("insert a number");
			}
		}
	}
}
