package com.ust.java.swiggyorder;

import java.util.Scanner;

/**
 * The main application to manage user profiles and addresses.
 */
public class DriverApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserProfileDAO userProfileDAO = new UserProfileDAO();

		try {
			System.out.println("Enter User ID:");
			int userId = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			System.out.println("Enter User First Name:");
			String firstName = scanner.nextLine();

			System.out.println("Enter User Last Name:");
			String lastName = scanner.nextLine();

			System.out.println("Enter User Email:");
			String email = scanner.nextLine();

			System.out.println("Enter User Phone Number:");
			String phoneNumber = scanner.nextLine();

			System.out.println("Enter User Password:");
			String password = scanner.nextLine();

			UserProfile userProfile = new UserProfile(userId, firstName, lastName, email, phoneNumber, password);

			// Adding home address
			System.out.println("Enter Home Address:");
			Address homeAddress = getNewAddress(scanner);
			userProfile.addAddress(homeAddress);

			// Adding office address
			System.out.println("Enter Office Address:");
			Address officeAddress = getNewAddress(scanner);
			userProfile.addAddress(officeAddress);

			// Adding PG address
			System.out.println("Enter PG Address:");
			Address pgAddress = getNewAddress(scanner);
			userProfile.addAddress(pgAddress);

			userProfileDAO.addUserProfile(userProfile);

			System.out.println("User profile added successfully.");

			System.out.println("Do you want to display user profiles? (yes/no):");
			String displayOption = scanner.nextLine();

			if (displayOption.equalsIgnoreCase("yes")) {
				userProfileDAO.displayUserProfiles();
			}

		} catch (Exception e) {
			System.err.println("An error occurred: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}

	private static Address getNewAddress(Scanner scanner) {
		System.out.println("Enter Door Number:");
		String doorNumber = scanner.nextLine();

		System.out.println("Enter Street:");
		String street = scanner.nextLine();

		System.out.println("Enter Mandal:");
		String mandal = scanner.nextLine();

		System.out.println("Enter District:");
		String district = scanner.nextLine();

		System.out.println("Enter Pin Code:");
		String pinCode = scanner.nextLine();

		System.out.println("Enter City:");
		String city = scanner.nextLine();

		System.out.println("Enter State:");
		String state = scanner.nextLine();

		return new Address(doorNumber, street, mandal, district, pinCode, city, state);
	}
}
