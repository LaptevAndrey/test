import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Test {

    String text = "aba aba a!a abba adca abea";

    Pattern pattern = Pattern.compile("[a].{2}[a]");
    Matcher matcher = pattern.matcher(text);

}