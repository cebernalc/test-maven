package com.cisco.test_maven;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SumTest extends TestCase {

	public void testSum() {
		int expected = 5;
		Assert.assertEquals(expected, Sum.sum(1, 1, 1, 1, 1));
//		fail("Not yet implemented");
	}

}
