package strings;

import org.junit.Test;

import junit.framework.Assert;

public class IsomorphicTest {

	@Test
	public void returnTrue() {
		StringUtils utils = new StringUtils("aab");
		Assert.assertTrue(utils.isIsomorphic("xzz"));
	}

}
