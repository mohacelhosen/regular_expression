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
        String regex = "[abc]"; // search any single character either 'a' or 'b' or 'c'
        String exceptRegex = "[^abc]"; // search any single character except 'a' or 'b' or 'c'
        String exceptAlphabetRegex = "[^a-zA-Z]"; // search any single character except alphabet
        String exceptDigitRegex = "[^0-9]"; // search any single character except digit
        String exceptAlphaNumericRegex = "[^a-zA-Z0-9]"; // search any single character except AlphaNumeric
        String alphaNumericRegex = "[a-zA-Z0-9]"; // search any single character of AlphaNumeric
        String input = "$b@c709a";

        Pattern pattern= Pattern.compile(alphaNumericRegex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            System.out.println("Start index::"+matcher.start()+"  Matching String::"+matcher.group());
        }
    }
}
