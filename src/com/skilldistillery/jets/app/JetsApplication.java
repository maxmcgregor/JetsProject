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

	public void menuChoice(int choice) {
		switch (choice) {
		case 1:
			System.out.println("\nThe Big Bad Fleet");
			System.out.println("=================");
			airField.listFleet();
			break;
		case 2:
			System.out.println("\nThe fleet has taken flight!\n");
			airField.flyAllJets();
			break;
		case 3:
			airField.viewFastestJet();
			break;
		case 4:
			airField.viewJetWithLongestRange();
			break;
		case 5:
			airField.inspectRegulatedJets();
			break;
		case 6:
			airField.chaseTarget();
			break;
		case 7:
			airField.addJetToFleet();
			break;
		case 8:
			airField.removeJetFromFleet();
			break;
		case 9:
			ja.quitApp();
			break;

		default:
			System.err.println("Not a valid choice. Choose again. \n");
		}
	}

	public void quitApp() {
		runApp = false;
		System.out.println("\nThanks for visiting. Goodbye.\n");
	}

}
