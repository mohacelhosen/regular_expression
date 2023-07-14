package org.example;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExampleStartEndGroup {
    public static void main(String[] args) {
        String regex = "ab";
        String text = "abbabab";
        int count = 0;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println("index::"+matcher.start());
            count++;
        }
        System.out.println("Occurrence::"+count);
    }
}
