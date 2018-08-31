package com.capgemini.Day2.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AbsdiffTest {

	@Test
	void test() {
		int input[]= {1,2,4,5,2,3};
		assertEquals(1, Absdiff.check(input,3));
		assertEquals(0, Absdiff.check(input,1));
		assertEquals(0, Absdiff.check(input,2));
	}
	}


