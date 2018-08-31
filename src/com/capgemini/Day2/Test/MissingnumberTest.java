package com.capgemini.Day2.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MissingnumberTest {

	@Test
	void testMissingnumber() {
		assertEquals(2,Missingnumber.MissingNumber(new int[] {0,1,3,4,5},6));
	}

}
