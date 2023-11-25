package com.awsravi.j8M;

public class String_ReferencComparision{
	public static void main(String[] args) {
		
	String s1 = "sunita";
	String s2 = "sunita";
	String s3 = new String("sunita");
	String s4 = new String("sunita");

	System.out.println("Reference scp use :" + (s1 == s2));
	System.out.println("Reference scp use :" + (s2 == s1));

	System.out.println("Reference scp with heap :" + (s1 == s3));
	System.out.println("Reference scp with heap :" + (s1 == s4));
	System.out.println("Reference scp with heap :" + (s2 == s3));
	System.out.println("Reference scp with heap :" + (s2 == s4));

	System.out.println("Reference scp with heap :" + (s3 == s1));
	System.out.println("Reference scp with heap :" + (s3 == s2));
	System.out.println("Reference heap :" + (s3 == s4));
}
}