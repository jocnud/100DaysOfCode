package strings;

import java.util.HashMap;
import java.util.Map;

public class StringUtils {

	private static final String EMPTY_STRING = "";
	private String input;

	public StringUtils(String input) {
		this.input = input;
	}

	public String findDuplicates() {

		if (input == null || input.equals(EMPTY_STRING))
			return EMPTY_STRING;

		if (input.length() == 1)
			return input;

		Map<Character, Integer> frequency = getCharFrequency(input);

		StringBuilder resultBuilder = new StringBuilder();
		for (Character c : frequency.keySet()) {
			if (frequency.get(c) > 1)
				resultBuilder.append(c);
		}
		return resultBuilder.toString();
	}

	public Map<Character, Integer> getCharFrequency(String input) {

		Map<Character, Integer> charFrequency = new HashMap<Character, Integer>();
		for (char c : input.toCharArray()) {
			if (charFrequency.containsKey(c))
				charFrequency.put(c, charFrequency.get(c).intValue() + 1);
			else
				charFrequency.put(c, 1);
		}

		return charFrequency;
	}

	public boolean isAnagram(String str) {
		if (isBlank(str) || isBlank(input))
			return false;

		if (str.length() != input.length())
			return false;

		char charArr[] = input.toLowerCase().toCharArray();
		for (char c : charArr) {
			if (str.toLowerCase().indexOf(c) == -1)
				return false;
		}

		return true;
	}

	private boolean isBlank(String str) {
		return str == null || str.equals("");
	}
}
