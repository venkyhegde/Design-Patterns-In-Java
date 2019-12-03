package edu.uncc;

import java.util.Arrays;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String[] strArray = { "How", "To", "Do", "In", "Java" };
        String str = String.join(", ", Arrays.asList(strArray));
        CharSequence separator;
        StringJoiner stringJoiner = new StringJoiner(", ");
        for (String s: strArray){
            stringJoiner.add(s);
        }
        System.out.println(str);
        System.out.println(stringJoiner.toString());

    }
}
