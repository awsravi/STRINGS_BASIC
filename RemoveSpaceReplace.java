package com.awsravi.string;


public class RemoveSpaceReplace {
    public static void main(String[] args) {
        String s = "ra  vi kum  a   r";

        
        String result = s.replace(" ", "");

        
        System.out.println("Original String: " + s);
        System.out.println("String after removing spaces: " + result);
    }
}
