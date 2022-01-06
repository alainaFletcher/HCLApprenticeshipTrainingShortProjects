package com.hcl.xyz;

public class SecretString {
	protected String secret = "hello world";
	private String alsoSecret = "password";

	protected void displaySecret() {
		System.out.println(secret);
	}

	public String getAlsoSecret() {
		return alsoSecret;
	}
}
