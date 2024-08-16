package com.ust.java.swiggyorder;

import java.util.ArrayList;
import java.util.List;

/**
 * Data Access Object for user profiles.
 */
public class UserProfileDAO {
	private List<UserProfile> userProfiles;

	public UserProfileDAO() {
		this.userProfiles = new ArrayList<>();
	}

	public void addUserProfile(UserProfile userProfile) {
		this.userProfiles.add(userProfile);
	}

	public void displayUserProfiles() {
		for (UserProfile userProfile : userProfiles) {
			System.out.println(userProfile);
		}
	}
}
