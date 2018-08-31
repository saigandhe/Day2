package com.capgemini.Day2.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultidimentsionTest {

	@Test
	void test() {
		assertEquals(true, Multidimensional.search(new int [][] {{1,2,3,4},{4,5,6,7},{8,9,10,11}},10));
		
	}
	}


