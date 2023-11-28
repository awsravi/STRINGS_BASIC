package com.awsravi.string;

import java.util.StringTokenizer;

public class RemoveSpacesS_Tokenizer {
	public static void main(String[] args) {
		String s = "ravi    ku  mar    k";

		StringTokenizer tokenizer = new StringTokenizer(s, " ");
		StringBuilder result = new StringBuilder();

		while (tokenizer.hasMoreTokens()) {
			result.append(tokenizer.nextToken());
		}

		String stringWithoutSpaces = result.toString();

		System.out.println("Original String: " + s);
		System.out.println("String without spaces: " + stringWithoutSpaces);
	}
}
