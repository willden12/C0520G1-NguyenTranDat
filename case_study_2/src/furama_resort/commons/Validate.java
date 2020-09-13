package furama_resort.commons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static Pattern pattern;
    private static Matcher matcher;
    public static boolean check(String str, String regex){
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(str);
        boolean check = matcher.matches();
        if (!check){
            System.out.println("Input is wrong---" + regex);
        }
        return check;
    }
}
