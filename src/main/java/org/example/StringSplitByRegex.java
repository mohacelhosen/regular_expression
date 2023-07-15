package org.example;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringSplitByRegex {
    public static void main(String[] args) {
        String input = "🦢Welcome the 🐢world of Programming🐧";
        Pattern pattern = Pattern.compile("m");
        String[] splitText = pattern.split(input);
        Arrays.stream(splitText).forEach(System.out::println);
        System.out.println("-----------------------");
        String[] split = input.split(".");
        System.out.println(Arrays.toString(split));

    }
}
