package com.capgemini.Day2.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BubbleTest {

	@Test
	void test() {
		assertArrayEquals(new int[] {1,5,6,7,12,14,19,23,26,35,37,47,52,78,86}, Bubble.findAllBubbleNumbers(new int[]{5,12,14,6,78,19,1,23,26,35,37,7,52,86,47}));
	}

	}


