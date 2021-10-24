package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {

	private ArrayList<Jet> jets = new ArrayList<>();

	public AirField() {

	}

	public AirField(ArrayList<Jet> jets) {
		this.jets = jets;
	}

	public ArrayList<Jet> getJets() {
		return jets;
	}

	public void setJets(ArrayList<Jet> jets) {
		this.jets = jets;
	}

	@Override
	public String toString() {
		return "AirField [jets=" + jets + ", toString()=" + super.toString() + "]";
	}

	public List<Jet> readJetFileThenPopulateAirField(String fileName) {

		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] jetArray = line.split(",");
				createJetThenAddToAirField(jetArray);
			}
		} catch (IOException e) {
			System.err.println(e);
		}

		return jets;
	}

	public Jet createJetThenAddToAirField(String[] arrayOfJetInfo) {

		Jet newPassJet = null;
		Jet newBroom = null;
		Jet newFighterJet = null;

		String jetType = arrayOfJetInfo[0];
		String model = arrayOfJetInfo[1];
		double speed = Double.parseDouble(arrayOfJetInfo[2]);
		int range = Integer.parseInt(arrayOfJetInfo[3]);
		long price = Long.parseLong(arrayOfJetInfo[4]);

		if (jetType.equals("PassengerJet")) {
			newPassJet = new PassengerJet(model, speed, range, price);
			jets.add(newPassJet);
			return newPassJet;
		} else if (jetType.equals("Broom")) {
			newBroom = new Broom(model, speed, range, price);
			jets.add(newBroom);
			return newBroom;
		} else {
			newFighterJet = new FighterJet(model, speed, range, price);
			jets.add(newFighterJet);
			return newFighterJet;
		}

	}

	public void listFleet() {
		System.out.println();
		for (Jet jet : jets) {
			System.out.println(jet.toString());
		}
		System.out.println();
	}

	public void flyAllJets() {
		System.out.println();
		for (Jet jet : jets) {
			jet.fly();
		}
		System.out.println();
	}

	public void viewFastestJet() {
		System.out.println();
		Jet fastestJet = null;
		double fastestSpeed = 0.0;

		for (Jet jet : jets) {
			if (jet.getSpeed() > fastestSpeed) {
				fastestSpeed = jet.getSpeed();
				fastestJet = jet;
			}
		}
		System.out.println("The fastest jet is the " + fastestJet.getModel() + ".\n");
		System.out.println(fastestJet.toString() + "\n");
	}

	public void viewJetWithLongestRange() {
		System.out.println();
		Jet longestRangeJet = null;
		int longestRange = 0;

		for (Jet jet : jets) {
			if (jet.getRange() > longestRange) {
				longestRangeJet = jet;
				longestRange = jet.getRange();
			}
		}
		System.out.println("The jet with the longest range is the " + longestRangeJet.getModel() + ".\n");
		System.out.println(longestRangeJet.toString() + "\n");
	}

	public void inspectRegulatedJets() {
		System.out.println();
		for (Jet jet : jets) {
			if (jet instanceof PassengerJet) {
				((PassengerJet) jet).getInspected();
			}
		}
		System.out.println();
	}

	public void chaseTarget() {
		System.out.println();
		for (Jet jet : jets) {
			if (jet instanceof Broom) {
				((Broom) jet).zoomAtTarget();
			} else if (jet instanceof FighterJet) {
				((FighterJet) jet).zoomAtTarget();
			}
		}
		System.out.println();
	}

	public void addJetToFleet() {
		Scanner scanner = new Scanner(System.in);
		Jet newJet = new PassengerJet();

		System.out.println("\nUser, please enter the model name of the new jet: ");
		String jetModel = scanner.nextLine();
		newJet.setModel(jetModel);

		System.out.println("User, please enter the top speed of the new jet in MPH: ");
		double jetSpeed = scanner.nextDouble();
		newJet.setSpeed(jetSpeed);

		System.out.println("User, please enter the range of the new jet in miles: ");
		int jetRange = scanner.nextInt();
		newJet.setRange(jetRange);

		System.out.println("User, please enter the price of the new jet in USD: ");
		long jetPrice = scanner.nextLong();
		scanner.nextLine();
		newJet.setPrice(jetPrice);

		jets.add(newJet);

		System.out.println("\nJet added to the fleet, thank you.\n");
	}

	public void removeJetFromFleet() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("There are " + jets.size() + " jets in the fleet.\n");
		for (int i = 0; i < jets.size(); i++) {
			int numJet = i + 1;
			System.out.println("\t" + numJet + ". " + jets.get(i).getModel());
		}
		System.out.println("\nSelect the number of the jet you would like to remove from the fleet.\n");
		int jetToRemove = scanner.nextInt() - 1;
		scanner.nextLine();

		jets.remove(jetToRemove);

		System.out.println("Your choice has been removed from the fleet.\n");

	}

}
