package com.hcl.abc;

import com.hcl.xyz.*;

public class AbcMain extends SecretString {

	public static void main(String[] args) {
		AbcMain say = new AbcMain();
		say.displaySecret();
		SecretString password = new SecretString();
		System.out.println(password.getAlsoSecret());

	}

}
