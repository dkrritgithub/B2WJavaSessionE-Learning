package com.ust.java.swiggyorder;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a user profile with basic information and addresses.
 */
public class UserProfile {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String password;
	private List<Address> addresses;

	public UserProfile(int id, String firstName, String lastName, String email, String phoneNumber, String password) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.addresses = new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void addAddress(Address address) {
		this.addresses.add(address);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("User Name\tEmail Id\tContact Number\n");
		sb.append(firstName).append(" ").append(lastName).append("\t").append(email).append("\t").append(phoneNumber)
				.append("\n");
		sb.append("--------------------------------------------------------------------------------\n");

		int addressCount = 1;
		for (Address address : addresses) {
			sb.append(addressCount).append("\t").append(address.getDoorNumber()).append(", ")
					.append(address.getStreet()).append("\t").append(address.getMandal()).append("\t")
					.append(address.getCity()).append("\t").append(address.getPinCode()).append("\t").append("\n");
			addressCount++;
		}
		sb.append("--------------------------------------------------------------------------------\n");

		return sb.toString();
	}
}
