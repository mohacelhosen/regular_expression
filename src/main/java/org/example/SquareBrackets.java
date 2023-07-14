package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**

   [ ] (square brackets): Defines a character class, matching any single character within the brackets.
   [^] (caret within square brackets): Defines an except this character class , matching any single character not in the brackets.
   [^a-zA-Z0-9] mean any symbols/character which doesn't match lower_case alphabet and upper_case and also digit ex:: #$%

 **/
public class SquareBrackets {
    public static void main(String[] args) {
        String regex = "[abc]"; // search single character  either 'a' or 'b' or 'c'
        String input = "$b@c709a";

        Pattern pattern= Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            System.out.println("Start index::"+matcher.start()+"  Matching String::"+matcher.group());
        }
    }
}
