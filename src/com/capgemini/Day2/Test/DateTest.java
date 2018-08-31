package com.capgemini.Day2.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

	@Test
	void testcheckDate() {
		assertEquals("15/June/1995",Date.checkDate(15,06,1995));
		assertEquals("16/May/1995",Date.checkDate(16,05,1995));
	}

}
