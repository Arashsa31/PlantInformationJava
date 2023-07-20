package LabProgram218;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlantArrayListExample {

	// TODO: Define a printArrayList method that prints an ArrayList of plant (or
	// flower) objects

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String input;
		// TODO: Declare an ArrayList called myGarden that can hold object of type plant
		ArrayList<Plant> myGarden = new ArrayList<Plant>();
		// TODO: Declare variables - plantName, plantCost, flowerName, flowerCost,
		// colorOfFlowers, isAnnual
		String plantName = "", plantCost = "", flowerName = "", flowerCost = "", colorOfFlowers = "";
		boolean isAnnual = false;

		input = scnr.next();
		while (!input.equals("-1")) {
			// TODO: Check if input is a plant or flower
			// Store as a plant object or flower object
			// Add to the ArrayList myGarden

			if (input.equalsIgnoreCase("plant")) {
				plantName = scnr.next();
				plantCost = scnr.next();

				Plant tempPlant = new Plant();

				tempPlant.setPlantName(plantName);
				tempPlant.setPlantCost(plantCost);

				myGarden.add(tempPlant);
			} else {
				flowerName = scnr.next();
				flowerCost = scnr.next();
				isAnnual = scnr.nextBoolean();
				colorOfFlowers = scnr.next();

				Flower tempFlower = new Flower();

				tempFlower.setPlantName(flowerName);
				tempFlower.setPlantCost(flowerCost);
				tempFlower.setPlantType(isAnnual);
				tempFlower.setColorOfFlowers(colorOfFlowers);

				myGarden.add(tempFlower);
			}

			input = scnr.next();
		}

		// TODO: Call the method printArrayList to print myGarden
		for (int i = 0; i < myGarden.size(); i++) {
			System.out.println("Plant " + (i+1) + " Information: ");
			myGarden.get(i).printInfo();
			System.out.println();
		}
	}
}