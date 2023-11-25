package com.awsravi.j8M;

public class String_EqualsComparision {
	public static void main(String[] args) {
		String s1 = "sunita";
		String s2 = "sunita";
		String s3 = new String("sunita");
		String s4 = new String("sunita");

		System.out.println("content comaprision :" + (s1.equals(s2)));
		System.out.println("content comaprision :" + (s1.equals(s3)));
		System.out.println("content comaprision :" + (s1.equals(s4)));

		System.out.println("content comaprision :" + (s3.equals(s1)));
		System.out.println("content comaprision :" + (s3.equals(s2)));
		System.out.println("content comaprision :" + (s3.equals(s4)));

		String str1 = "Hello";
		String str2 = "He" + "llo";
		str2 = str2.intern(); // Move to the constant pool

		System.out.println("Strings are equal  :" + (str1 == str2));

	}
}
