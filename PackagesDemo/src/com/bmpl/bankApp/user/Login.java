package com.bmpl.bankApp.user;

public class Login {
	private String emailId;
	private String password;
	void loginUser() {
		User user = new User();
		System.out.println(user.acc_no);
		System.out.println("Phone : " + user.phoneNo);
	}
}
