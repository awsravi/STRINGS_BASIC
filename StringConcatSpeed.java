package com.awsravi.string;

public class StringConcatSpeed {
public static void main(String[] args) {
	
	long starttime=System.currentTimeMillis();
	
	String str="sunita";
	for(int i =0;i<50000;i++) {
		str=str+i;
		//System.out.println(str);
	}
	
	long endtime=System.currentTimeMillis();
	
	System.out.println("Total time : "+(endtime-starttime ));
}
}
