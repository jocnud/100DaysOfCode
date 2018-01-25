package strings;

import org.junit.Test;

import junit.framework.Assert;

public class ArrayRotateTest {

	@Test
	public void returnEmptyWhenEmptyArrayPassed() {
		ArrayUtils arrayUtils = new ArrayUtils();
		int result[] = arrayUtils.rotateArray(new int[] {}, 2);
		Assert.assertEquals(0, result.length);
	}

	@Test
	public void returnSameWhenEmptyArrayLengthIsOne() {
		ArrayUtils arrayUtils = new ArrayUtils();
		int result[] = arrayUtils.rotateArray(new int[] { 5 }, 2);
		Assert.assertEquals(1, result.length);
		Assert.assertEquals(result[0], 5);
	}

	@Test
	public void returnRotatedArray() {
		ArrayUtils arrayUtils = new ArrayUtils();
		int result[] = arrayUtils.rotateArray(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 2);
		Assert.assertEquals(3, result[0]);
		Assert.assertEquals(4, result[1]);
		Assert.assertEquals(5, result[2]);
		Assert.assertEquals(6, result[3]);
		Assert.assertEquals(7, result[4]);
		Assert.assertEquals(1, result[5]);
		Assert.assertEquals(2, result[6]);
		

	}
}
