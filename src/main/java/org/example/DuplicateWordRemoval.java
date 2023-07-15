package org.example;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class DuplicateWordRemoval {
    public static void main(String[] args) {
        String input = "I love Love to To  tO code";
        Pattern pattern = Pattern.compile("\\b(\\w+)(\\b\\W+\\b\\1\\b)*", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);

        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            result.append(matcher.group(1)).append(" ");
        }

        String output = result.toString().trim();
        System.out.println(output);
    }

}
