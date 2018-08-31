package com.capgemini.Day2.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArmstrongTest {

	@Test
	void testfindAllArmstrongNumbers() {
	assertArrayEquals(new int[] {153,370,371,407,0},ArmstrongRange.findAllArmstrongNumbers(100,500));
	}

}
