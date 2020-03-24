package com.example3.kingdom;

import com.example3.kingdom.model.*;

import com.example3.kingdom.model.Character;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Demo {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	@SneakyThrows
	public static void main(String[] args) {
		String continueChoice;
		Character character = null;
		do {
			System.out.print("Please, select a character:" + "\n" +
					"1 - Queen" + "\n" +
					"2 - King" + "\n" +
					"3 - Knight" + "\n" +
					"4 - Troll" + "\n");
			int choice = Integer.parseInt(reader.readLine());

			if (choice > 4 || choice < 1) {
				System.out.print("Wrong choice, try again ");
				continueChoice = "Y";
				continue;
			}

			if (choice == 1) {
				character = new Queen();
				character.setWeapon(new BowAndArrowBehaviour());
			}
			if (choice == 2) {
				character = new King();
				character.setWeapon(new KnifeBehaviour());
			}
			if (choice == 3) {
				character = new Knight();
				character.setWeapon(new SwordBehaviour());
			}
			if (choice == 4) {
				character = new Troll();
				character.setWeapon(new AxeBehaviour());
			}
			character.fight();

			System.out.print("Do you wish to continue selecting products? Y/N: ");
			continueChoice = reader.readLine();
		} while (continueChoice.equalsIgnoreCase("Y"));
	}
}
