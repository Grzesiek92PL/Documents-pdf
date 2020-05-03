package pl.idzikpro.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {
    public static void main(String[] args) {
        //Czy pierwsze trzy znaki są dowolne, zaś następne 3 znaki tylko cyframi?
        System.out.println(Pattern.matches(".{3}[0-9]{3}","abc345"));

        //Czy string zawiera tylko cyfry?
        System.out.println(Pattern.matches("[0-9]+","545"));

        //Czy string zawiera tylko litery?
        System.out.println(Pattern.matches("[a-zA-z]+","a"));

        //Czy string zawiera tylko cyfry i litery?
        System.out.println(Pattern.matches("\\w+","3443dfdf"));

        //Czy string zawiera tylko cyfry i ma dokładnie 5 znaków?
        System.out.println(Pattern.matches("[0-9]{5}","12345"));

        //Czy string rozpoczyna się od "J"?
        System.out.println(Pattern.matches("J.*","J"));

        //Czy string rozpoczyna się od "J" i kończy na "U"?
        System.out.println(Pattern.matches("J.*U","J5UUU"));

        //Czy string rozpoczyna się od wielkiej litery?
        System.out.println(Pattern.matches("[A-Z].*","Ala"));

        //Czy string zawiera spację? (biały znak)?
        System.out.println(Pattern.matches(".*\\p{Space}.*","g  g"));

        //Czy string jest numerem telefonu zaczynającym się od 7 lub 8 lub 9?
        System.out.println(Pattern.matches("[7-9][0-9]{8}","777777777"));

        //Czy string jest numerem bankowym? (Zakładając, że zaczyna się od dwóch liter, następnie 4 grupy po 4 cyfry)
        System.out.println(Pattern.matches("[a-zA-Z]{2}([0-9]{4}){4}","ab1234123412341234"));

        //Czy string jest kodem pocztowym?
        System.out.println(Pattern.matches("[0-9]{2}-[0-9]{3}","20-133"));

        Pattern pattern= Pattern.compile("[0-9]");
        Matcher matcher=pattern.matcher("121212212");
        System.out.println(matcher.matches());

        System.out.print(Pattern.matches("[0-9]", "32323"));

    }
}
