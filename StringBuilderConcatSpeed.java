package com.awsravi.string;

public class StringBuilderConcatSpeed {
public static void main(String[] args) {
	
	long starttime=System.currentTimeMillis();
	StringBuilder builder=new StringBuilder("sunita");
	for(int i=0;i<50000;i++) {
		builder=builder.append(i);
		
	}
	long endtime=System.currentTimeMillis();
	System.out.println("Speed check :"+(endtime-starttime));
}
}
