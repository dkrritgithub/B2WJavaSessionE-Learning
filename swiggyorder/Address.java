package com.ust.java.swiggyorder;

/**
 * Represents an address with detailed location information.
 */
public class Address {
	private String doorNumber;
	private String street;
	private String mandal;
	private String district;
	private String pinCode;
	private String city;
	private String state;

	/**
	 * Constructs an address object with specified details.
	 *
	 * @param doorNumber The door number of the address
	 * @param street     The street name
	 * @param mandal     The mandal or locality
	 * @param district   The district or area
	 * @param pinCode    The postal code
	 * @param city       The city
	 * @param state      The state or region
	 */
	public Address(String doorNumber, String street, String mandal, String district, String pinCode, String city,
			String state) {
		this.doorNumber = doorNumber;
		this.street = street;
		this.mandal = mandal;
		this.district = district;
		this.pinCode = pinCode;
		this.city = city;
		this.state = state;
	}

	public String getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getMandal() {
		return mandal;
	}

	public void setMandal(String mandal) {
		this.mandal = mandal;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return String.format("%s, %s, %s, %s, %s, %s, %s", doorNumber, street, mandal, district, pinCode, city, state);
	}
}
