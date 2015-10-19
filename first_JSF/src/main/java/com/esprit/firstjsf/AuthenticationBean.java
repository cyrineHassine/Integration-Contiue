package com.esprit.firstjsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class AuthenticationBean {

	private String login;
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String validUser() {

		if (login.equals("admin") && password.equals("admin")) {

			return "success?faces-redirect=true";

		}

		return "failure?faces-redirect=true";

	}

}
