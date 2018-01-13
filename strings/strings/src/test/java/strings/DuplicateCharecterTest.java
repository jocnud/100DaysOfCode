package strings;

import org.junit.Test;

import junit.framework.Assert;

public class DuplicateCharecterTest {

	@Test
	public void returnEmptyStringWhenNullOrEmptyPassed() {
		StringUtils utils = new StringUtils("");
		Assert.assertSame("", utils.findDuplicates());
	}

	@Test
	public void returnSameStringWhenLengthIsOne() {
		StringUtils utils = new StringUtils("a");
		Assert.assertSame("a", utils.findDuplicates());
	}

	@Test
	public void returnsDuplicateCharecters() {
		StringUtils utils = new StringUtils("Java");
		Assert.assertTrue("a".equals(utils.findDuplicates()));
	}

	@Test
	public void returnsMutipleDuplicateCharecters() {
		StringUtils utils2 = new StringUtils("abccdeaac");
		String result = utils2.findDuplicates();
		Assert.assertTrue("ac".equals(result));
	}
}
