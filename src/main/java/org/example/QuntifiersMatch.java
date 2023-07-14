package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  + --> at least one or more occurrences
 *  * -->  zero or more occurrences
 *  ? --> utmost 1 (maximum-1 occurrence and minimum-0 occurrence)
 *
 */
public class QuntifiersMatch {
    public static void main(String[] args) {
        // single emoji takes 2 index number and index_number start from 0
        // if emoji place in 5th position then index will be (8 and 9)
        String plusRegex = "🐧+"; //find 1 or more number of occurrences
        String asteriskRegex = "🐧*"; // find 0 or more number of occurrences
        String questionRegex = "🐧?"; // find 0 or 1 occurrences,

        String input = "🐧🦅🦅🐪🐧🐧🐪🐧🐬🦖🐧🐧🐧🐧";
        int count=0;

        Pattern pattern = Pattern.compile(questionRegex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            count++;
            System.out.println("Start index::"+matcher.start()+"   Match String::"+matcher.group());
            //at that position exist or blank(zero number)
        }
        System.out.println("Input Length::"+input.length());
        System.out.println("Pattern Match::"+count+" times");
    }
}
