package search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;

public class WordLadder {

	public static void main(String[] args) {
		List<String> dictionary = new CopyOnWriteArrayList<String>(
				Arrays.asList("BAT", "COT", "COG", "COW", "RAT", "BUT", "CUT"));

		String startWord = "CAT";
		String endWord = "DOG";

		dictionary.add(startWord);
		dictionary.add(endWord);

		Queue<WordNode> queue = new LinkedList<WordNode>();
		queue.add(new WordNode(startWord, 1));

		while (!queue.isEmpty()) {

			WordNode startNode = queue.peek();

			Iterator<String> dictItr = dictionary.iterator();

			while (dictItr.hasNext()) {
				String word = dictItr.next();

				if (!startNode.getData().equals(word)) {

					boolean quallified = isWordHasOneCharDifferenceWithAnotherWord(word, startNode.getData());

					if (quallified && !queue.contains(new WordNode(word, 0))) {
						queue.add(new WordNode(word, startNode.getDistance() + 1));
					}
				}
			}
			WordNode n = queue.remove();
			dictionary.remove(n.getData());

			System.out.print(n + " >> ");

			if (n.getData().equals(endWord)) {
				System.out.println("Resut " + n.getDistance());
			}

		}

	}

	private static boolean isWordHasOneCharDifferenceWithAnotherWord(String word, String startWord) {

		char startWordArr[] = startWord.toCharArray();

		int count = 0;
		for (char c : startWordArr) {

			if (!word.contains(Character.toString(c))) {
				count++;
			}
		}
		return (count == 1);
	}
}

class WordNode {

	private String data;
	private Integer distance;

	public WordNode(String data, Integer distance) {
		this.data = data;
		this.distance = distance;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WordNode other = (WordNode) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[data=" + data + ", distance=" + distance + "]";
	}

}
