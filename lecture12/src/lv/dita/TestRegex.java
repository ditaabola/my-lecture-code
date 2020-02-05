package lv.dita;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	public static void main(String[] args) {
		String inputStr = "abc038u030_9";
		String regexStrExp = "[a-z]+";

		System.out.println(inputStr.charAt(0)); // String ir character sequence,
												// saadi var dabuut konkretu
												// simbolu masiivaa
		System.out.println(inputStr.charAt(1));

		Pattern pattern = Pattern.compile(regexStrExp);
		Matcher matcher = pattern.matcher(inputStr);

//		while (matcher.find()) {
//			System.out.println("find() found substring " + matcher.group());

//		}
		String replaceSymbols = "lv";
		String outputString = matcher.replaceFirst(replaceSymbols);
		System.out.println(outputString);
	}

}
