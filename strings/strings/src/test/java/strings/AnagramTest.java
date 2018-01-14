package strings;

import org.junit.Test;

import junit.framework.Assert;

public class AnagramTest {

	@Test
	public void returnFalseIfStringEmptyOrNull() {
		StringUtils utils = new StringUtils(null);
		Assert.assertEquals(utils.isAnagram(""), false);
	}
	
	@Test
	public void returnFalseIfTwoStringAreNotEqualInLength() {
		StringUtils utils = new StringUtils("history");
		Assert.assertEquals(utils.isAnagram("his"), false);
	}
	
	@Test
	public void returnFlaseIfAnagramNotFound() {
		StringUtils utils = new StringUtils("history");
		Assert.assertEquals(utils.isAnagram("mystory"), false);
	}
	
	@Test
	public void returnTrueIfAnagramFound() {
		StringUtils utils = new StringUtils("mary");
		Assert.assertEquals(utils.isAnagram("army"), true);
	}
	
	@Test
	public void returnTrueIfAnagramFoundCamelCase() {
		StringUtils utils = new StringUtils("mAry");
		Assert.assertEquals(utils.isAnagram("aRmy"), true);
	}
}
