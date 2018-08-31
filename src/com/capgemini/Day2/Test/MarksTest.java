package com.capgemini.Day2.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarksTest {

	@Test
	void testFindAllMarks() {
		assertEquals("Passed",Marks.calculateG(70,70,70));
		assertEquals("Promoted",Marks.calculateG(50,70,70));
		assertEquals("Failed",Marks.calculateG(50,50,50));
		
	}

}
