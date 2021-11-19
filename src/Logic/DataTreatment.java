package Logic;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class DataTreatment {
	public static int countWords(String msj) {

		int spaces = 1;
		String word = msj;

		word = word.trim();
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == ' ') {
				spaces++;
			}
		}

		return spaces;

	}

	public static String llenarCaracteres(String cadena, char charToAdd, int numrepe, int orientation) {

		for (int i = 0; i < numrepe; i++) {
			if (orientation == 1) {
				cadena = cadena + charToAdd;
			} else {
				cadena = charToAdd + cadena;
			}
		}
		return cadena;
	}

	public static String ownName(String name) {
		// name = "universidad pedagogica y tecnologica de colombia";

		StringBuffer strbf = new StringBuffer();
		Matcher match = Pattern.compile("([a-z])([a-z]*)", Pattern.CASE_INSENSITIVE).matcher(name);
		while (match.find()) {
			match.appendReplacement(strbf, match.group(1).toUpperCase() + match.group(2).toLowerCase());
		}
		name = match.appendTail(strbf).toString();
		return name;

	}

	public static String erase(String word, String MyString) {

		MyString = MyString.replace(word, "");

		return MyString;
	}

	public static String removeRepeats(String MyString, String word) {

		MyString = MyString.replace(word, "");

		return MyString;
	}

	public static int countVowels(String word) {
		// String word = "COCOA";
		System.out.println(word);
		int cont = 0;
		for (int i = 0; i < word.length(); i++) {
			word.toUpperCase();
			if ((word.charAt(i) == 'a') || (word.charAt(i) == 'e') || (word.charAt(i) == 'i') || (word.charAt(i) == 'o')
					|| (word.charAt(i) == 'u')) {
				cont++;
			}
		}
		return cont;

	}
	

}
