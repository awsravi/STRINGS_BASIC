package com.awsravi.string;

public class StringBufferConcatSpeed {

	public static void main(String[] args) {
		long starttime = System.currentTimeMillis();

		StringBuffer buffer = new StringBuffer("sunita");
		for (int i = 0; i < 50000; i++) {

			buffer = buffer.append(i);

		}
		long endtime = System.currentTimeMillis();
		System.out.println("Total time :" + (endtime - starttime));
	}

}
