package com.skilldistillery.jets.app;


import java.util.Scanner;
import com.skilldistillery.jets.entities.AirField;


public class JetsApplication {

	private static AirField airField;
	private static boolean runApp;
	private static Scanner scanner = new Scanner(System.in);
	private static int choice;
	private static JetsApplication ja;

	public static void main(String[] args) {
		ja = new JetsApplication();
		airField = new AirField();
		runApp = true;

		ja.run();
		
	}
	
	public void run() {
		airField.readJetFileThenPopulateAirField("jets.txt");
		while (runApp) {
			ja.printMenu();
			choice = scanner.nextInt();
			ja.menuChoice(choice);
		}
		scanner.close();
	}

	public void printMenu() {
		scanner = new Scanner(System.in);

		System.out.println("   Welcome to the Jetsetter App");
		System.out.println("Please select from the menu below: ");
		System.out.println("==================================");
		System.out.println(" 1. List Fleet");
		System.out.println(" 2. Fly all jets");
		System.out.println(" 3. View fastest jet");
		System.out.println(" 4. View jet with longest range");
		System.out.println(" 5. Inspect all regulated jets");
		System.out.println(" 6. Zoom at target!");
		System.out.println(" 7. Add a jet to Fleet");
		System.out.println(" 8. Remove a jet from Fleet");
		System.out.println(" 9. Quit");
		System.out.println("==================================");
	}

	// switch statement method returns void
	// public void
	public void menuChoice(int choice) {
		switch (choice) {
		case 1:
			ja.listFleet();
			break;
		case 2:
			System.out.println("\nThe fleet has taken flight!\n");
			ja.flyAllJets();
			break;
		case 3:
			ja.viewFastestJet();
			break;
		case 4:
			ja.viewJetWithLongestRange();
			break;
		case 5:
			ja.inspectRegulatedJets();
			break;
		case 6:
			ja.chaseTarget();
			break;
		case 7:
			ja.addJetToFleet();
			break;
		case 8:
			ja.removeJetFromFleet();
			break;
		case 9:
			ja.quitApp();
			break;

		default:
			System.err.println("Not a valid choice. Choose again. \n");
		}
	}

	public void listFleet() {	
		System.out.println("\nThe Big Bad Fleet");
		System.out.println("=================");
		airField.listFleet();		
	}

	public void flyAllJets() {
		airField.flyAllJets();
	}
	
	public void viewFastestJet() {
		airField.viewFastestJet();
	}

	public void viewJetWithLongestRange() {
		airField.viewJetWithLongestRange();
	}

	public void inspectRegulatedJets() {
		airField.inspectRegulatedJets();
	}

	public void chaseTarget() {
		airField.chaseTarget();
	}

	public void addJetToFleet() {
		airField.addJetToFleet();
	}

	public void removeJetFromFleet() {
		airField.removeJetFromFleet();
	}

	public void quitApp() {
		runApp = false;
		System.out.println("\nThanks for visiting. Goodbye.\n");
	}

}
