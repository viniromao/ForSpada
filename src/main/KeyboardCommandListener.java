package main;

import java.util.Scanner;

public class KeyboardCommandListener {

	public long listenCommand(long maxAmount) {
				@SuppressWarnings("resource")
				Scanner command = new Scanner(System.in);
				String inputString = command.nextLine();
				long input = Long.parseLong(inputString, 10);
				
				if(input > maxAmount) {
					return maxAmount;
				}
				
				return input;
	}
}
