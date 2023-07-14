package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  \s --> white space
 *  \S --> Except white space
 *  \d --> Any digit
 *  \D --> Except any digit
 *  \w --> Any word [a-zA-Z0-9]
 *  \W --> Except any word [^a-zA-Z0-9]
 *  . --> any character alphanumeric+special ([a-zA-Z0-9]+[^a-zA-Z0-9])
 *
 *
 */
public class PredefineCharacter {
    public static void main(String[] args) {
        String spaceRegex = "\\s"; //find only white space
        String exceptSpaceRegex = "\\S"; //find any charter except white space
        String digitRegex = "\\d"; // find any character as digit [0-9]
        String exceptDigitRegex = "\\D"; // find any character except digit [^0-9]
        String wordRegex = "\\w"; // find any word that contain only [a-zA-Z0-9]
        String exceptWordRegex = "\\W"; // find any word that except alphanumeric [^a-zA-Z0-9]
        String anyCharacterRegex = "."; // find any character (alphanumeric+special)
        String input= "W3lC0m3 B@ck, @gent 🤫";
        int count = 0;

        Pattern pattern = Pattern.compile(wordRegex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            count++;
            System.out.println("Start index::"+matcher.start()+"  match string::"+matcher.group());
        }
        System.out.println("Total character::"+count);
    }
}
