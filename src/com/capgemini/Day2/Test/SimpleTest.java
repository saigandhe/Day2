package com.capgemini.Day2.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleTest {

	@Test
		void testfindRateOfInterest() {
			assertEquals(40.0,Simple.findRateOfInterest(1000.0,2,2));
			assertEquals(30.0,Simple.findRateOfInterest(500.0,2,3));
			
		}

	}

