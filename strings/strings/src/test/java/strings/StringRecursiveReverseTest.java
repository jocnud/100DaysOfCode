package strings;

import org.junit.Test;

import junit.framework.Assert;

public class StringRecursiveReverseTest {

	@Test
	public void returnEmptyStringWhenNullOrEmptyPassed() {
		StringUtils utils = new StringUtils("");
		Assert.assertSame("", utils.reverse());
	}

	@Test
	public void returnSameStringWhenOneChar() {
		StringUtils utils = new StringUtils("a");
		Assert.assertSame("a", utils.reverse());
	}

	@Test
	public void returnReversedString() {
		StringUtils utils = new StringUtils("abc");
		Assert.assertTrue("cba".equals(utils.reverse()));
	}

}
