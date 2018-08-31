package com.capgemini.Day2.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquarenumberTest {

	@Test
	void testcheckSquarenumber() {
		assertEquals(121,Square.checkSquarenumber(11));
		assertEquals(256,Square.checkSquarenumber(16));
		assertEquals(25,Square.checkSquarenumber(5));
		
	}

}
