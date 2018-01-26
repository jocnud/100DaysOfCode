package strings;

import java.util.HashMap;
import java.util.Map;

public class StringUtils {

	private static final String EMPTY_STRING = "";
	private String input;

	public StringUtils(String input) {
		this.input = input;
	}

	public boolean isIsomorphic(String str) {

		if (isBlank(str) || isBlank(str))
			return false;
		if (str.length() != input.length())
			return false;

		Map<Character, Character> map = new HashMap<Character, Character>();

		for (int i = 0; i < str.length(); i++) {

			char givenChar = str.charAt(i);
			char inputChar = input.charAt(i);

			if (map.containsKey(givenChar)) {
				if (map.get(givenChar) != inputChar)
					return false;
			}

			map.put(givenChar, inputChar);
		}

		return true;
	}

	/**
	 * 
	 * @return
	 */
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

	/**
	 * 
	 * @param input
	 * @return
	 */
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

	/**
	 * 
	 * @param str
	 * @return
	 */
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

	/**
	 * 
	 * @return
	 */
	public String reverse() {
		if (isBlank(input))
			return "";
		if (input.length() == 1)
			return input;

		return recursiveReverse("", input);

	}

	private String recursiveReverse(String result, String left) {
		if (left.length() == 0)
			return result;
		return recursiveReverse(result + left.charAt(left.length() - 1), left.substring(0, left.length() - 1));
	}

	private boolean isBlank(String str) {
		return str == null || str.equals("");
	}
}
