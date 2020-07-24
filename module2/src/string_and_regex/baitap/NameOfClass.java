package string_and_regex.baitap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameOfClass {
    private static Pattern pattern;
    private static final String  NAME_CLASS_REGEX = "^[ACP][0-9]{4}[GHIKLM]$";
    public NameOfClass() {
        pattern = Pattern.compile(NAME_CLASS_REGEX);
    }
    public boolean validate(String regex){
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
