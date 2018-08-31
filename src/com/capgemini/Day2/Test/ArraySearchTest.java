package com.capgemini.Day2.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArraySearchTest {

	@Test
	void tests() {
		assertEquals(false,ArraySearch.searchElement(new int[] {1,2,3,4,5,6,7},6));
	}
	}


